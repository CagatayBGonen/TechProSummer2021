package day42_AbstractClasses;

public abstract class Kaporta extends Volvo{
    @Override
    public void kapi() { // abs parent class volvo'daki abs method concrete oldu.(somut oldu)
        System.out.println("volvo kapilari cok saglam.");
    }
//  final abstract void kapiKolu(); final abs olmaz
//  private abstract void mentese(); private abs olmaz
//  static abstract void tasla(); static abs olmaz
}
