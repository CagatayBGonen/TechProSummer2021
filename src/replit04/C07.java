package replit04;

import java.util.Scanner;

public class C07 {

	public static void main(String[] args) {
		// 2 kelime olu�turun: isim1 ve isim2

		// isim1 �ift say�da karakter i�eriyorsa,

		// ikinci kelimeyi ilk ad�n ortas�na yerle�tirin

		// ilk kelime tek sayida karakter iceriyorsa

		// �isim1, isim2 ye eklenemiyor� yazd�r�n

		// �rne�in:
		// isim1= mehmet
		// isim2= ahmet
		// Yazd�r ==> mehahmetmet

		// isim1= memet
		// isim2= ahmet
		// Yazd�r ==> isim1, isim2 ye eklenemiyor
		
		Scanner scan = new Scanner(System.in);
		System.out.print("1. kelime : ");
		String isim1 = scan.next();
		System.out.print("2. kelime : ");
		String isim2 = scan.next();
		
		if (isim1.length()%2==0) {
			String yeniKelime = isim1.substring(0, isim1.length()/2) + isim2 + isim1.substring(isim1.length()/2);
			System.out.println(yeniKelime);
		} else {
			System.out.println("isim1, isim2 ye eklenemiyor");
		}
		scan.close();
		

	}

}
