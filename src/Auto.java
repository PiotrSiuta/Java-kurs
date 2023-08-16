public class Auto {

    public String marka; //pole klasy auto
    public String model;
    public int rok;
    public int przebieg;
    public String numerAuta;

    public Auto (){

    }

    public Auto(String marka, String model, Integer rok, Integer przebieg, String numerAuta) {
        this.marka = marka;
        this.model = model;
        this.rok = rok;
        this.przebieg = przebieg;
        this.numerAuta = numerAuta;
    }

    public void autoNumer() {
        System.out.println("To jest " + numerAuta + " auto");
    }

    public void info() {
        System.out.println("Marka " + marka);
        System.out.println("Model " + model);
        System.out.println("Rok produkcji " + rok);
        System.out.println("Przebieg " + przebieg);
    }
}
