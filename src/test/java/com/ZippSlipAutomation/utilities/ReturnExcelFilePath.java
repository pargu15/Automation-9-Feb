package com.ZippSlipAutomation.utilities;

public class ReturnExcelFilePath {

	
	public static String getFilePath(ExcelTypes excel)
	{
		switch (excel) {
		case Excel1:
			return System.getProperty("user.dir") + "//src//resource//TestDataSheet.xls";

		case Excel2 :
			return System.getProperty("user.dir") + "//src//resource//TestDataSheet.xls";

		case Excel3 :
			return System.getProperty("user.dir") + "//src//resource//TestDataSheet.xls";

		default:
			return System.getProperty("user.dir") + "//src//resource//TestDataSheet.xls";


		}
	}
	
}