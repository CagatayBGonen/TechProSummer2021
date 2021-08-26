package replit04;

import java.util.Scanner;

public class C01_If_Switch_Ternary_StringMethods01 {

	public static void main(String[] args) {
		/*
		 * Kullan�c�ya kilosunu ve boyunu sorun ve kitle indeksini hesaplayan bir
		 * program yaz�n (BMI)
		 * 
		 * IPUCU : BMI = Agirlik(kg) / Boy*Boy (m)
		 * 
		 * 
		 * BMI 18,5'in alt�ndaysa zay�fs�n�z
		 * 
		 * BMI 18,5 ile 25 aras�nda ise kilonuz idealdir
		 * 
		 * BMI 25-30 aras�ndaysa �i�mans�n�z
		 * 
		 * BMI 30'dan b�y�k veya e�itse, obez
		 * 
		 * 
		 * Input:
		 * 
		 * Output:
		 * 
		 * Agirlik : 71
		 * 
		 * Boy : 1,72
		 * 
		 * BMI : 23.99945916711736
		 * 
		 * Zayifsiniz.
		 */
		Scanner scan = new Scanner(System.in);

		System.out.print("Kilo : ");
		double kilo = scan.nextDouble();
		System.out.print("Boy : ");
		double boy = scan.nextDouble();
		
		double bmiSonuc = bmiMethod(kilo, boy);
		System.out.println("Agirlik : " + kilo + "\nBoy : " + boy
				+ "\nBMI : " + bmiSonuc);
		if (bmiSonuc < 18.5) {
			System.out.println("Zayifsiniz");
		} else if (bmiSonuc < 25) {
			System.out.println("Kilonuz idealdir");
		} else if (bmiSonuc < 30) {
			System.out.println("Sismansiniz");
		} else {
			System.out.println("Obez");
		}
		scan.close();
		
	}

	public static double bmiMethod(double kilo, double boy) {
		double bmi = kilo/(boy*boy);
		return bmi;
	}

}
