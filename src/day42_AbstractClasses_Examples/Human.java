package day42_AbstractClasses_Examples;

public abstract class Human {
    private String name;
    private String surname;
    public Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    public abstract void calis();
    public void bilgilendirme(){
        System.out.println("Name: " + this.name +"\nSurname: "+this.surname);

    }
    public void changeName(String name,String surname){
        this.name=name;
        this.surname=surname;
    }

}
