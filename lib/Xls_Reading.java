
import org.apache.poi.xssf.usermodel.XSSFWorkbook; 

import org.apache.poi.xssf.usermodel.XSSFSheet;

import org.apache.poi.xssf.usermodel.XSSFCell;

import org.apache.poi.xssf.usermodel.XSSFRow;

import java.util.Iterator;

import java.io.*;

public class Xls_Reading {

 
    public void ReadSheet() throws Exception

    {

        String filename = "C://book1.xlsx";

        FileInputStream fis = null;

        try {

            fis = new FileInputStream(filename);

            

            XSSFWorkbook workbook = new XSSFWorkbook(fis);

            XSSFSheet sheet = workbook.getSheetAt(0);

            Iterator rows = sheet.rowIterator();

            int number=sheet.getLastRowNum();

            System.out.println(" number of rows"+ number);

            while (rows.hasNext())

            {

 

                XSSFRow row = ((XSSFRow) rows.next());

                Iterator cells = row.cellIterator();

                while(cells.hasNext())

                {

                    XSSFCell cell = (XSSFCell) cells.next();

                    String Value=cell.getStringCellValue();

                    System.out.println(Value);

                }

             }

        } catch (IOException e) {

            e.printStackTrace();

        } finally {

            if (fis != null) {

                fis.close();

            }

        }

       

    }

 

 

    public static void main(String[] args) {

 

    	Xls_Reading object=new Xls_Reading();

        try{

        object.ReadSheet();

 

        }catch(Exception e)

        {

            e.printStackTrace();

        }

}

 

}