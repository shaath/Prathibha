package dataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import functionalDriven.BusinessMethods;

public class ExcelOps {

	public static void main(String[] args) throws IOException, InterruptedException {
		String res = "";
		String xlPath = System.getProperty("user.dir")+"\\src\\testData\\TestData.xlsx";
		String xlOutpath = System.getProperty("user.dir")+"\\src\\results\\TestRes1.xlsx";
		
		FileInputStream fi = new FileInputStream(xlPath);
		
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet ws = wb.getSheet("EmpReg");
//		XSSFRow r = ws.getRow(0);
//		XSSFCell c = r.getCell(0);
//		String f = c.getStringCellValue();
//		System.out.println(f);
		
		int rc = ws.getLastRowNum();
//		int cc = r.getLastCellNum();
		
//		System.out.println(rc +"---"+ cc);
		
		BusinessMethods bm = new BusinessMethods();
		bm.orgLaunch("firefox", "http://orangehrm.qedgetech.com");
		bm.orgLogin("Admin", "Qedge123!@#");
		
		for(int i = 1; i <= rc; i++){
			XSSFRow r = ws.getRow(i);
			
			XSSFCell c = r.getCell(0);
			XSSFCell c1 = r.getCell(1);
			XSSFCell c2 = r.getCell(2);
			XSSFCell c3 = r.createCell(3);
			
			String f = c.getStringCellValue();
			String l = c1.getStringCellValue();
			String eid = c2.getStringCellValue();
			
			System.out.println(f+"---"+l+"---"+eid);
			res = bm.orgEmpReg(f, l, eid);
			c3.setCellValue(res);
			
		}
		
		FileOutputStream fo = new FileOutputStream(xlOutpath);
		wb.write(fo);
		wb.close();
		
		bm.orgLogout();
		bm.brClose();
	}

}
