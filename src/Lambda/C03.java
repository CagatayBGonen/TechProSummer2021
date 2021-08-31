package Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class C03 {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>(Arrays.asList(7,12,14,4,9,2,4,12,16));
        method01(l);
        System.out.println("");
        method02(l);
    }

    // 1) Kucukten buyuge sirala, sonra ilk dort elemani yazdir.
    public static void method01(List<Integer> l) {
        System.out.println(l.stream().sorted().limit(4).collect(Collectors.toList()));
    }
    // 2) kucukten buyuge sirala, sonra ilk dort elemani atla.
    public static void method02(List<Integer> l){
        System.out.println(l.stream().sorted().skip(4).collect(Collectors.toList()));
    }

}
