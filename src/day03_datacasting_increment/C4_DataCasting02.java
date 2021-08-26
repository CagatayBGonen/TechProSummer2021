package day03_datacasting_increment;

public class C4_DataCasting02 {

	public static void main(String[] args) {
		
		double num1 = 200.14;
		
		System.out.println("double degisken ile : " + num1);
		
		int num2 = (int)num1;
		
		System.out.println("int degisken ile : " + num2);
		
		byte num3 = (byte)num2;
		
		System.out.println("byte degsiken ile : " + num3);
		
		int num4 = 95;
		int num5 = 10;
		
		
		System.out.println("bolme sonucu : " + num4/num5);
		
		//bolunen sayi ve bolen sayi ikisi de int ise java int olarak verir
		
		
		double num6 = 2000;
		
		System.out.println(num6/num5); // 200.0
		
		double num7 = 5;
		
		System.out.println(num4/num7); // 19.0
		
		
	}

}
