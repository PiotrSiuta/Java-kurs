// Wypisz liczby z zakresu 1-100 podzielne przez 3
// odwrocic elementy w tablicy
public class TablicePetlePracaDomowa {
    public static void main(String[] args) {
        int[] tablica = new int[100];
        for (int i = 100; i >= 0; i--) {
            if (i % 3 == 0) {
                System.out.println("Tablica 100 elementowa z ktorej wypisano tylko liczby podzielne przez 3. Kolejna liczba podzielna przez 3 to: " + i);
/*                for (int j = 100; j <= 0; j--) {
                    System.out.println("Odwrócone elementy w tablicy " + i);
                }*/
            }
        }
    }
}