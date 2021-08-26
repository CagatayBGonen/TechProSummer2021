package day33_encapsulation01;

public class C02_InsanMain {

	public static void main(String[] args) {
		C01_AdemOglu insan1 = new C01_AdemOglu(); // ademoglundan insan1 obj si create edildi.

//	    insan1.age = -47;
		insan1.name = "onu";
		insan1.surName = "enes";
		insan1.setAge(-45);
		System.out.println(insan1.name);
		System.out.println(insan1.surName);
		System.out.println(insan1.getAge());
	}

}
