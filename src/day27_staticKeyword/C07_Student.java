package day27_staticKeyword;

public class C07_Student {
	int number;
	String name;
	static String college = "ITS";
	
	
	@SuppressWarnings("static-access")
	C07_Student(int r, String n, String college){
		this.number = r;
		this.name = n;
		this.college = college;
	}
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		C07_Student s1 = new C07_Student(111,"Karan","MIT"); 
		C07_Student s2 = new C07_Student(222,"Aryan","Harvard");
		
		System.out.println(s1.number); // 111
		System.out.println(s2.number); // 222
		
		System.out.println(s1.name); // Karan
		System.out.println(s2.name); // Aryan
		
		System.out.println(s1.college); // Harvard
		System.out.println(s2.college); // harvard
		
	
	
	
	
	}

}
