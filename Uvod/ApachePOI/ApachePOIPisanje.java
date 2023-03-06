package Video24Git_JavaExceptions_ApachePOI;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class ApachePOIPisanje {
    public static void main(String[] args) {
        // pravim novi workbook
        XSSFWorkbook wb = new XSSFWorkbook();
        // pravim novi sheet(list) u tom workbuku
        Sheet sh1 = wb.createSheet("LazinList");

        // kreiram 5 red u sh1
        Row r5 = sh1.createRow(4); // kao i kod niza redovi se numerisu indeksima od 0. Dakle, peti red je index 4.
        // u tom redu kreiram 7 celiju
        Cell c7 = r5.createCell(6); // indeksiranje... index 6 je sedma celija/u sedmoj koloni.

        // u tu celiju upisujem "lazar"
        c7.setCellValue("Lazar");// u sedmoj celiji petog reda upisujem string ("lazar")

        try {
            // pravim taj fajl
            OutputStream fajl = new FileOutputStream("MojExcellFal.xlsx");
            // upisujem workbook u fajl
            wb.write(fajl);
            // zatvaram workbook
            wb.close();
        } catch (IOException e) {
            System.out.println("Desila se neka greska: " + e.getMessage());
        }

        System.out.println("Kraj programa!");

    }
}
