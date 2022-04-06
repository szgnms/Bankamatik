package bankamatik;

import java.util.Scanner;

import static bankamatik.Bankamatik.bankamtik;

public class ParaCekme {
    public static final String W = "\u001B[37m";
    public static final String R = "\u001B[31m";
    public static final String G = "\u001B[32m";
    public static final String Y = "\u001B[33m";
    public static final String B = "\u001B[34m";

    public static Scanner scan = new Scanner(System.in);
    public static double bakiye = 10;

    public static void paraCekme() {
        if (bakiye == 0) {
            System.out.println(R + "BAKIYE  :" + bakiye);
            System.out.println("HESABINIZDAN KULLANABILECEGINIZ BAKIYE BULUNMAMAKTADIR");
            System.out.println(" 1 -> ANA MENU \n 2 -> CIKIS");
            System.out.print(G + "SECIMINIZ  : ");
            String bislem = scan.next();
            switch (bislem) {
                case "1":
                    bankamtik();
                    break;
                case "2":
                    System.out.println(G + "BIZI TERCIH ETTIGINIZ ICIN TESEKKUR EDERIZ");
                    break;
                default:
                    System.out.println(G + "*******YANLIS GIRIS YAPTINIZ*******");
                    paraCekme();
                    break;
            }
        } else {
            System.out.println(W + "BAKIYE  :" + bakiye);
            System.out.println("CEKMEK ISTEDIGINIZ TUTARI GIRINIZ");
            System.out.print(G + "TUTAR YAZINIZ  : ");
            int cekilen = scan.nextInt();
            if (cekilen > bakiye) {
                System.out.println("HESABINIZDA GIRDIGINIZ TUTARDA BAKIYE BULUNMAMAKTADIR");
                paraCekme();
            } else if (cekilen <=0) {
                System.out.println("LUTFEN GECERLI BIR TUTAR GIRINIZ");
                paraCekme();
            }else {


                System.out.println("CEKILEN TUTAR  : " + cekilen + R + "\nKALAN BAKIYE :" + (bakiye - cekilen));
                bakiye = bakiye - cekilen;
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
    }

}

