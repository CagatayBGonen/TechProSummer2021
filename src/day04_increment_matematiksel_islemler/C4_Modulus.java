package day04_increment_matematiksel_islemler;

public class C4_Modulus {

	public static void main(String[] args) {
		
		int num1=5496;
		int rakamlarToplami=0;
		
		//bir sayinin rakamlar toplaminin bulmak icin her basamak degerinde 3 islem yapariz
		//bu satirda num1=5496, rakamlarToplami=0
		//1- num1&10 ile son basamagý elde ederiz
		
		int rakam=num1 % 10;
		
		//2- bu rakami rakamlar toplamina ekleriz
		
		rakamlarToplami +=rakam;
		
		//3- degerini aldigimiz son basamaktan kurtulmak icin num1'i 10 boleriz
		
		num1/=10;
		
		// bu satira geldigimde num1=549, rakamlarToplami=6
		
		rakam= num1 % 10;
		
		rakamlarToplami +=rakam;
		
		num1 /= 10;
		
		//bu satira geldigimde num1=54, rakamlarToplami=15
		
		rakam= num1%10;
		
		rakamlarToplami +=rakam;
		
		num1 /=10;
		
		//bu satira geldigimde num1=5, rakamlarToplami=19
		
		rakam=num1%10;
		
		rakamlarToplami +=rakam;
		
		num1 /=10;
		
		//kodumuzun sonunda rakamlar toplami 24, sayi 0 oldu
		
		System.out.println("rakamlarýn toplami : " + rakamlarToplami + "\nnum1'in son degeri : " + num1);
		
		

		
		
	}

}
