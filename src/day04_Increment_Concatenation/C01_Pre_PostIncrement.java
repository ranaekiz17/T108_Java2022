package day04_Increment_Concatenation;

public class C01_Pre_PostIncrement {
    public static void main(String[] args) {

        int sayi= 20;

        // sayıyı 3 arttirin

        sayi= sayi+3;
        sayi += 3;

        sayi++;
        sayi++;
        sayi++;

        System.out.println(sayi); //29

        // sayının degerini 2 azaltin

        sayi= sayi - 2;

        sayi-= 2 ;

        sayi--;
        sayi--;

        System.out.println(sayi); // 23

        sayi = 10;

        // sayinin degerini once 1 azaltin sonra yazdirin

        sayi--;
        System.out.println(sayi); // 9
        // bu islemde ekranda gordugumuz 9, sayinin degeri 9

        sayi= 10;
        //sayiyi once yazdirin sonra 1 azaltin

        System.out.println(sayi); // 10
        sayi--;

        // ekranda gorulen 10, ama sayinin son degeri 9

        System.out.println(sayi); // 9


        sayi=10;
        ++sayi; // sayiyi 1 arttirir
        sayi++; // sayiyi 1 arttirir
        System.out.println(sayi); // 12


        sayi= 10;
        System.out.println(sayi++);

        // Java aynı satırda iki islem oldugundan siralama yapar
        // Eger ++ variable dan sonra ise arttırma islemini sonra yapar
        // bu durumda once yazdirma, sonra arttirma islemi yapar

        sayi= 10;
        System.out.println(++sayi);

        // ++ variable dan once ise arttirma islemini once yapar
        // bu durumda Java once arttırma sonra yazdirma islemi yapar

        System.out.println(sayi);



    }
}
