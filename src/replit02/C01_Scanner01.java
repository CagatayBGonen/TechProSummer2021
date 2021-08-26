package replit02;
import java.util.Scanner;
public class C01_Scanner01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
	    System.out.print("Lutfen bir tamsayi giriniz : ");
		int num1 = scan.nextInt();

	    System.out.println((num1*num1*num1)/2);
	    scan.close();
	  }
	}
