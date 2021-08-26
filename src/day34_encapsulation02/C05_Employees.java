package day34_encapsulation02;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class C05_Employees {
	private String name;
	private int salary;
	private String dob;
	
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getDob() {
		return dob;
	}
	public int ageCalculator(String dob) {
		String strDate = dob;
	
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		LocalDate now = LocalDate.now();
		LocalDate bDate = LocalDate.parse(strDate, dtf);
	
		int age = now.getYear() - bDate.getYear();
		return age;
	}
	

}
