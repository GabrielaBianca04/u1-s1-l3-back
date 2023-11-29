package Es1;

public class Rettangolo {
    // ATTRIBUTI
    public double b;
    public double h;

    //COSTRUTTORE
    public Rettangolo(double b, double h) {
        this.b = b;
        this.h = h;
    }
//GETTER
    public double getB(){
        return b;
    }
    public double getH(){
        return h;
    }

    //SETTER
    public double setB(double b){
        return this.b=b;
    }

    public double setH(double h){
        return this.h=h;
    }


    //METODI
    public double perimetro() {
        return 2 * (b + h);
    }

    public double area() {
        return b * h;
    }

    public void stampaRettangolo() {
        System.out.println("L'area del rettangolo è "+ this.area());
        System.out.println("Il perimetro del rettangolo è "+ this.perimetro());
    }
}
