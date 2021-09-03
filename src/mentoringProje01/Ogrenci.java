package mentoringProje01;

public class Ogrenci {
    private int ogrenciNo;
    private String name;
    private String surname;
    private double ort;
    public Ogrenci(){

    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", ort=" + ort +
                '}';
    }

    public Ogrenci(String name, String surname, double ort){
        this.name=name;
        this.surname=surname;
        this.ort=ort;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getOrt() {
        return ort;
    }

    public void setOrt(double ort) {
        this.ort = ort;
    }

    public void setOgrenciNo(int ogrenciNo){
        this.ogrenciNo = ogrenciNo;
    }
    public int getOgrenciNo(){
        return ogrenciNo;
    }
}
