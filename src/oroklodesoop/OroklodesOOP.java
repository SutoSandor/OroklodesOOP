package oroklodesoop;

public class OroklodesOOP {
    
    public static void main(String[] args) {
           fajl f1 = new fajl("recept.docs",685);
           fajl f2 = new fajl("Trónok Harca HD S01",25238073);
           fajl f3 = new fajl("Rossz lányok Best Of", 762382);
           
           System.out.println(f1);
           System.out.println(f2);
           System.out.println(f3);
           HatterTarolo piciHDD = new HatterTarolo(1500000);
           piciHDD.hozzaAd(f1);
           piciHDD.hozzaAd(f2);
           piciHDD.hozzaAd(f3);
           
           System.out.println(piciHDD.listaz());
           
           floppy kisfloppy = new floppy();
           kisfloppy.hozzaAd(f1);
           kisfloppy.hozzaAd(f2);
           kisfloppy.hozzaAd(f3);
           System.out.println(kisfloppy.szabadKapacitas());
           System.out.println(kisfloppy.listaz());
           
    }
    
    
}


