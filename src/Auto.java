public class Auto {

    public String marka; //pole klasy auto
    public  String model;
    public int rok;
    public int przebieg;

    public void jedz() {
        System.out.println("jedz");
    }

    public void hamuj() {
        System.out.println("hamuj");
    }

    public void info () {
        System.out.println("Marka " + marka);
        System.out.println("Model " + model);
        System.out.println("Rok produkcji " + rok);
        System.out.println("Przebieg " + przebieg);
    }
}
