package com.xiyu.stock.web.util;

import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.xiyu.stock.web.model.InfoZhengQuanDaiMaSF;
import com.xiyu.stock.web.model.ZhengQuanDaiMaSF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ZhengQuanDaiMaSFExcel {

	public List<ZhengQuanDaiMaSF> read(String filename) throws FileNotFoundException, IOException {
		Workbook workbook = new XSSFWorkbook(new FileInputStream(filename));
		List<ZhengQuanDaiMaSF> list = new ArrayList<ZhengQuanDaiMaSF>();
		int num = workbook.getNumberOfSheets();
		for (int page = 0; page < num; page++) {
			Sheet sheet = workbook.getSheetAt(page);

			for (Row row : sheet) {
				if (row.getRowNum() >= 1 && row.getCell(0).toString() !="") {
					ZhengQuanDaiMaSF sr = new ZhengQuanDaiMaSF();
					for (Cell cell : row) {
						// StringBuilder sb = new StringBuilder();
					

							String value = cell.toString();

							switch (cell.getCellType()) {
							case Cell.CELL_TYPE_NUMERIC: // 数字
								if (HSSFDateUtil.isCellDateFormatted(cell)) {
									SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
									Date date = cell.getDateCellValue();
									value = sdf.format(date).trim();
								} else {
									DecimalFormat df = new DecimalFormat("0");
									value = df.format(cell.getNumericCellValue()).trim();
								}

								break;
							case Cell.CELL_TYPE_STRING: // 字符串
								value = cell.getStringCellValue();
								break;

							}
							// System.out.println(value);

							switch (cell.getColumnIndex()) {
							case 0:
								sr.setZHENGQUAN_ID(value);
								break;
							case 1:
								sr.setZHENGQUAN_JC(value);
								break;
							case 2:
								sr.setIsValid(value);
								break;
							case 3:
								sr.setPINYIN_JC(value);
								break;
							case 4:
								sr.setGONGSI_ID(value);
								break;
							case 5:
								sr.setJIAOYI_DD(value);
								break;
							case 6:
								sr.setZHENGQUAN_LX(value);
								break;
							case 7:
								sr.setJIAOYI_ID(value);
								break;
							case 8:
								sr.setSHANGSHI_ZT(value);
								break;
							case 9:
								sr.setMARK_ID(value);
								break;

							}

						}
					
						list.add(sr);
					
					
				}

			}
		}
		return list;
	}
	public List<InfoZhengQuanDaiMaSF> readInfo(String filename) throws FileNotFoundException, IOException {
		Workbook workbook = new XSSFWorkbook(new FileInputStream(filename));
		List<InfoZhengQuanDaiMaSF> list = new ArrayList<InfoZhengQuanDaiMaSF>();
		int num = workbook.getNumberOfSheets();
		for (int page = 0; page < num; page++) {
			Sheet sheet = workbook.getSheetAt(page);

			for (Row row : sheet) {
				if (row.getRowNum() >= 1 && row.getCell(0).toString() !="") {
					InfoZhengQuanDaiMaSF sr = new InfoZhengQuanDaiMaSF();
					for (Cell cell : row) {
						// StringBuilder sb = new StringBuilder();
					

							String value = cell.toString();

							switch (cell.getCellType()) {
							case Cell.CELL_TYPE_NUMERIC: // 数字
								if (HSSFDateUtil.isCellDateFormatted(cell)) {
									SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
									Date date = cell.getDateCellValue();
									value = sdf.format(date).trim();
								} else {
									DecimalFormat df = new DecimalFormat("0");
									value = df.format(cell.getNumericCellValue()).trim();
								}

								break;
							case Cell.CELL_TYPE_STRING: // 字符串
								value = cell.getStringCellValue();
								break;

							}
							// System.out.println(value);

							switch (cell.getColumnIndex()) {
							case 0:
								sr.setZHENGQUAN_ID(value);
								break;
							case 1:
								sr.setZHENGQUAN_JC(value);
								break;
							case 2:
								sr.setIsValid(value);
								break;
							case 3:
								sr.setPINYIN_JC(value);
								break;
							case 4:
								sr.setGONGSI_ID(value);
								break;
							case 5:
								sr.setJIAOYI_DD(value);
								break;
							case 6:
								sr.setZHENGQUAN_LX(value);
								break;
							case 7:
								sr.setJIAOYI_ID(value);
								break;
							case 8:
								sr.setSHANGSHI_ZT(value);
								break;
							case 9:
								sr.setMARK_ID(value);
								break;

							}

						}
					
						list.add(sr);
					
					
				}

			}
		}
		return list;
	}
}