package day17_nestedForLoopsWhileLoops;

import java.util.Scanner;

public class C08_NestedForLoopsHomework {

	public static void main(String[] args) {
		// yýldýzlarla eskenar ucgen olusturma
		Scanner scan = new Scanner (System.in);
		System.out.print("bir rakam giriniz : ");
		int num = scan.nextInt();
		
		for (int i = 1; i <=num; i++) {
            for (int j =i; j <=num; j++) {//burasi ile yildizlarin onundeki bosluklu alani azaltarak olusturduk
                System.out.print(" ");    //bitisi rakam ile sabit tuttuk baslangici yukselterek araydaki dongu sayisini azaltik
                
            }
            for (int a =1; a <=i; a++) {//her satira kac yildiz koyacagimizi i ile kontrol ettik
                System.out.print("*");  //i=1 iken bitis de bire esitledik bir yildiz yazdirdi
                System.out.print(" ");  //yildizlar arasinda bosluk biraktik
            }
            System.out.println(" ");//ilk forun her dongusunde alt satira gecmesi icin yaptik
		}
		scan.close();
	}
}
