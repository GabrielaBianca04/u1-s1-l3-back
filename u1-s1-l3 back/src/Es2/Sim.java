package Es2;


public class Sim {
    //Attributi
    public String numero;
    public double credito;
    public int chiamateEffettuate;

    //Costruttore
    public Sim(String numero, double credito, int chiamateEffettuate) {
        this.numero = numero;
        this.credito = 0;
        this.chiamateEffettuate = 0;
    }

    public String getNumero(){
        return numero;
    }
    public double getCredito(){
        return credito;
    }
    public double getChiamateEffettuate(){
        return chiamateEffettuate;

    }
    public void stampaSim() {
        System.out.println("Il numero della Sim è"+ numero());
        System.out.println("Il tuo credito residuo è "+ credito());
    }


}
