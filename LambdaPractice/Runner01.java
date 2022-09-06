package LambdaPractice;

import java.util.Arrays;

public class Runner01 extends Lambda01{
    public static void main(String[] args) {
        // aHarfleriSilenGerisiniYazdiran(names);
        System.out.println("**************");
        //  maxElemanBul(numbers);
        System.out.println("**************");
        //  elemanlariTopla(numbers);
        System.out.println("**************");
       // elemanlariCarp(numbers);
        System.out.println("**************");
        teklerinKareBuyuktenKucuge(numbers);
        System.out.println("**************");
        sonHarfeGoreTersSira(menu);
        System.out.println("**************");
        karakterSayiYedidenBuyuk(menu);
        System.out.println("**************");
        karkterEnFazla(menu);
        System.out.println("**************");
        sonHarfeGoreSiralaIlkHaricElmanlariYaz(menu);
        System.out.println("**************");
        System.out.println(Lambda03.toplaStructured(5));
        System.out.println("**************");
        System.out.println(Lambda03.toplaFunctional(5));
        System.out.println("**************");
        System.out.println(Lambda03.toplaCift(5));
        System.out.println("**************");
        System.out.println(Lambda03.toplaIlkXCift(5));
        System.out.println("**************");
        System.out.println(Lambda03.toplaIlkXTek(5));
        System.out.println("**************");
        Lambda03.ikininIlkXKuvvetPrint(3);
        System.out.println("**************");
        System.out.println(Lambda03.istenenSayiFactorial(4));
        System.out.println("**************");
        Lambda03.isteneSayiIlkXKuvvetPrint(3,4);
        System.out.println("**************");
     //   Lambda03.liste(Arrays.toString(Lambda03.arr));
    }
}
