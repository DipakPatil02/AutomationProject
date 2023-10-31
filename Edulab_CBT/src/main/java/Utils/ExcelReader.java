package Utils;

import org.apache.logging.log4j.LogManager;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.List;
import java.io.InputStream;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.File;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.logging.log4j.Logger;

public class ExcelReader
{
	private static final Logger log;
	static String testdataFile;
	static Workbook workbook;

	public static void setTestDataFolder(final String testDataFolderName) {
		ExcelReader.testdataFile = testDataFolderName;
		ExcelReader.testdataFile += "\\TestData.xlsx";
	}  
	public static String getTestDataFolder() {
		return ExcelReader.testdataFile;
	}    
	public static Sheet readExcel(final String excelName, final String SheetName) {
		try {
			ExcelReader.log.info("Reading " + excelName + " and sheet " + SheetName);
			ExcelReader.workbook = (Workbook)new XSSFWorkbook((InputStream)new FileInputStream(new File(excelName)));
			return ExcelReader.workbook.getSheet(SheetName);
		}
		catch (Exception e) {
			ExcelReader.log.fatal("issue in read excel sheet ", (Throwable)e);
			return null;
		}
	}    
	public static List<Map<String, String>> readProjectSheetFromExcel() {
		final List<Map<String, String>> mapValues = new ArrayList<Map<String, String>>();
		try {
			final Sheet sh = readExcel(ExcelReader.testdataFile, "auto_projects");
			final int lastRow = sh.getLastRowNum();
			final List<String> header = new ArrayList<String>();
			final Row row = sh.getRow(0);
			for (int lastCol = row.getLastCellNum(), j = 0; j < lastCol; ++j) {
				final Cell cell = row.getCell(j);
				header.add(getValues(cell));
			}
			for (int i = 1; i <= lastRow; ++i) {
				final Row drow = sh.getRow(i);
				final int clastCol = drow.getLastCellNum();
				final Map<String, String> mValue = new HashMap<String, String>();
				for (int k = 0; k < clastCol; ++k) {
					final Cell cell2 = drow.getCell(k);
					mValue.put(header.get(k), getValues(cell2));
				}
				mapValues.add(mValue);
			}
		}
		catch (Exception e) {
			ExcelReader.log.fatal("issue in auto_project sheet ", (Throwable)e);
			try {
				ExcelReader.workbook.close();
				ExcelReader.log.info("workbook closed");
			}
			catch (Exception e1) {
				ExcelReader.log.fatal("Issue in workbook closure ", (Throwable)e1);
			}
		}
		finally {
			try {
				ExcelReader.workbook.close();
				ExcelReader.log.info("workbook closed");
			}
			catch (Exception e2) {
				ExcelReader.log.fatal("Issue in workbook closure ", (Throwable)e2);
			}
		}
		return mapValues;
	}

	public static List<Map<String, String>> readGlobalSheetFromExcel() {
		final List<Map<String, String>> mapValues = new ArrayList<Map<String, String>>();
		try {
			final Sheet sh = readExcel(ExcelReader.testdataFile, "auto_global");
			final int lastRow = sh.getLastRowNum();
			System.out.println(lastRow);
			final List<String> header = new ArrayList<String>();
			final Row row = sh.getRow(0);
			for (int lastCol = row.getLastCellNum(), j = 0; j < lastCol; ++j) {
				final Cell cell = row.getCell(j);
				header.add(getValues(cell));
			}
			for (int i = 1; i <= lastRow; ++i) {
				final Row drow = sh.getRow(i);
				final int clastCol = drow.getLastCellNum();
				final Map<String, String> mValue = new HashMap<String, String>();
				for (int k = 0; k < clastCol; ++k) {
					final Cell cell2 = drow.getCell(k);
					mValue.put(header.get(k), getValues(cell2));
				}
				mapValues.add(mValue);
			}
		}
		catch (Exception e) {
			ExcelReader.log.fatal("issue in auto_Global sheet ", (Throwable)e);
			try {
				ExcelReader.workbook.close();
				ExcelReader.log.info("workbook closed");
			}
			catch (Exception e1) {
				ExcelReader.log.fatal("Issue in workbook closure ", (Throwable)e1);
			}
		}
		finally {
			try {
				ExcelReader.workbook.close();
				ExcelReader.log.info("workbook closed");
			}
			catch (Exception e2) {
				ExcelReader.log.fatal("Issue in workbook closure ", (Throwable)e2);
			}
		}
		return mapValues;
	}

