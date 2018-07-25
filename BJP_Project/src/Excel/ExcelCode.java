
package Excel;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelCode{
	
	public static XSSFWorkbook workbook;
	//static XSSFWorkbook workbook1;
	public static XSSFSheet sh;
	public static XSSFCell cell;
	public static String a="";

public static XSSFSheet Code(String sheet, String path) throws Exception{
	

FileInputStream fis=new FileInputStream(path);
                                    
 workbook= new XSSFWorkbook(fis);
 

 return sh= workbook.getSheet(sheet);

}
public static void Write(String path,int row,int col,String str) throws Exception
{
	FileOutputStream fos = new FileOutputStream(path);
    sh.getRow(row).createCell(col).setCellValue(str);
	workbook.write(fos);
}
public static String  RowColumn(int row, int column) throws Exception
{
	cell=sh.getRow(row).getCell(column);
	if(cell.getCellType()==XSSFCell.CELL_TYPE_NUMERIC){
		long k=(long)cell.getNumericCellValue();
		a=String.valueOf(k);
		System.out.println(a);
		Thread.sleep(3000);
		
	}else{
		a=cell.getStringCellValue();

	}
	return a;
}

}
