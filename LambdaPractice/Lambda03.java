package LambdaPractice;

import Lambda_functional_programing.Utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Lambda03 {
    //TASK 01 --> Structured Programming ve Functional Programming ile 1'den x'e kadar
    // tamsayilari toplayan bir program create ediniz.
    //Structured Programming
    public static int toplaStructured(int i) {
        int toplam=0;
        for (int j = 1; j <=i ; j++) {
            toplam += j;
        }

        return toplam;
    }

    //TODO  Programming
    public static int toplaFunctional(int x) {
      int toplam= IntStream.rangeClosed(1,x).sum();
      return toplam;
    }

    //TODO TASK 02 --> 1'den x'e kadar cift tamsayilari toplayan bir program create ediniz.
    public static int toplaCift(int x) {
        int ciftTop= IntStream.rangeClosed(1,x).filter(Utils::ciftElemanlariSec).sum();

        return ciftTop;
    }

    //TASK 03 --> Ilk x pozitif cift sayiyi toplayan program  create ediniz.
    public static int toplaIlkXCift(int x) {
        int top= IntStream.rangeClosed(1,x*2).filter(Utils::ciftElemanlariSec).sum();
        return top;
    }

    //TODO TASK 04 --> Ilk X pozitif tek tamsayiyi toplayan programi  create ediniz.
    public static int toplaIlkXTek(int x) {
        int top= IntStream.rangeClosed(1,x*2).filter(Utils::tekElemanlariSec).sum();
        return top;
    }


    //TASK 05 --> 2'nin ilk x kuvvetini ekrana yazdiran programi  create ediniz.
    public static void ikininIlkXKuvvetPrint(int x) {
        IntStream.rangeClosed(0,x).map(t-> (int) Math.pow(2,t)).forEach(t-> System.out.print(t+" "));
    }

    //TASK 06 --> Istenilen bir sayinin ilk x kuvvetini ekrana yazdiran programi  create ediniz.
    public static void isteneSayiIlkXKuvvetPrint(int y, int x) {
        IntStream.rangeClosed(0,x).map(t-> (int) Math.pow(2,t)).forEach(t-> System.out.print(t+" "));

    }

    // TODO TASK 07 --> Istenilen bir sayinin faktoriyelini hesaplayan programi  create ediniz.
    public static int istenenSayiFactorial(int x) {

        int faktoriyel=IntStream.rangeClosed(1,x).reduce(Math::multiplyExact).getAsInt();

        return faktoriyel;
    }
    //TASK 08 --> Istenilen bir sayinin  x. kuvvetini ekrana yazdiran programi  create ediniz.
    public static double xKuvveti(int y, int x) {
        IntStream.range(x,x+1).map(t-> (int) Math.pow(y,x)).forEach(Utils::ayniSatirdaBosluklaYazdir);
        return 0;
    }


}
