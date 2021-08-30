package Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01 {

    public static void main(String[] args) {
        // Bir listeyi parametre olarak alan ve listedeki cift elemanlari YAN YANA
        // yazdiran methodu yapisal ve fonksiyonel olarak yaziniz.
        List<Integer> l = new ArrayList<>(Arrays.asList(14, 9, 13, 4, 9, 2, 14, 15, 4));
        yazdirStructural(l);
        System.out.println("");
        yazdirLambda(l);
        System.out.println("");
        ciftNumStructural(l);
        System.out.println("");
        ciftNumLambda(l);
        System.out.println("");
        tekNumSquareFunctional(l);
        System.out.println("");
        uniqueFunct(l);
        System.out.println("");
        ciftNumSquareSum(l);
    }

    // structural
    public static void yazdirStructural(List<Integer> l) {
        for (Integer each : l) {
            System.out.print(each + " ");
        }
    }

    // functional
    public static void yazdirLambda(List<Integer> l) {
        l.stream().forEach(t -> System.out.print(t + " "));
    }

    /*
    2) list in elemanlarindan Cift olanlari aralarinda bosluk birakarak
    yazdiran method olustur.
     */
    // structural
    public static void ciftNumStructural(List<Integer> l) {
        for (Integer each : l) {
            if (each % 2 == 0) {
                System.out.print(each + " ");
            }
        }
    }

    // functional (Lambda)
    public static void ciftNumLambda(List<Integer> l) {
        // lambda expression (-> arrow function)
        l.stream().filter(t -> t % 2 == 0).forEach(t -> System.out.print(t + " "));
    }

    // 3) List teki tek sayilarin karelerini yazdiran method olsuturun.
    public static void tekNumSquareFunctional(List<Integer> l) {
        l.stream().filter(t -> t % 2 != 0).map(t -> t * t).forEach(t -> System.out.print(t + " "));
    }

    // 4) tekrarli elemanlari silip, tek sayi olanlarin kuplerini yazdiran method.
    public static void uniqueFunct(List<Integer> l) {
        l.stream().distinct().filter(t -> t % 2 != 0).map(t -> t * t * t).forEach(t -> System.out.print(t + " "));
        // distinct() : tekrarli olanlari siliyor.
    }

    // 5) Listedeki tekrarli elamanlari silip cift olanlarin karelerinin toplamini yazdiran method olustur.
    public static void ciftNumSquareSum(List<Integer> l) {
        System.out.println(l.stream().distinct().filter(t -> t % 2 != 0).map(t -> t * t).reduce(0, (x, y) -> x + y));
    }

}
