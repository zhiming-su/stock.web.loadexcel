package com.xiyu.stock.web.schedulix;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.ListIterator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import com.xiyu.stock.web.controller.UploadController;
import com.xiyu.stock.web.model.FileInfo;
import com.xiyu.stock.web.model.GongSiDaiMa;
import com.xiyu.stock.web.repository.GongSiDaiMaRepository;
import com.xiyu.stock.web.repository.GongSiHangYeRepository;
import com.xiyu.stock.web.repository.InfoGongSiDaiMaRepository;
import com.xiyu.stock.web.repository.InfoGongSiHangYeRepository;
import com.xiyu.stock.web.repository.InfoZhengQuanDaiMaSFRepository;
import com.xiyu.stock.web.repository.InfoZhengQuanDaiMaSSRepository;
import com.xiyu.stock.web.repository.ZhengQuanDaiMaSFRepository;
import com.xiyu.stock.web.repository.ZhengQuanDaiMaSSRepository;
import com.xiyu.stock.web.util.GongSiDaiMaExcel;
import com.xiyu.stock.web.util.GongSiHangYeExcel;
import com.xiyu.stock.web.util.ZhengQuanDaiMaSFExcel;
import com.xiyu.stock.web.util.ZhengQuanDaiMaSSExcel;

//import com.xiyu.schedulix.model.WenJian;

@Component
@EnableScheduling
public class SchedulixSecurityCodeJob {

	Logger logger = LoggerFactory.getLogger(getClass());
	
	//@Autowired
	//private SecurityCodeRepository sjt;
	
	@Autowired
	private GongSiHangYeRepository gshyr;
	
	@Autowired
	private ZhengQuanDaiMaSFRepository zqdmsfr;
	
	@Autowired
	private ZhengQuanDaiMaSSRepository zqdmssr;
	
	@Autowired
	private GongSiDaiMaRepository gsdmr;
	
	@Autowired
	private InfoGongSiHangYeRepository igshyr;
	
	@Autowired
	private InfoZhengQuanDaiMaSFRepository izqdmsfr;
	
	@Autowired
	private InfoZhengQuanDaiMaSSRepository izqdmssr;
	
	@Autowired
	private InfoGongSiDaiMaRepository igsdmr;

	//private SecurityCodeExcel sce = new SecurityCodeExcel();
	
	private GongSiHangYeExcel gshye = new GongSiHangYeExcel();
	
	private ZhengQuanDaiMaSFExcel zqdmsfe = new ZhengQuanDaiMaSFExcel();
	
	private ZhengQuanDaiMaSSExcel zqdmsse = new ZhengQuanDaiMaSSExcel();
	
	private GongSiDaiMaExcel gsdme = new GongSiDaiMaExcel();

	

	@Scheduled(fixedDelay = 10)
	public void checkJobStatus() throws FileNotFoundException, IOException, ParseException {
		
		synchronized (UploadController.fileInfo) {
			FileInfo fi = new FileInfo();
			ListIterator<FileInfo> lt = UploadController.fileInfo.listIterator();
			while(lt.hasNext()) {
				fi= (FileInfo) lt.next();
				if(fi.getStatus().equals("已上传") && fi.getFlag().equals("0")) {
					fi.setFlag("1");
					lt.set(fi);
					switch (fi.getFileType()) {
					case "证券代码更新": 						
						zqdmssr.saveAll(zqdmsse.read(Paths.get(UploadController.UPLOADED_FOLDER + fi.getName()).toString()));
						izqdmssr.saveAll(zqdmsse.readInfo(Paths.get(UploadController.UPLOADED_FOLDER + fi.getName()).toString()));
						break;
					case "证券代码新增": 
						zqdmsfr.saveAll(zqdmsfe.read(Paths.get(UploadController.UPLOADED_FOLDER + fi.getName()).toString()));
						izqdmsfr.saveAll(zqdmsfe.readInfo(Paths.get(UploadController.UPLOADED_FOLDER + fi.getName()).toString()));
						break;
					case "公司行业分类": 
						gshyr.saveAll(gshye.read(Paths.get(UploadController.UPLOADED_FOLDER + fi.getName()).toString()));
						igshyr.saveAll(gshye.readInfo(Paths.get(UploadController.UPLOADED_FOLDER + fi.getName()).toString()));
						break; 
					case "公司代码更新": 
						ArrayList<GongSiDaiMa> al=(ArrayList<GongSiDaiMa>) gsdme.read(Paths.get(UploadController.UPLOADED_FOLDER + fi.getName()).toString());
						
						for(GongSiDaiMa gsInfo : al) {
							//id.append("'"+gsInfo.getGONGSI_ID()+"',");
							gsdmr.delByGongSiID(gsInfo.getGONGSI_ID());
							igsdmr.delByGongSiID(gsInfo.getGONGSI_ID());
						}
						//gsdmr.delByGongSiID(id.toString().replaceAll(",$", ""));
						gsdmr.saveAll(gsdme.read(Paths.get(UploadController.UPLOADED_FOLDER + fi.getName()).toString()));
						igsdmr.saveAll(gsdme.readInfo(Paths.get(UploadController.UPLOADED_FOLDER + fi.getName()).toString()));
						break; 

					}
					//sjt.saveAll(sce.read(Paths.get(UploadController.UPLOADED_FOLDER + fi.getName()).toString()));
					logger.info(fi.getName()+"更新完成！");
					fi.setStatus("更新完成");
					
					try {
						lt.set(fi);
					} catch (Exception e) {
						
						//e.printStackTrace();
					}						
				}else {
					
				}
			}
		}
	}

}
