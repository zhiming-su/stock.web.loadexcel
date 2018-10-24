package com.xiyu.stock.web.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import com.xiyu.stock.web.model.FileInfo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Controller
public class UploadController {
	
	//@Autowired
	//private SecurityCodeRepository sjt;
	
	public static List<FileInfo> fileInfo= new ArrayList<FileInfo>();
	
	private SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	
	//private SecurityCodeExcel sce = new SecurityCodeExcel();
    //Save the uploaded file to this folder
	@Value("${stock.file.path}")
	public static String UPLOADED_FOLDER;

    
    @RequestMapping(path = "/")
    public String index(Model model) {
    	fileInfo.sort((FileInfo fi1, FileInfo fi2) ->fi2.getDate().compareTo(fi1.getDate()));
    	model.addAttribute("fileInfos", fileInfo);
        return "index";
    }
    
    @RequestMapping(path = "/upload")
    public String upload(Model model) {

    	String[] stockType= {"证券代码更新","证券代码新增","公司行业分类","公司代码更新"};
    	model.addAttribute("stockType", stockType);
        return "upload";
    }
    @ResponseBody
    @GetMapping(value = "/load")
    public String load( MultipartFile file) throws FileNotFoundException, IOException {
    	System.out.println("index ddfadfaf ");
        return "upload";
    }
    @PostMapping("/upload") // //new annotation since 4.3
    public String singleFileUpload(@RequestParam("type") String type,@RequestParam("file") MultipartFile file,RedirectAttributes redirectAttributes) throws FileNotFoundException, IOException {
    	//System.out.println(type);
        if (file.isEmpty()) {
            redirectAttributes.addFlashAttribute("message", "Please select a file to upload");
            return "redirect:uploadStatus";
        }

        try {

            // Get the file and save it somewhere
            byte[] bytes = file.getBytes();
            Path path = Paths.get(UPLOADED_FOLDER + file.getOriginalFilename());
            Files.write(path, bytes);

            redirectAttributes.addFlashAttribute("message",
                    "You successfully uploaded '" + file.getOriginalFilename() + "'");

        } catch (IOException e) {
            e.printStackTrace();
        }
    // sjt.count();
     // sjt.saveAll(sce.read(Paths.get(UPLOADED_FOLDER + file.getOriginalFilename()).toString()));
      FileInfo fi = new FileInfo();
      fi.setName(file.getOriginalFilename());
      fi.setFileType(type);
      fi.setStatus("已上传");
      fi.setFlag("0");
      fi.setDate(df.format(Calendar.getInstance().getTime()));
      fileInfo.add(fi);
        return "redirect:/";
    }

	@GetMapping("/uploadStatus")
    public String uploadStatus() {
        return "uploadStatus";
    }

}