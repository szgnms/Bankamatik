package bankamatik;

import java.util.Scanner;

import static bankamatik.BakiyeGor.bakiyegor;
import static bankamatik.Havale.havale;
import static bankamatik.ParaCekme.G;
import static bankamatik.ParaCekme.paraCekme;
import static bankamatik.ParaYatir.paraYatir;

public class Bankamatik {
    public static final String W = "\u001B[37m";
    public static final String R = "\u001B[31m";
    public static final String G = "\u001B[32m";
    public static final String Y = "\u001B[33m";
    public static final String B = "\u001B[34m";
    public static Scanner scan = new Scanner(System.in);
    public static double bakiye = 10;


    public static void bankamatik() {

        System.out.println(R + "     **********" + G + "SZGN BANK" + R + "**********\n" + G + "     *********" + R + "HOSGELDINIZ" + G + "*********");

        System.out.println(B + "LUTFEN YAPMAK ISTEDIGINIZ ISLEMI SECINIZ" + Y + "\n     1 -> PARA CEKME  \n     2 -> PARA YATIRMA" +
                "\n     3 -> BAKIYE GORUNTULEME \n     4 -> HAVALE=EFT \n     5 -> CIKIS");

        System.out.print("SECIMINIZ  : ");
        String islemsecim = scan.next();

        switch (islemsecim) {
            case "1" -> paraCekme();
            case "2" -> paraYatir();
            case "3" -> bakiyegor();
            case "4" -> havale();
            case "5" -> System.out.println(G + "BIZI TERCIH ETTIGINIZ ICIN TESEKKUR EDERIZ");
            default -> {
                System.out.println(G + "*******YANLIS GIRIS YAPTINIZ*******");
                bankamatik();
            }
        }


    }


}
