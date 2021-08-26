package day40_exceptions;

public class Soru03 {

	public static void main(String[] args) {
		System.out.println(exceptions());

	}
	@SuppressWarnings("finally")
	public static String exceptions() {
		String result ="";
		String v = null;
		
		try {
			try {
				result=result+"a"; // a
				v.length(); // RTE
				result=result+"b"; // yukaridaki hata bu satiri yoksaydi.
			}catch(NullPointerException e) {
				result=result+"c"; // ac
			}finally {
				result=result+"d"; // acd
				throw new Exception(); // altaki catcha firlatti.
			}
		}catch(Exception e) {
			result = result+"e"; // acde
		}
		
		
		return result;
	}

}
