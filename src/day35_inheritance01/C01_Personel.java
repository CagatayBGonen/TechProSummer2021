package day35_inheritance01;

public class C01_Personel {
	public static int sayac = 1000;
	public int id;
	public String isim;
	public String soyisim;
	public String adres;
	public String tel;

	public int idAta() {
		this.id = sayac++;
		return id;
	}
}
