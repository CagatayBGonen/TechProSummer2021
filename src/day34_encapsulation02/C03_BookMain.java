package day34_encapsulation02;
import java.util.Scanner;
public class C03_BookMain {
	/*
	 * Book class'i verilmistir.
	 * Iki tane attributes olusturunuz.
	 * bookName ve authorName (String ile)
	 * Book classini kapsülleyin. (encapsulate)
	 * Main classin icine object olusturun ve sonucu yazdiriniz.
	 * Output:
	 * "Book name is BOOKNAME and Author is AUTHORNAME"
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		C04_Book client1 = new C04_Book();
		System.out.print("kitap adi: ");
		client1.setBookName(scan.nextLine());
		System.out.print("kitap adi: ");
		client1.setAuthorName(scan.nextLine());
		System.out.println("Kitap adi: " + client1.getBookName() + "\nYazar: " + client1.getAuthorName());
		scan.close();
	}

}
