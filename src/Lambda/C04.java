package Lambda;

import java.util.*;

public class C04 {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>(Arrays.asList("Ali", "Ali", "Aysima", "Abdurrahman", "Mehmet", "Mustafa", "Bedirhan", "Yüksel", "Süleyman"));
        buyukHarfMethod01(l);
        System.out.println("");
        siralaMethod01(l);
        System.out.println("");
        sonHarfMethod01(l);
        System.out.println("");
        siralaMethod02(l);
        System.out.println("");
        siralaMethod03(l);
        System.out.println("");
        siralaMethod04(l);
    }

    // 1) listin elemanlarini buyuk harf ile yazdir.
    public static void buyukHarfMethod01(List<String> l) {
        // l.stream().map(t->t.toUpperCase()).forEach(MethodLambda02::printWithSpace);
        l.stream().map(String::toUpperCase).forEach(MethodLambda02::printWithSpace);
    }

    // 2) elemanları uzunluklarına göre sırala ve yazdır.
    // Not: default olarak kucukten buyuge dogru siralanir.
    public static void siralaMethod01(List<String> l) {
        l.stream().sorted(Comparator.comparing(String::length)).forEach(MethodLambda02::printWithSpace);
    }

    // 3) farklı elemanlarını son harflerine göre sıralayıp yazdır
    public static void sonHarfMethod01(List<String> l) {
        l.stream().distinct().sorted(Comparator.comparing(t -> t.substring(t.length() - 1))).forEach(MethodLambda02::printWithSpace);
    }

    //4) Elemanları uzunluklarına ve ardından (aynı uzunlukta olanları) ilk karakterlerine göre sıralamak için bir yöntem oluşturun.
    public static void siralaMethod02(List<String> l) {
        l.add("Ata");
        l.stream().sorted(Comparator.comparing(String::length).thenComparing(t -> t.substring(0, 1))).forEach(MethodLambda02::printWithSpace);
    }
    // 5)Büyük harflerle, "A" ile başlayan liste öğelerini yazdırmak için bir yöntem oluşturun.
    public static void siralaMethod03(List<String> l){
        l.stream().map(String::toUpperCase).filter(t->t.startsWith("A")).forEach(MethodLambda02::printWithSpace);
    }
    // 6)  Küçük harflerle, "A" ile başlayan veya "i" ile biten liste öğelerini yazdırmak için bir yöntem oluşturun
    public static void siralaMethod04(List<String> l){
        l.add("Tili");
        l.stream().map(String::toLowerCase).filter(t->t.startsWith("a")||t.endsWith("i")).forEach(MethodLambda02::printWithSpace);
    }

}
