package day35_inheritance01;

public class C04_Isci extends C02_Muhasebe {
	public static void main(String[] args) {
		C04_Isci isci1 = new C04_Isci();
		isci1.isim = "Murat";
		isci1.soyisim = "Kaygusuz";
		isci1.adres = "isci1 in adresi";
		isci1.saatUcreti = 10;
		isci1.statu = "kalfa";
		isci1.tel = "9834234";
		isci1.id = isci1.idAta();
		isci1.maas = isci1.maasHesapla();
		C04_Isci isci2 = new C04_Isci();
		isci2.isim = "Faruk";
		isci2.soyisim = "Abdal";
		isci2.adres = "isci2 in adresi";
		isci2.saatUcreti = 15;
		isci2.statu = "UstaBasi";
		isci2.tel = "2984923048";
		isci2.id = isci2.idAta();
		isci2.maas = isci2.maasHesapla();
		System.out.println("isim-soyisim: " + isci1.isim +" "+isci1.soyisim + "\ntel: " + isci1.tel + "\nadres: " + isci1.adres
				+ "\nsaatlik UCret: " + isci1.saatUcreti + "\nstatu: " + isci1.statu + "\nID: " + isci1.id
				+ "\nMaas: " + isci1.maas);
		System.out.println("---------------------------");
		System.out.println("isim-soyisim: " + isci2.isim +" " + isci2.soyisim + "\ntel: " + isci2.tel + "\nadres: " + isci2.adres
				+ "\nsaatlik UCret: " + isci2.saatUcreti + "\nstatu: " + isci2.statu + "\nID: " + isci2.id
				+ "\nMaas: " + isci2.maas);
	}
}
