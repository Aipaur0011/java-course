package JAVABatch15.class32.class31;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelReaderDemo4 {
    public static  void main(String[] args) throws IOException {
        String path="Files/Book1.xlsx";
        FileInputStream fileInputStream=new FileInputStream(path);
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet1=xssfWorkbook.getSheet("Sheet1");

        int noOfRows=sheet1.getPhysicalNumberOfRows();

        for (int i = 0 ; i < noOfRows; i++) {
            Row row = sheet1.getRow(i);
            // Tells us how many cells contain the data
            int noOfCells = row.getPhysicalNumberOfCells();
            // to go through all the cells from each row
            for (int j = 0; j < noOfCells; j++) {
                Cell cell = row.getCell(j);
                System.out.print(cell + " ");
            }
            System.out.println();
        }



    }
}
