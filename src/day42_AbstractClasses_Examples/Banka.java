package day42_AbstractClasses_Examples;

public abstract class Banka {
    double bakiye;

    public Banka(double bakiye) {
        this.bakiye = bakiye;
    }
    public Banka() {
        System.out.println("hesap harektleri...");
    }

    public abstract double paraYatir(double amounth);
    public abstract double paraCek(double amounth);
}
