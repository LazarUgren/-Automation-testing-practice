package Video26ResenjeTestaIApachePOI;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;

public class ApachePOI_PisanjeKorisnika {

    public static void ispisiNizKorisnikaUExcel(ArrayList<Korisnik> nizKorisnika){
        // pravim novi workbook
        XSSFWorkbook wb = new XSSFWorkbook();
        // pravim novi sheet(list) u tom workbuku
        Sheet sh1 = wb.createSheet("Tabela korisnika");

        // zaglavlje
        Row redZaglavlje = sh1.createRow(0);

        //celija: ime, prezime i godine
        Cell celijaZaglavljeIme = redZaglavlje.createCell(0);
        Cell celijaZaglavljePrezime = redZaglavlje.createCell(1);
        Cell celijaZaglavljeGodine = redZaglavlje.createCell(2);

        celijaZaglavljeIme.setCellValue("Ime");
        celijaZaglavljePrezime.setCellValue("Prezime");
        celijaZaglavljeGodine.setCellValue("Godine");

        int sledeciRedUKojiUpisuje = 1;
        for (Korisnik k : nizKorisnika){
            Row redZaKorisnika = sh1.createRow(sledeciRedUKojiUpisuje);
            Cell celijaKorisnikIme = redZaKorisnika.createCell(0);
            Cell celijaKorisnikPrezime = redZaKorisnika.createCell(1);
            Cell celijaKorisnikGodine = redZaKorisnika.createCell(2);

            celijaKorisnikIme.setCellValue(k.getIme());
            celijaKorisnikPrezime.setCellValue(k.getPrezime());
            celijaKorisnikGodine.setCellValue(k.getGodine());

            sledeciRedUKojiUpisuje++;

        }

        try {
            // pravim taj fajl
            OutputStream fajl = new FileOutputStream("Korisnik.xlsx");
            // upisujem workbook u fajl
            wb.write(fajl);
            // zatvaram workbook
            wb.close();
        } catch (IOException e) {
            System.out.println("Desila se neka greska: " + e.getMessage());
        }

    }

    public static void main(String[] args) {
        // Kreiram niz korisnika
        ArrayList<Korisnik> nizKorisnika = new ArrayList<>();

        Korisnik k1 = new Korisnik("Zoran", "Milicevic", 25);
        Korisnik k2 = new Korisnik("Ksenija", "Kostic", 29);
        Korisnik k3 = new Korisnik("Lazar", "Ugrenovic", 28);
        Korisnik k4 = new Korisnik("Milijana", "Ugrenovic", 27);
        nizKorisnika.add(k1);
        nizKorisnika.add(k2);
        nizKorisnika.add(k3);
        nizKorisnika.add(k4);

        ispisiNizKorisnikaUExcel(nizKorisnika);

    }


}
