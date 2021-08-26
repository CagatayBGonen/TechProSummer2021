package day39_overriding02;

public class Arac {
	/*
	 * 1- Arac isimli bir superclass olusturunuz, fields: renk, motor(private), model(protected)olsun.
	 * 2- constructor ekleyiniz. get ve set methodlari ve toString methodunu ekleyiniz.
	 * 3- Bu sýnýftan otobus sinifini uretiniz, otobusun ayrica yolcuSayisi field ini ekleyiniz.
	 * 4- bir AracPark isimli icinde main olan bir sinif olusuturunuz ve otobus ten obj olusturarak, otobusun ozelliklerinin tumunu ekrana yazdiriniz.
	 */
	private String renk;
	private int motor;
	protected String model;
		
	public Arac(String renk, int motor, String model) {	
		setRenk(renk);
		setMotor(motor);
		setModel(model);
	}

	public String getRenk() {
		return renk;
	}
	public void setRenk(String renk) {
		this.renk = renk;
	}
	public int getMotor() {
		return motor;
	}
	public void setMotor(int motor) {
		this.motor = motor;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model=model;
	}
	
}
