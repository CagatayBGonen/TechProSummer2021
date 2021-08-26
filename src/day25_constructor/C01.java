package day25_constructor;

public class C01 {

	public int ilanNo;
	public String marka;
	public String model="yazilmadi";
	public int yil=1900;
	public int fiyat; 

	public C01(int ilanNo, String marka, String model, int yil) {
		super();
		this.ilanNo = ilanNo;
		this.marka = marka;
		this.model = model;
		this.yil = yil;
	}

	C01(int ilanNo, String marka, String model, int yil, int fiyat) {
		this.ilanNo=ilanNo;
		this.marka=marka;
		this.model=model;
		this.yil=yil;
		this.fiyat=fiyat;
	}
	// eger parametreli bir constructor olusturursak java default olani oldurur
	// bu durumda projemizde aksama olmamasi icin default constructor yerine
	// parametresiz bir constructor'i biz olusuturmaliyiz

	C01() {

	}

	C01(int ilanNo, String marka, int fiyat) {
		this.ilanNo=ilanNo;
		this.marka=marka;
		this.fiyat=fiyat;
	}

	public void maxHiz(int hiz) {
		System.out.println("Araba " + hiz + " km hiz yapabilir");
	}

	public void yakit(String yakitTuru) {
		System.out.println("Araba yakit olarak " + yakitTuru + " kullanilir");
	}

}
