package com.xiyu.stock.web.util;

import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.xiyu.stock.web.model.GongSiDaiMa;
import com.xiyu.stock.web.model.InfoGongSiDaiMa;

public class GongSiDaiMaExcel {

	public List<GongSiDaiMa> read(String filename) throws FileNotFoundException, IOException {
		Workbook workbook = new XSSFWorkbook(new FileInputStream(filename));
		List<GongSiDaiMa> list = new ArrayList<GongSiDaiMa>();
		int num = workbook.getNumberOfSheets();
		for (int page = 0; page < num; page++) {
			Sheet sheet = workbook.getSheetAt(page);

			for (Row row : sheet) {
				if (row.getRowNum() >= 1) {
					GongSiDaiMa sr = new GongSiDaiMa();
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
								sr.setGONGSI_ID(value);
								break;
							case 1:
								sr.setGONGSI_MC(value);
								break;
							case 2:
								sr.setPINYIN_JC(value);
								break;
							case 3:
								sr.setJIGOU_LX_1(value);
								break;
							case 4:								
								sr.setFUXIANG(value);
								break;
							case 5:
								sr.setCAIBAO_LX(value);
								break;
							case 6:
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
	public List<InfoGongSiDaiMa> readInfo(String filename) throws FileNotFoundException, IOException {
		Workbook workbook = new XSSFWorkbook(new FileInputStream(filename));
		List<InfoGongSiDaiMa> list = new ArrayList<InfoGongSiDaiMa>();
		int num = workbook.getNumberOfSheets();
		for (int page = 0; page < num; page++) {
			Sheet sheet = workbook.getSheetAt(page);

			for (Row row : sheet) {
				if (row.getRowNum() >= 1) {
					InfoGongSiDaiMa sr = new InfoGongSiDaiMa();
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
								sr.setGONGSI_ID(value);
								break;
							case 1:
								sr.setGONGSI_MC(value);
								break;
							case 2:
								sr.setPINYIN_JC(value);
								break;
							case 3:
								sr.setJIGOU_LX_1(value);
								break;
							case 4:								
								sr.setFUXIANG(value);
								break;
							case 5:
								sr.setCAIBAO_LX(value);
								break;
							case 6:
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