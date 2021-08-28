package day40_exceptions;

import java.util.Scanner;

public class Exceptions_Exam01 {
    /*
    'ortalama' isiminde bir method olusturun ve int v - int f isminde 2 adet parametresi olsun.
    int v = vize
    int f = final

    Eger vize 100'den buyuk ve ya final 100'den buyuk, ve ya vize 0'dan kucuk, ve ya final 0'dan kucuk

    Sistem ArithmeticException hatasi versin ve "Notlar 0-100 arasinda olmali" mesajini dondursun.

    diger durumlarda ise
    vizenin yuzde 40'ini, finalin yuzde 60'ini alsin ve toplasin.(ortalama)

    vize: 120, final: 80 girin.
    Programin calismasini saglayin.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("vize: ");
        int v = scan.nextInt();
        System.out.print("final: ");
        int f = scan.nextInt();
        try {
            ortalama(v, f);
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public static void ortalama(int v,int f){
        if(v>100 || f>100 || v<0 || f<0){
            throw new ArithmeticException("Notlar 0-100 arasinda olmali");
        } else {
            System.out.println("ortalama: " + ((v*4/10)+(f*6/10)));
        }

    }
}
