//Praca domowa
//skorzystac z konstruktora i zamiast przypisywac pol po kolei, stworzyc nowy konstruktor ktory bedzie przyjmowal marke, model, rok i przebieg jako argumenty
public class AutoTest {
    public static void main(String[] args) {

        Auto mercedes = new Auto("Mercedes", "Klasa S", 2021, 1200, "pierwsze");


        mercedes.autoNumer();
        mercedes.info();

        Auto audi1 = new Auto("Audi", "S8", 2020, 1000, "drugie");

        audi1.autoNumer();
        audi1.info();



/*      Auto mercedes = new Auto(); // deklarujemy zmienna typu auto (klasy auto) > nazwa zmiennej > tworzymy nowy obiekt klasy auto
        mercedes.marka = "Mercedes"; // odwolujemy sie do zmiennej mercedes przechowujacej nasz obiekt i przypisujemy wartosci pol klasy auto
        mercedes.model = "Klasa S";
        mercedes.przebieg = 120000;
        mercedes.rok = 2020;*/

/*        mercedes.jedz();
        mercedes.hamuj();*//*
        mercedes.info();*/


        Auto audi = new Auto();  //trzecie auto moze byc zapisane w ten sposob, dlatego ze jest zdefiniowany konstruktor domyslny public auto
        audi.marka = "Audi";
        audi.model = "Q7";
        audi.przebieg = 1000;
        audi.rok = 2000;
        audi.numerAuta = "trzecie";

/*        audi.jedz();
        audi.hamuj();*/
        audi.autoNumer();
        audi.info();
    }
}