	public static List<Map<String, String>> readCredentialSheetFromExcel() {
		final List<Map<String, String>> mapValues = new ArrayList<Map<String, String>>();
		try {
			final Sheet sh = readExcel(ExcelReader.testdataFile, "auto_credentials");
			final int lastRow = sh.getLastRowNum();
			System.out.println(lastRow);
			final List<String> header = new ArrayList<String>();
			final Row row = sh.getRow(0);
			for (int lastCol = row.getLastCellNum(), j = 0; j < lastCol; ++j) {
				final Cell cell = row.getCell(j);
				header.add(getValues(cell));
			}
			for (int i = 1; i <= lastRow; ++i) {
				final Row drow = sh.getRow(i);
				final int clastCol = drow.getLastCellNum();
				final Map<String, String> mValue = new HashMap<String, String>();
				for (int k = 0; k < clastCol; ++k) {
					final Cell cell2 = drow.getCell(k);
					mValue.put(header.get(k), getValues(cell2));
				}
				mapValues.add(mValue);
			}
		}
		catch (Exception e) {
			ExcelReader.log.fatal("issue in auto_Credential sheet ", (Throwable)e);
			try {
				ExcelReader.workbook.close();
				ExcelReader.log.info("workbook closed");
			}
			catch (Exception e1) {
				ExcelReader.log.fatal("Issue in workbook closure ", (Throwable)e1);
			}
		}
		finally {
			try {
				ExcelReader.workbook.close();
				ExcelReader.log.info("workbook closed");
			}
			catch (Exception e2) {
				ExcelReader.log.fatal("Issue in workbook closure ", (Throwable)e2);
			}
		}
		return mapValues;
	}

	public static List<Map<String, String>> readApplicationSheetFromExcel() {
		final List<Map<String, String>> mapValues = new ArrayList<Map<String, String>>();
		try {
			final Sheet sh = readExcel(ExcelReader.testdataFile, "auto_applications");
			final int lastRow = sh.getLastRowNum();
			final List<String> header = new ArrayList<String>();
			final Row row = sh.getRow(0);
			for (int lastCol = row.getLastCellNum(), j = 0; j < lastCol; ++j) {
				final Cell cell = row.getCell(j);
				header.add(getValues(cell));
			}
			for (int i = 1; i <= lastRow; ++i) {
				try {
					final Row drow = sh.getRow(i);
					final int clastCol = drow.getLastCellNum();
					final Map<String, String> mValue = new HashMap<String, String>();
					for (int k = 0; k < clastCol; ++k) {
						final Cell cell2 = drow.getCell(k);
						mValue.put(header.get(k), getValues(cell2));
					}
					mapValues.add(mValue);                  
				}

				catch (Exception e3) {
					ExcelReader.log.info("issue reading row number " + i);
				}
			}
		}
		catch (Exception e) {
			ExcelReader.log.fatal("issue in auto_Application sheet ", (Throwable)e);
			try {
				ExcelReader.workbook.close();
				ExcelReader.log.info("workbook closed");
			}
			catch (Exception e1) {
				ExcelReader.log.fatal("Issue in workbook closure ", (Throwable)e1);
			}
		}
		finally {
			try {
				ExcelReader.workbook.close();
				ExcelReader.log.info("workbook closed");
			}
			catch (Exception e2) {
				ExcelReader.log.fatal("Issue in workbook closure ", (Throwable)e2);
			}
		}
		return mapValues;
	}

	private static String getValues(final Cell cell) {
		try {
			if (cell.getCellType() == CellType.NUMERIC) {
				final double dbl = cell.getNumericCellValue();
				final int dbi = (int)dbl;
				if (dbi == dbl) {
					return String.valueOf(dbi);
				}
				return String.valueOf(dbl);
			}
			else {
				if (cell.getCellType() == CellType.STRING) {
					return String.valueOf(cell.getStringCellValue());
				}
				if (cell.getCellType() == CellType.BLANK) {
					return "";
				}
				System.out.println("Cell Type not found");
				return "";
			}
		}
		catch (Exception e) {
			return "";
		}
	}

	static {
		log = LogManager.getLogger((Class)ExcelReader.class);
		ExcelReader.testdataFile = System.getProperty("user.dir") + "\\testdata\\TestData.xlsx";
		ExcelReader.workbook = null;
	}
}