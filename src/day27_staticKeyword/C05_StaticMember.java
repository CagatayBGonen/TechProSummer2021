package day27_staticKeyword;

public class C05_StaticMember {
	static int x;
	int y;
	
	C05_StaticMember(){
		x += 2;
		y++;
	}
	static int getSquare() {
		return x*x;
	}
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		C05_StaticMember sm1 = new C05_StaticMember(); // x=2 | y=1
		C05_StaticMember sm2 = new C05_StaticMember(); // x=4 | y=1
		
		int z = sm1.getSquare();// 4*4=16
		System.out.println("-x"+ z + "-y" + sm2.y); // -x16-y1

	}

}
