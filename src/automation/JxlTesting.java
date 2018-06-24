package automation;

import java.io.File;
import jxl.Sheet;
import jxl.write.Number;
import jxl.Workbook;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class JxlTesting {

	public static void main(String[] args) throws Exception
	{
		//connect to excel file
		File f=new File("jxl.xls");
		//open that excel file for reading
		Workbook rwb=Workbook.getWorkbook(f);
		Sheet rsh=rwb.getSheet(0);
		int numofRows=rsh.getRows();
		//open excel file for writing
		WritableWorkbook wwb=Workbook.createWorkbook(f, rwb);
		WritableSheet wsh=wwb.getSheet(0);
		//data driven from 2nd row
		for(int i=1; i<numofRows; i++)
		{
			int x=Integer.parseInt(rsh.getCell(0, i).getContents());
			int y=Integer.parseInt(rsh.getCell(1, i).getContents());
			int z=x+y;
			Number n=new Number(2, i, z);
			wsh.addCell(n);
		}
		//save excel
		wwb.write();
		rwb.close();
		wwb.close();
		

	}

}
