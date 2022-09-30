package cloudtesla.crm.GenericLibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * this class will read  and write the data from excel file and return it to user
 * @author Rafeek
 *
 */
public class ExcelFileUtility {
	/**
	 * this method read the data from excel file by using the parameter if user is specified
	 * @param sheetname
	 * @param rownum
	 * @param cellnum
	 * @return
	 * @throws Throwable
	 * @throws IOException
	 */
	public String readDataFromExcel(String sheetname,int rownum,int cellnum) throws Throwable, IOException {
		FileInputStream fis=new FileInputStream(IPathConstant.ExcelPath);
		Workbook wb = WorkbookFactory.create(fis);
		String value = wb.getSheet(sheetname).getRow(rownum).getCell(cellnum).getStringCellValue();
		return value;
	}
	/**
	 * this method write the data into excel file by using the parameter if user is specified
	 * @param sheetname
	 * @param rownum
	 * @param cellnum
	 * @param value
	 * @throws Throwable
	 */
	public void writeDataIntoExcel(String sheetname,int rownum,int cellnum,String value) throws Throwable {
		FileInputStream fis=new FileInputStream(IPathConstant.ExcelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetname);
		Row ro = sh.getRow(rownum);
		Cell cel = ro.createCell(cellnum);
		cel.setCellValue(value);
		FileOutputStream fos=new FileOutputStream(IPathConstant.ExcelPath);
		wb.write(fos);

	}
	/**
	 * this method will read the last count no.of the row by using the parameter if user is specified
	 * @param sheetname
	 * @return
	 * @throws Throwable
	 */
	public int getRowCount(String sheetname) throws Throwable {
		FileInputStream fis=new FileInputStream(IPathConstant.ExcelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetname);
		int count = sh.getLastRowNum();
		return count;
	}
	/**

	 * This method will read multiple data from excel sheet with the help of sheetname

	 * and return 2 dimensional object [][]

	 * @param SheetName

	 * @return

	 * @throws Throwable

	 */

	public Object[][] readmultipleDataFromExcel(String SheetName) throws Throwable

	{
		FileInputStream fis = new FileInputStream(IPathConstant.ExcelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(SheetName);
		int lastRow = sh.getLastRowNum();
		int lastCell = sh.getRow(0).getLastCellNum();
		Object[][] data = new Object[lastRow][lastCell];
		for(int i = 0;i<lastRow;i++)

		{
        for(int j=0;j<lastCell;j++)

			{

				data[i][j]=sh.getRow(i+1).getCell(j).getStringCellValue();
			}
		}
		return data;
	}
}

