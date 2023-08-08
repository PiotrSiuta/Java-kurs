public class KomputerTest {
    public static void main(String[] args) {
        Komputer komputer1 = new Komputer();

        komputer1.nazwaProducenta();
        komputer1.grafikaInfo();
        komputer1.pozostaleInfo();

        Komputer komputer2 = new Komputer();
        komputer2.pozostaleInfo();
    }
}
