package day02_variables_scanner;

import java.util.Scanner;

public class C07_Scanner {
    public static void main(String[] args) {

        Scanner scan  = new Scanner(System.in);

        System.out.println("Lütfen isminizi giriniz");
        String girilenIsim = scan.nextLine();
        System.out.println("Lütfen soyisminizi giriniz");
        String girilenSoyisim = scan.nextLine();
        System.out.println("Lütfen Yasınızı giriniz");
        int girilenyas = scan.nextInt();


        System.out.println("isminiz : "+ girilenIsim +
                           "\nSoyisminiz:" + girilenSoyisim +
                           "\nyasınız: " + girilenyas +
                           "\nkaydiniz basariyla tamamlanmıstır.");


    }

}
