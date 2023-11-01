package exceptions;

import java.util.Scanner;

public class ExceptionCheck  {

    public static void main(String[] args) throws InvalidAgeException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swój wiek");
        int wiek = scanner.nextInt();

        if (wiek < 0) {
            throw new InvalidAgeException("Wiek nie jest prawidłowy");
        }
        if (wiek > 18) {
            System.out.println("Jestes pelnoletni");
        } else
            System.out.println("Nie jestes pelnoletni");
    }
}
