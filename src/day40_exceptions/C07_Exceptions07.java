package day40_exceptions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C07_Exceptions07 {
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		
		System.out.println(arr[1]);//2
		System.out.println(arr[3]);//4
	//	System.out.println(arr[5]);//ArrayIndexOutOfBoundsException(unchecked)(RTE)
		
		List<String> gzlinsn= new ArrayList<>(Arrays.asList("merve","hakan","firat"));
		
		System.out.println(gzlinsn.get(2)); // firat
		System.out.println(gzlinsn.get(0)); // merve
	//	System.out.println(gzlinsn.get(5));//IndexOutOfBoundsException (Unchecked)(RTE)
		
		// Array ve List'lerde olmayan bir index ile islem yapilirsa
		// java IndexOutOfBoundsException unchecked hatasi verir.
		
		
		
		
		
		
		
	
	
	
	}
}
