package day42_AbstractClasses;

public abstract class Volvo { // abstract class

    public abstract void kapi(); // abstract method
    public abstract void motor(); // abstract method

    int fiyat;

    public void sunroof(){ // concrete method
        System.out.println("Sunroof motor gucunden %10 eksiltir.");

    }
}
