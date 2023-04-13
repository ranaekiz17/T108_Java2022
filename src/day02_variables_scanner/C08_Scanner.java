package day02_variables_scanner;

import java.util.Scanner;

public class C08_Scanner {
    public static void main(String[] args) {
        /*
        Kullanıcından bir dikdörtgeinin iki kenar uzunluğunun alıp,
        dikdörtgenin alanını yazdirin.
         */

        Scanner scan =  new Scanner(System.in);
        System.out.println("Lutfen dikdortgenin iki kenar uzunlugunu girin");
        double kenar1 = scan.nextDouble();
        double kenar2 = scan.nextDouble();

        System.out.println("Dikdortgenin alani : "+ kenar2*kenar1);

    }
}
