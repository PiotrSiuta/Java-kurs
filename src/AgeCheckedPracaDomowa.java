
// Zapytaj użytkowanika o wiek:
// 1. W przypadku gdy ma mniej niz 18 lat wypisz na ekranie, że nie może kupić alkoholu
// 2. W przypadku gdy ma 18 i więcej, wypisz na ekranie podziekowanie za zakupy

import java.util.Scanner;

public class AgeCheckedPracaDomowa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swój wiek");
        int wiek = scanner.nextInt();

        if (wiek < 18 && wiek >= 0) {
            System.out.println("Nie możesz kupić alkoholu, poniewaz nie masz 18 lat");
        } else if (wiek < 0) {
            System.out.println("Wprowadz poprawna wartosc");
        } else {
            System.out.println("Dziękuje za zakupy");
        }
    }
}