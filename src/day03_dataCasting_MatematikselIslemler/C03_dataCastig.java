package day03_dataCasting_MatematikselIslemler;

import java.util.Scanner;

public class C03_dataCastig {
    public static void main(String[] args) {

        System.out.println(38/5); // 5

        System.out.println(29/3); // 9

        /*
         java bir bolme isleminde 2 int ısleme giriyorsa sonucu int olarak verir
         */

        int sayi1 = 25 ;
        int sayi2  = 6 ;

        System.out.println(sayi1/sayi2); // 4

        double dbl =6 ; // 4.1666666666667

        System.out.println(sayi1-dbl); // 6.25;

        // kullanıcıdan iki tam sayi alin
        // 1. tam sayıyı 2.ye bolup sonucu ondalik olarak yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen birbirine bolmek icin iki tam sayi giriniz");

        int ilkSayi = scan.nextInt();
        int ikinciSayi = scan.nextInt();

        System.out.println("iki sayinin bolme sonucu: " + (double)ilkSayi/ikinciSayi);




    }
}
