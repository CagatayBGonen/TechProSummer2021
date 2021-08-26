package day31_varags_stringBuilder;

public class C04_StringBuilder {

	public static void main(String[] args) {

		StringBuilder sb1 = new StringBuilder(); // bos bir SB olusturur
		System.out.println("sb1 : " + sb1);

		StringBuilder sb2 = new StringBuilder("mehmet"); // icinde "mehmet" degeri olan bir SB uretir
		System.out.println("sb2 : " + sb2);

		StringBuilder sb3 = new StringBuilder(10); // 10 karakter kapasitesi olan bir SB uretir
		System.out.println("sb3 : " + sb3);

		sb1.append(" Hoca");
		System.out.println("sb1 append: " + sb1);// sb1 append: Hoca

		sb2.append(" Hoca");
		System.out.println("sb2 append: " + sb2); // sb2 append: mehmet Hoca

		sb3.append(" Hoca");
		System.out.println("sb3 append: " + sb3); // sb3 append: Hocam

		System.out.println("sb1 uzunluk " + sb1.length()); // 5
		System.out.println("sb1 kapasite " + sb1.capacity()); // 16
		
		System.out.println("sb2 uzunluk " + sb2.length()); // 11
		System.out.println("sb2 kapasite " + sb2.capacity()); // 22
		
		System.out.println("sb3 uzunluk " + sb3.length()); // 5
		System.out.println("sb3 kapasite " + sb3.capacity()); // 10
		
		//capacity, hafiza yonetimi icin cok onemli
		// kod yazilirken sabit uzunluk veya max uzunluýk belli ise
		// 3. method ile olusturarak hafiza kullanimini optimize edebliriz.
	}

}
