package day33_encapsulation01;

/* 1- filedlarý model(String), renk(String), motor(int), yil (int)
olan Araba  isimli bir class tanýmlayýnýz.
2- bütün fieldlarý parametre alan bir constructor tanýmlayýnýz.
3- bütün fieldlarý için getter ve setter metodlarý oluþturunuz.
4- ArabaMain isminde main için bir class oluþturunuz.
5- Ýki adet parametreli const 1 adet parametresiz cons ile 3 adet araba creat ediniz
6- araclarýn motor ve yýlýný hatalý veri girisine karsi kapsulleyiniz.
*/
public class C04_Araba {
	String model;
	String color;
	private int engine;
	private int year;

	public C04_Araba() {
		
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getEngine() {
		return engine;
	}

	public void setEngine(int engine) {
		if (engine>0) {
			this.engine = engine;
		} else this.engine = -engine;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if (year>0) {
			this.year = year;
		} else this.year = -year;
	}

	public C04_Araba(String model, String color, int engine, int year) {
		super();
		setModel(model);
		setColor(color);
		setEngine(engine);
		setYear(year);
		
	}

}
