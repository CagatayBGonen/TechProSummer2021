package day34_encapsulation02;

import java.util.Scanner;

public class C06_EmployeesMain {
	/*
	 * Burada iki adet class vardýr. Biri Main diðeri ise Employees,
    Employees(Çalýþanlar) class'ýnda;
    Bu variable'larý oluþturunuz;
    private String name,
    private int salary,
    private String dob (date of birth) (Doðum tarihi)
    getter ve setter oluþturunuz.
 Main class'ýn içinde; kullanicidan name dob ve slary bilgilerini alip
    Eðer employee 18 yaþýnda büyükse, Welcome to our company Fernando your salary is 80000. yazdýrýnýz.
    Eðer Fernando 18 yaþýndan küçükse, come back when you are 18 years old. yazdýrýnýz.
    Eðer Fernando 18 yaþýndaysa,  we can have inter with you after that you can have a 80000 salary yazdýrýnýz.
  Örnek:
    Name is Fernando
    dob is 11/23/2000
    Salary is 80000
todo  ageCalculator isminde bir method oluþturunuz. Þuanki tarih - doðum yýlý = employee age
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		C05_Employees em1 = new C05_Employees();
		System.out.print("Calisanin adi: ");
		em1.setName(scan.nextLine());
		System.out.print("Dogum tarihi(MM/dd/yyyy): ");
		em1.setDob(scan.nextLine());
		System.out.print("Istenilen maas: ");
		em1.setSalary(scan.nextInt());
		int empAge = em1.ageCalculator(em1.getDob());
		System.out.println("Name is " + em1.getName() + "\nDate of birth is " + em1.getDob() + "\nExpected salary is " + em1.getSalary());
		if (empAge>18) {
			System.out.println("Welcome to our company " + em1.getName() + ".\nYour salary is " + em1.getSalary());
		} else if (empAge<18) {
			System.out.println("come back when you are 18 years old.");
		} else {
			System.out.println("we can have inter with you.\nAfter that you can have a " + em1.getSalary() + " salary.");
		}
		
		
		
		scan.close();
	}

}
