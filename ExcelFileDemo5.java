package JAVABatch15.class32;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ExcelFileDemo5 {
    public static void main(String[] args) throws IOException {

        String path="Files/Book1-2.xlsx";

        FileInputStream fileInputStream=new FileInputStream(path);
        /*
        a class that can use to read and write data easily from Excel Files
         */
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        Sheet sheet2=xssfWorkbook.getSheet("Sheet2");
        int noOfRows=sheet2.getPhysicalNumberOfRows();
        System.out.println(noOfRows);
        List<Map<String,String>> excelData=new ArrayList<>();

        for(int i=1; i<noOfRows; i++){
            Row row=sheet2.getRow(i);
            LinkedHashMap<String,String> rowMap=new LinkedHashMap<>();

            rowMap.put("UserName",row.getCell(0).toString());
            rowMap.put("Password",row.getCell(1).toString());
            excelData.add(rowMap);



            /*
            replace below code with a nested for loop

            int noOfCells=row.getPhysicalNumberOfCells();
            for (int j = 0; j <noOfCells ; j++) {
                System.out.println(row.getCell(j)+" ");

            }
            System.out.println();*/
        }
        System.out.println(excelData);

    }
}
