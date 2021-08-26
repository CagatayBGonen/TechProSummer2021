package day33_encapsulation01;

public class C03_ArabaMain {
	public static void main(String[] args) {
		C04_Araba volvo = new C04_Araba("xc90", "beyaz", -2400, -2020);
		C04_Araba audi = new C04_Araba("Q7", "bej", -3000, -2021);
		C04_Araba honda = new C04_Araba();
		
		honda.model="accord";
		honda.color="gri";
		honda.setYear(1990);
		honda.setEngine(1400);
		System.out.println("Honda yil: "+honda.getYear());
		System.out.println("Honda engine: "+honda.getEngine());
		System.out.println("Volvo engine: " + volvo.getEngine()); 
		System.out.println("audi yil: " +  audi.getYear());
	}
}
