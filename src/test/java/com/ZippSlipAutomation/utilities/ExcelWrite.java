package com.ZippSlipAutomation.utilities;

import java.io.File;

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
	
	public void writeresultinexcelXSSF(int sheet, int col, int row, String result,ExcelTypes excelType) throws Exception {

		
		
		
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
}
