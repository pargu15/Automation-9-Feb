package com.ZippSlipAutomation.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class ExcelWrite {

	public void writeresultinexcel(int sheet, int col, int row, String result) throws Exception {

		File fl = new File(System.getProperty("user.dir") + "//src//resource//TestDataSheet.xls");
		WritableWorkbook wwb;
		WritableSheet wsht;
		Workbook existingbook = null;

		if (!fl.exists()) {
			wwb = Workbook.createWorkbook(fl);
			wsht = wwb.getSheet(System.getProperty("user.dir") + "//src//resource//TestDataSheet.xls");
		}

		else {
			existingbook = Workbook.getWorkbook(fl);
			wwb = Workbook.createWorkbook(fl, existingbook);
			wsht = wwb.getSheet(sheet);
		}

		Label lbl = new Label(col, row, result);
		wsht.addCell(lbl);
		wwb.write();
		wwb.close();
		if (existingbook != null) {
			existingbook.close();

		}
	}

	public void writeresultinexcelxls(int sheet, int col, int row, String result,ExcelTypes excelType) throws Exception {


		String excelFileName="";//name of excel file
		if(excelType==ExcelTypes.Excel1) {
			excelFileName = System.getProperty("user.dir") + "//src//resource//TestDataSheet.xls";
		}
		else if(excelType==ExcelTypes.Excel2) {
			excelFileName = System.getProperty("user.dir") + "//src//resource//TestDataForPastFutureAbsences.xlsx";	
		}
		else if(excelType==ExcelTypes.Excel3) {
			excelFileName = System.getProperty("user.dir") + "//src//resource//ParentImport.xlsx";	
		}



		InputStream fs = new FileInputStream(excelFileName);
		HSSFWorkbook wb = new HSSFWorkbook(fs);


		HSSFSheet sh=wb.getSheetAt(sheet);


		HSSFCell strcellvalue = null;

		strcellvalue = sh.getRow(row).getCell(col);
		strcellvalue.setCellValue((String)result);

		fs.close();

		FileOutputStream outFile =new FileOutputStream(excelFileName);
		wb.write(outFile);
		outFile.close();
		wb.close();
	}

	public void writeresultinexcelxlsx(int sheet, int col, int row, String result,ExcelTypes excelType) throws Exception {


		String excelFileName="";//name of excel file
		if(excelType==ExcelTypes.Excel1) {
			excelFileName = System.getProperty("user.dir") + "//src//resource//TestDataSheet.xls";
		}
		else if(excelType==ExcelTypes.Excel2) {
			excelFileName = System.getProperty("user.dir") + "//src//resource//TestDataForPastFutureAbsences.xlsx";	
		}
		else if(excelType==ExcelTypes.Excel3) {
			excelFileName = System.getProperty("user.dir") + "//src//resource//ParentImport.xlsx";	
		}



		InputStream fs = new FileInputStream(excelFileName);

		XSSFWorkbook wb = new XSSFWorkbook(fs);

		XSSFSheet sh = wb.getSheetAt(sheet);

		XSSFCell strcellvalue = null;
		strcellvalue = sh.getRow(row).getCell(col);
		strcellvalue.setCellValue((String)result);

		fs.close();

		FileOutputStream outFile =new FileOutputStream(excelFileName);
		wb.write(outFile);
		outFile.close();
		wb.close();
	}
}
