package bankamatik;

import static bankamatik.Bankamatik.bankamtik;
import static bankamatik.ParaCekme.*;
import static bankamatik.ParaCekme.G;

public class BakiyeGor {


    static void bakiyegor() {
        System.out.println(R + "BAKIYE  :" + bakiye);
        System.out.println(" 1 -> ANA MENU \n 2 -> CIKIS");
        System.out.print(G + "SECIMINIZ  : ");
        String cislem = scan.next();
        switch (cislem) {
            case "1":
                bankamtik();
                break;
            case "2":
                System.out.println(G + "BIZI TERCIH ETTIGINIZ ICIN TESEKKUR EDERIZ");
                break;

            default:
                System.out.println(G + "*******YANLIS GIRIS YAPTINIZ*******");
                bankamtik();
        }

    }

}
