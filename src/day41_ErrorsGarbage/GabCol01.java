package day41_ErrorsGarbage;

public class GabCol01 {
    public static void main(String[] args) {
        String str = "";
        for(int i=0; i<3;i--){
            str += i; // sonsuz dongu. her yeni dongude yeni bir str create edilir
        }
        /*
        Garbage collector finiize() methodunu calistirir.
        finlize() methodu silinecek obj'leri isaretler ve siler.
         */

    }
}
