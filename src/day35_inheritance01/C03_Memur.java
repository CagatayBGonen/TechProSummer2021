package day35_inheritance01;

public class C03_Memur extends C02_Muhasebe {
	public static void main(String[] args) {
		C03_Memur memur1 = new C03_Memur();
		memur1.isim = "Cumali";
		memur1.soyisim = "Korkmaz";
		memur1.adres = "memur 1 in adresi";
		memur1.saatUcreti = 20;
		memur1.statu = "chef";
		memur1.tel = "12345";
		memur1.id = memur1.idAta();
		memur1.maas = memur1.maasHesapla();
		C03_Memur memur2 = new C03_Memur();
		memur2.isim = "Ahmet";
		memur2.soyisim = "Yýlmaz";
		memur2.adres = "memur 2 in adresi";
		memur2.saatUcreti = 25;
		memur2.statu = "Masterchef";
		memur2.tel = "98765";
		memur2.id = memur2.idAta();
		memur2.maas = memur2.maasHesapla();
		System.out.println("isim-soyisim: " + memur1.isim +" "+memur1.soyisim + "\ntel: " + memur1.tel + "\nadres: " + memur1.adres
				+ "\nsaatlik UCret: " + memur1.saatUcreti + "\nstatu: " + memur1.statu + "\nID: " + memur1.id
				+ "\nMaas: " + memur1.maas);
		System.out.println("---------------------------");
		System.out.println("isim-soyisim: " + memur2.isim +" " + memur2.soyisim + "\ntel: " + memur2.tel + "\nadres: " + memur2.adres
				+ "\nsaatlik UCret: " + memur2.saatUcreti + "\nstatu: " + memur2.statu + "\nID: " + memur2.id
				+ "\nMaas: " + memur2.maas);
	}
}
