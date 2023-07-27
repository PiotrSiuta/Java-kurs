import java.util.Scanner;

//Praca Domowa
//Program, ktory poprosi uzytkownika o dwie liczby i wykona na nich podstawowe operacje matematyczne
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe");
        int firstNumber = scanner.nextInt();
        System.out.println("Podaj druga liczbe");
        int secondNumber =scanner.nextInt();

        int resultAddition = firstNumber + secondNumber;
        int resultSubtraction = firstNumber - secondNumber;
        int resultMultiplication = firstNumber * secondNumber;
        float resultDivision = firstNumber / secondNumber;
        int resultModule = firstNumber % secondNumber;

        System.out.println("Podstawowe operacje matematyczne");
        System.out.println("Wynik dodawania dwóch podanych liczb wynosi " + resultAddition);
        System.out.println("Wynik odejmowania dwóch podanych liczb wynosi " + resultSubtraction);
        System.out.println("Wynik mnożenia dwóch podanych liczb wynosi " + resultMultiplication);
        System.out.println("Wynik dzielenia dwóch podanych liczb wynosi " + resultDivision);
        System.out.println("Wynik modulo dwóch podanych liczb wynosi " + resultModule);
    }
}
