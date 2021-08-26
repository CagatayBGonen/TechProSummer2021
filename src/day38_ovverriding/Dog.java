package day38_ovverriding;

public class Dog extends Animal {

	@Override // Annotation --> mutlaka child'a yazilir. parent ve child methodlarinda iliþki
				// kurar.
	public void beslenme() {
		System.out.println("kemik ile beslenir");
	}

	@Override
	public void tatli() {
		System.out.println("fistik sarma");
	}

	@Override
	public String icecek() {
		System.out.println("tursu suyu");
		return "yarasin";
	}

	@Override
	public Integer topla() {
		return 41 + 54;
	}

	@Override
	public Dog fatih() { // parent - child relations. trick!!!
		
		return new Dog();// parent - child relations. trick!!!
	}

}
