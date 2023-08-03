public class AutoTest {
    public static void main(String[] args) {

        Auto mercedes = new Auto(); // deklarujemy zmienna typu auto (klasy auto) > nazwa zmiennej > tworzymy nowy obiekt klasy auto
        mercedes.marka = "Mercedes"; // odwolujemy sie do zmiennej mercedes przechowujacej nasz obiekt i przypisujemy wartosci pol klasy auto
        mercedes.model = "Klasa S";
        mercedes.przebieg = 120000;
        mercedes.rok = 2020;

        mercedes.jedz();
        mercedes.hamuj();
        mercedes.info();

        Auto audi = new Auto();
        audi.marka = "Audi";
        audi.model = "Q7";
        audi.przebieg = 1000;
        audi.rok = 2000;

        audi.jedz();
        audi.hamuj();
        audi.info();
    }
}
