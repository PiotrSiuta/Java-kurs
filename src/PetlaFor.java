public class PetlaFor {
    public static void main(String[] args) {

        //wypisac liczby od 0 do 100, wypisujac co 2 liczbe

        // i = specjalna zmienna sterujaca, ustawiajaca wartosc poczatkowa, w tym wypadku zaczynamy od 0 wiec i = 0
/*        for (int i = 0; i < 100; i = i+2) {
            System.out.println(i);
        }*/
        for ( int i = 0; i < 100; i++){
            if (i%10==0){
                System.out.println(i);
            }
        }
    }
}
