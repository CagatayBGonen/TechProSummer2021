package day26_constructor_staticKeyword;

public class Rope {

	public static void swing() {
		System.out.print("swing ");
	}
	
	public void climb() {
		System.out.println("climb ");
	}
	
	public static void play() {
		swing();
		// climb(); // CTE compile time error
	}
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Rope rope = new Rope();
		rope.play(); 
		Rope rope2 = null;
		rope2.play();
	}

}
