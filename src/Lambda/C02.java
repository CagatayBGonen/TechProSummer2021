package Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class C02 {
    public static void main(String[] args) {
     // Method reference'da bizim olusturdugumuz methodlari veya Jaba methodlarini kullaniriz.
     // Method reference Syntax i ==> ClassName::MethodName System.out.println(); == System.out::println();
        List<Integer> l = new ArrayList<>(Arrays.asList(15,14,9,13,4,9,2,4,14));

        elemanyazdir(l);
        System.out.println("");
        method01(l);
        System.out.println("");
        method02(l);
        System.out.println("");
        method03(l);
        System.out.println("");
        method04(l);
        System.out.println("");
        method05(l);
        method06(l);
        method07(l);
        method08(l);
    }
    // 1) List in elamanlarini aralarinda bosluk birakarak yan yana yazdir.(Method reference - kendi methodmuz)
    public static void elemanyazdir(List<Integer> l){
        l.stream().forEach(MethodLambda02::printWithSpace);
 //     l.stream().forEach(System.out::print); Java nin kendi methodu
    }
    //2)List in elemanlarından çift olanları aralarında boşluk bırakarak yanyana yazdır..(Method Reference)
    public static void method01(List<Integer> l){
        l.stream().filter(MethodLambda02::IsCiftNum).forEach(MethodLambda02::printWithSpace);
    }
    //3)List teki tek sayıların karelerini alıp aralarında boşluk bırakarak yanyana yazdır
    public static void method02(List<Integer> l){
        l.stream().filter(MethodLambda02::IsTekNum).map(MethodLambda02::getSquare).forEach(MethodLambda02::printWithSpace);
    }
    //4)List teki tekrarlı olanları silip tek sayıların küplerini alıp aralarında boşluk bırakarak yanyana yazdır.
    public static void method03(List<Integer> l){
        l.stream().distinct().filter(MethodLambda02::IsTekNum).map(MethodLambda02::getTriple).forEach(MethodLambda02::printWithSpace);
    }
    //5)Farklı çift sayıların karelerinin toplamını yazdır (Use Method Reference)
    public static void method04(List<Integer> l){
        System.out.println(l.stream().distinct().filter(MethodLambda02::IsCiftNum).map(MethodLambda02::getSquare).reduce(0, Math::addExact));
    }
    //6)Farklı çift sayıların küplerinin çarpımını yazdır .(Use Method Reference)
    public static void method05(List<Integer> l){
        System.out.println(l.stream().distinct().filter(MethodLambda02::IsCiftNum).map(MethodLambda02::getTriple).reduce(1, Math::multiplyExact));
    }
    //7)List teki farklı ve 5 ten büyük ve cift elemanlarının yarısını alıp ters sıralayarak list olarak yazdır.(Use Method reference)
    public static void method06(List<Integer> l){
        System.out.println(l.stream().distinct().filter(t -> t > 5 && t % 2 == 0).map(t -> t / 2).sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
    }
    //8) List teki en büyük elemanı bul.(Use Method Reference)
    public static void method07(List<Integer> l){
        System.out.println(l.stream().reduce(Integer.MIN_VALUE, Math::max));
    }
    //9) List teki en kucuk elemani bul.
    public static void method08(List<Integer> l){
        System.out.println(l.stream().reduce(Integer.MAX_VALUE, Math::min));
    }
}
