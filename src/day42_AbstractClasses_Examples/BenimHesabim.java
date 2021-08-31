package day42_AbstractClasses_Examples;

public class BenimHesabim extends Banka{
    public BenimHesabim(double bakiye) {
        super.bakiye=bakiye;
        System.out.println(bakiye);
    }

    @Override
    public double paraYatir(double amounth) {
        super.bakiye+=amounth;
        return bakiye;
    }

    @Override
    public double paraCek(double amounth) {
        super.bakiye-=amounth;
        return bakiye;
    }


}
