package com.xiyu.stock.web.util;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import com.xiyu.stock.web.model.SecurityCodeNew;


public class SecurityCodeExcel {
	
	private List<SecurityCodeNew> list = new ArrayList<SecurityCodeNew>();
	public  List<SecurityCodeNew> read(String filename) throws FileNotFoundException, IOException {
		Workbook workbook = new XSSFWorkbook(new FileInputStream(filename));
		int num = workbook.getNumberOfSheets();
		for (int page = 0; page < num; page++) {
			Sheet sheet = workbook.getSheetAt(page);

			for (Row row : sheet) {
				SecurityCodeNew sr = new SecurityCodeNew();
				for (Cell cell : row) {
					// StringBuilder sb = new StringBuilder();
					if (row.getRowNum() >= 1) {

						String value = cell.toString();
						// System.out.println(value+"\t");
						switch (cell.getCellType()) {
						case Cell.CELL_TYPE_NUMERIC: // 数字
							DecimalFormat df = new DecimalFormat("0");
							value = df.format(cell.getNumericCellValue()).trim();
							break;
						case Cell.CELL_TYPE_STRING: // 字符串
							value = cell.getStringCellValue().trim();
							break;

						}
						switch (cell.getColumnIndex()) {
						case 0: 							
							sr.setStockCode(value);
							break;
						case 1: 
							sr.setStockName(value);
							break;
						case 2: 
							sr.setIsValid(value);
							break;
						case 3: 
							sr.setPhoneticName(value);
							break;
						case 4: 
							sr.setCompanyCode(value);
							break;
						case 5: 
							sr.setTradingPlaces(value);
							break;
						case 6: 
							sr.setStockType(value);
							break;
						case 7: 
							sr.setStockTrade(value);
							break;
						case 8: 
							sr.setListingStatus(value);
							break;
						case 9: 
							sr.setAuditmark(value);
							break;

						}
						list.add(sr);

					}

				}

			}
		}
		return list;
	}
}