package day41_ErrorsGarbage;

public class Final01 {

    static final int AGE = 33;

    public static void main(String[] args) {
      // AGE=34;  final modifier ile veri degistirilemez.
        int zam = 3000;
        final int maas = 5000;
        // maas+=zam; final keyword ile declare edilmis verable'a deger atanamaz!
    }
}
