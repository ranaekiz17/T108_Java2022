package day03_dataCasting_MatematikselIslemler;

public class C02_ExplicitNarrowing {
    public static void main(String[] args) {

        /*
            Eger genis kapasiteli bir data turunden dar kapasiteli bir data turune casting yapmak
            isterseniz
            Java bunu otomatik olarak gerceklestirmez, sizden sorumluluk almanızı bekler islemin
            gerceklesmesi icin cast yapmak istediginiz degerin onunde ( donusturmek istedigimiz
            data turu) yazılmalıdır.

            Explicit narrowing yapıldıgında data kayiplari veya datanın beklenmedik bir sonuca
            donusmesi mumkundur.
         */

        double dbl = 23.5 ;

        int sayi = (int)dbl ;
        System.out.println(sayi); //23

        byte byt = (byte)sayi;

        System.out.println(byt);

        sayi= 130;
        byt = (byt); // int daha kapsamlı oldugu icin otomatik atama yapmaz, bizden mudahale ister

        System.out.println("int 130 un byt hali+byt"); // -126

        sayi=256 ;
        byt = (byt); // int daha kapsamlı oldugu icin otomatik atama yapmaz, bizden mudahale ister

        System.out.println("int 130 un byt hali+byt"); // 0

        sayi=1300 ;
        byt = (byt); // int daha kapsamlı oldugu icin otomatik atama yapmaz, bizden mudahale ister

        System.out.println("int 1300 un byt hali+byt"); // -56


    }
}
