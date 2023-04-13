package day02_variables_scanner;

import java.util.Locale;
import java.util.Scanner;
import java.util.Stack;

public class C05_Scanner {

    public static void main(String[] args) {

        //Kullanıcıdan ismini alın
        // ve girilen ismi buyuk harfle yazdirin

        // Kullanıcıdan deger almak icin 3 islem yapmamiz gerekir
        // 1. adım Scanner objesi olusturmak

        Scanner  scan = new Scanner(System.in);

        // 2. adım kullaniciya ne istediginizi soyleyin

        System.out.println("isminizi yazın");

        // 3. adım kullanicinin istediigi degeri kaydedeceginiz bir variable olusturun
        // scan objesi ile ilgili method'u kullanarak kullanıcının girdigi degeri
        // olusturdugunun variable atayın

        String girilenisim = scan.nextLine();

        // Artık kullnıcının girdigi deger girilenisim variable'ında kayıtlı

        System.out.println(girilenisim.toUpperCase());




    }
}
