package day42_AbstractClasses_Examples;

public class Employee extends Human{
    private int calisanId;
    public Employee(String name, String surname, int calisanId){
        super(name,surname);
        this.calisanId=calisanId;
    }

    @Override
    public void calis() {
        if (calisanId==0){
            System.out.println("Sirket calisani degil"+"\nCalisanID: "+ calisanId);
        } else {
            System.out.println("Sirket calisani\nCalisanID: "+calisanId);
        }
    }

    public static void main(String[] args) {
        Employee secretar = new Employee("Merve","Aslan",0);
        Employee qaTester = new Employee("Mahmut","Tepe",1564);
        Employee developer = new Employee("Ayse","Tulun",4578);

        secretar.bilgilendirme();
        secretar.calis();

        qaTester.bilgilendirme();
        qaTester.calis();

        developer.bilgilendirme();
        developer.calis();

    }
}
