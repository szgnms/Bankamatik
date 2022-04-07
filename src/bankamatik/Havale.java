package bankamatik;

import static bankamatik.Bankamatik.bankamatik;
import static bankamatik.ParaCekme.*;
import static bankamatik.ParaCekme.G;

public class Havale {


    static void havale() {
        if (bakiye == 0) {
            System.out.println(R + "BAKIYE  :" + bakiye);
            System.out.println("HESABINIZDAN KULLANABILECEGINIZ BAKIYE BULUNMAMAKTADIR");
            System.out.println(" 1 -> ANA MENU \n 2 -> CIKIS");
            System.out.print(G + "SECIMINIZ  : ");
            String bislem = scan.next();
            switch (bislem) {
                case "1" -> bankamatik();
                case "2" -> System.out.println(G + "BIZI TERCIH ETTIGINIZ ICIN TESEKKUR EDERIZ");
                default -> {
                    System.out.println(G + "*******YANLIS GIRIS YAPTINIZ*******");
                    havale();
                }
            }
        } else {


            System.out.println(R + "BAKIYE  :" + bakiye);
            System.out.println("GONDERMEK ISTEDIGINIZ TUTARI GIRINIZ");
            System.out.print(G + "GONDERILECEK TUTAR  : ");
            double yislem = scan.nextDouble();
            if (yislem <= 0 || yislem>bakiye) {
                System.out.println("LUTFEN GECERLI BIR TUTAR GIRINIZ");

                havale();
            } else{




            System.out.println(G + " ALICI IBAN GIRINIZ : ");
            System.out.print("IBAN  :");
            String iban = scan.next();
            System.out.println("TR"+iban + "  NOLU IBAN`A " + yislem + " TL TUTARINDA PARA GONDERILMISTIR");


            bakiye = bakiye - yislem;
            System.out.println(R + "BAKIYE  :" + bakiye);
            System.out.println(" 1 -> ANA MENU \n 2 -> CIKIS");
            System.out.print(G + "SECIMINIZ  : ");
            String hislem = scan.next();
                switch (hislem) {
                    case "1" -> bankamatik();
                    case "2" -> System.out.println(G + "BIZI TERCIH ETTIGINIZ ICIN TESEKKUR EDERIZ");
                    default -> {
                        System.out.println(G + "*******YANLIS GIRIS YAPTINIZ*******");
                        havale();
                    }
                }


        }

    }}
}
