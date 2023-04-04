package JAVABatch15.class32.class31;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelReaderDemo5 {
    public ExcelReaderDemo5() throws IOException {
    }

    public static void main(String[] args) throws FileNotFoundException {

        String path="Files/Test2.xlsx";
        FileInputStream fileInputStream=new FileInputStream(path);
    }

    String path="Files/Test2.xlsx";

    FileInputStream fileInputStream=new FileInputStream(path);

    XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);

    Sheet sheet1=xssfWorkbook.getSheet("Sheet1");

    int noOfRows=sheet1.getPhysicalNumberOfRows();


    //var excelData=new ArrayList<>();

        /*for (int i = 0; i < 4; i++) {
        Row row=sheet1.getRow(i);

        LinkedHashMap rowMap=new LinkedHashMap<>();
        rowMap.put("Name", row.getCell(0));
        rowMap.put("Age", row.getCell(1));
        rowMap.put("City", row.getCell(2));
        rowMap.put("Salary", row.getCell(3));

        excelData.add(rowMap);
        System.out.println(rowMap);

        }*/
    }

