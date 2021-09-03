package day43_Interface;

public class Sahin extends Tofas implements Interior,Exterior{
    @Override
    public void engine() {
        System.out.println("1.6 aile motoru");
    }

    @Override
    public void fuel() {
        System.out.println("tup takmassan cok yakar");
    }

    @Override
    public void mirror() {
        System.out.println("her zaman temiz olsun");
    }

    @Override
    public void door() {
        System.out.println("disariya acilan kapi");
    }

    @Override
    public void kaporta() {
        System.out.println("saglam maasallah");
    }

    @Override
    public void seat() {
        System.out.println("5 tane var daha ne olsun");
    }
}
