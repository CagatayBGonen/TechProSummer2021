package mentoringProje01;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OgrenciIsleri {
    Scanner scan = new Scanner(System.in);
    Map<Integer, Ogrenci> ogrenciler = new HashMap<>();

    public void menu(){
        System.out.println("ne yapmak istiyorsunuz?\n1:ogrenci kayit\n2:ogrenci goruntuleme\n3:Ogrenci silme\n4:Cikis ");
        int choice = scan.nextInt();

        switch (choice){
            case 1: ogrenciRegister();
                menu();
                break;
            case 2: ogrenciGoruntuleme();
                menu();
                break;
            case 3: ogrenciSilme();
                menu();
                break;
            case 4: cikis();
        }

    }
    //Ogrenci kayit method
    public void ogrenciRegister(){
        System.out.print("ogrenci No: ");
        int ogrenciNo = scan.nextInt();
        System.out.print("isim-soyisim: ");
        String name = scan.next();
        String surname = scan.next();
        System.out.print("ort: ");
        double ort = scan.nextDouble();

        Ogrenci ogrenci = new Ogrenci(name,surname,ort);
        ogrenciler.put(ogrenciNo, ogrenci);
    }
    public void ogrenciGoruntuleme(){
        System.out.println("OgrenciNo: ");
        int ogrenciNo= scan.nextInt();
        if (ogrenciler.containsKey(ogrenciNo)){
            System.out.println(ogrenciler.get(ogrenciNo));
        } else {
            System.out.println("not found");
        }

    }
    //silme
    public void ogrenciSilme(){
        System.out.println("ogrenciNo: ");
        int ogrenciNo = scan.nextInt();

        System.out.println(ogrenciler.get(ogrenciNo)+" emin misiniz? ");
        char choice = scan.next().charAt(0);

        if (choice=='E'){
            ogrenciler.remove(ogrenciNo);
        }
    }
    public void cikis(){
        System.out.println("gule gule");
    }

}
