package bankamatik;

import static bankamatik.Bankamatik.bankamatik;
import static bankamatik.ParaCekme.*;

public class ParaYatir {



    static void paraYatir() {
        System.out.println(R + "BAKIYE  :" + bakiye);
        System.out.println("YATIRMAK ISTEDIGINIZ TUTARI GIRINIZ");
        System.out.print(G + "YATIRILACAK TUTAR  : ");
        int yislem=scan.nextInt();
        if (yislem<=0){
            System.out.println("LUTFEN GECERLI BIR TUTAR GIRINIZ");

            paraYatir();
        }else
            bakiye=bakiye+yislem;
            System.out.println(R + "BAKIYE  :" + bakiye);
        System.out.println(" 1 -> ANA MENU \n 2 -> CIKIS");
        System.out.print(G + "SECIMINIZ  : ");
        String cislem = scan.next();
        switch (cislem) {
            case "1" -> bankamatik();
            case "2" -> System.out.println(G + "BIZI TERCIH ETTIGINIZ ICIN TESEKKUR EDERIZ");
            default -> {
                System.out.println(G + "*******YANLIS GIRIS YAPTINIZ*******");
                bankamatik();
            }
        }
}
}
