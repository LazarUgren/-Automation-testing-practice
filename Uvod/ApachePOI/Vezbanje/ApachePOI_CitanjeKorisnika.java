package Video26ResenjeTestaIApachePOI;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ApachePOI_CitanjeKorisnika {
    public static void main(String[] args) {
        File f = new File("Korisnik.xlsx");

        try {
            InputStream is = new FileInputStream(f);

            // od fajla pravim excel workbook
            XSSFWorkbook wb = new XSSFWorkbook(is);

            // dohvata list 0
            Sheet sheet = wb.getSheetAt(0);

            //dohvatam 3 red, sad cu da se igram, da procitam celu tabelu
            // zaglavlje-0-ti red
            Row row0 = sheet.getRow(0);
            // prvi red
            Row row1 = sheet.getRow(1);
            // drugi red
            Row row2 = sheet.getRow(2);
            // treci red
            Row row3 = sheet.getRow(3);
            // cetvrti red
            Row row4 = sheet.getRow(4);

            // dohvatam 2 celiju u 5 tom redu
            // dohvatam sve redom
            //Ime
            Cell cell1_R0 = row0.getCell(0);
            //Prezime
            Cell cell2_R0 = row0.getCell(1);
            //Godine
            Cell cell3_R0 = row0.getCell(2);

            //Ime: Zoran
            Cell cell1_R1 = row1.getCell(0);
            //Prezime: Milicevic
            Cell cell2_R1 = row1.getCell(1);
            //Godine: 25
            Cell cell3_R1 = row1.getCell(2);

            //Ime: Ksenija
            Cell cell1_R2 = row2.getCell(0);
            //Prezime: Kostic
            Cell cell2_R2 = row2.getCell(1);
            //Godine: 29
            Cell cell3_R2 = row2.getCell(2);

            //Ime: Lazar
            Cell cell1_R3 = row3.getCell(0);
            //Prezime: Ugrenovic
            Cell cell2_R3 = row3.getCell(1);
            //Godine: 28
            Cell cell3_R3 = row3.getCell(2);

            //Ime: Milijana
            Cell cell1_R4 = row4.getCell(0);
            //Prezime: Ugrenovic
            Cell cell2_R4 = row4.getCell(1);
            //Godine: 27
            Cell cell3_R4 = row4.getCell(2);


            // dohvatam i ispisujem vrednost koja se nalazi u celiji
            //Sad ispisujem sve redom, jedno po jedno.

            String vrednostKojaSeNalaziUCeliji_R0_C1 = cell1_R0.getStringCellValue();
            // Stampam (Ime)
            System.out.println(vrednostKojaSeNalaziUCeliji_R0_C1);

            String vrednostKojaSeNalaziUCeliji_R0_C2 = cell2_R0.getStringCellValue();
            // Stampam (Prezime)
            System.out.println(vrednostKojaSeNalaziUCeliji_R0_C2);

            String vrednostKojaSeNalaziUCeliji_R0_C3 = cell3_R0.getStringCellValue();
            // Stampam (Godine)
            System.out.println(vrednostKojaSeNalaziUCeliji_R0_C3);

            String vrednostKojaSeNalaziUCeliji_R1_C1 = cell1_R1.getStringCellValue();
            // Stampam (Zoran)
            System.out.println(vrednostKojaSeNalaziUCeliji_R1_C1);

            String vrednostKojaSeNalaziUCeliji_R1_C2 = cell2_R1.getStringCellValue();
            // Stampam (Milicevic)
            System.out.println(vrednostKojaSeNalaziUCeliji_R1_C2);

            double vrednostKojaSeNalaziUCeliji_R1_C3 = cell3_R1.getNumericCellValue();
            // Stampam (25)
            System.out.println(vrednostKojaSeNalaziUCeliji_R1_C3);

            String vrednostKojaSeNalaziUCeliji_R2_C1 = cell1_R2.getStringCellValue();
            // Stampam (Ksenija)
            System.out.println(vrednostKojaSeNalaziUCeliji_R2_C1);

            String vrednostKojaSeNalaziUCeliji_R2_C2 = cell2_R2.getStringCellValue();
            // Stampam (Kostic)
            System.out.println(vrednostKojaSeNalaziUCeliji_R2_C2);

            double vrednostKojaSeNalaziUCeliji_R2_C3 = cell3_R2.getNumericCellValue();
            // Stampam (29)
            System.out.println(vrednostKojaSeNalaziUCeliji_R2_C3);

            String vrednostKojaSeNalaziUCeliji_R3_C1 = cell1_R3.getStringCellValue();
            // Stampam (Lazar)
            System.out.println(vrednostKojaSeNalaziUCeliji_R3_C1);

            String vrednostKojaSeNalaziUCeliji_R3_C2 = cell2_R3.getStringCellValue();
            // Stampam (Ugrenovic)
            System.out.println(vrednostKojaSeNalaziUCeliji_R3_C2);

            double vrednostKojaSeNalaziUCeliji_R3_C3 = cell3_R3.getNumericCellValue();
            // Stampam (28)
            System.out.println(vrednostKojaSeNalaziUCeliji_R3_C3);

            String vrednostKojaSeNalaziUCeliji_R4_C1 = cell1_R4.getStringCellValue();
            // Stampam (Milijana)
            System.out.println(vrednostKojaSeNalaziUCeliji_R4_C1);

            String vrednostKojaSeNalaziUCeliji_R4_C2 = cell2_R4.getStringCellValue();
            // Stampam (Ugrenovic)
            System.out.println(vrednostKojaSeNalaziUCeliji_R4_C2);

            double vrednostKojaSeNalaziUCeliji_R4_C3 = cell3_R4.getNumericCellValue();
            // Stampam (27)
            System.out.println(vrednostKojaSeNalaziUCeliji_R4_C3);

            // zatvaram excel workbook
            wb.close();

        }catch (IOException e){
            System.out.println("Odgovarajuci fajl nije pronadjen.");
        }
    }
}
