package Video26ResenjeTestaIApachePOI;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class ApachePOI_CitanjeKorisnika2 {
    public static void main(String[] args) {
        ArrayList<Korisnik> nizKorisnika = new ArrayList<>();

        File f = new File("Korisnik.xlsx");

        try {
            InputStream is = new FileInputStream(f);
            XSSFWorkbook wb = new XSSFWorkbook(is);

            Sheet sheet = wb.getSheetAt(0);

            int ukupnoRedova = sheet.getLastRowNum();

            for (int sledeciRedKojiCitam = 1; sledeciRedKojiCitam <= ukupnoRedova; sledeciRedKojiCitam++){
                Row r = sheet.getRow(sledeciRedKojiCitam);
                Cell imeKorisnikaCelija = r.getCell(0);
                Cell prezimeKorisnikaCelija = r.getCell(1);
                Cell godineKorisnikaCelija = r.getCell(2);

                String ime = imeKorisnikaCelija.getStringCellValue();
                String prezime = prezimeKorisnikaCelija.getStringCellValue();
                int godine = (int)godineKorisnikaCelija.getNumericCellValue();

                Korisnik k = new Korisnik(ime, prezime, godine);
                nizKorisnika.add(k);

            }

            wb.close();

            // ispisi sve korisnike u nizu

        } catch (IOException e){
            System.out.println("Odgovarajuci fajl nije pronadjen.");
        }
    }
}
