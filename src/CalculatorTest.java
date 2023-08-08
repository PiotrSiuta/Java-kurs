import java.sql.SQLOutput;
import java.util.Scanner;

//Praca Domowa
//Program, ktory poprosi uzytkownika o dwie liczby i wykona na nich podstawowe operacje matematyczne
public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe");
        int firstNumber = scanner.nextInt();
        System.out.println("Podaj druga liczbe");
        int secondNumber = scanner.nextInt();

        Calculator calculator = new Calculator();

        int resultAddition = calculator.add(firstNumber,secondNumber);
        int resultSubtraction = calculator.substraction(firstNumber,secondNumber);
        int resultMultiplication = calculator.multiplication(firstNumber, secondNumber);
        float resultDivision = calculator.division(firstNumber, secondNumber);
        int resultModule = calculator.modulo(firstNumber, secondNumber);


        System.out.println("Wynik dodawania dwóch podanych liczb wynosi " + resultAddition);
        System.out.println("Wynik odejmowania dwóch podanych liczb wynosi " + resultSubtraction);
        System.out.println("Wynik mnożenia dwóch podanych liczb wynosi " + resultMultiplication);
        System.out.println("Wynik dzielenia dwóch podanych liczb wynosi " + resultDivision);
        System.out.println("Wynik modulo dwóch podanych liczb wynosi " + resultModule);

        // mozna rowniez zapisac w ten sposob: wywolujac metode, bez przypisywania do zmiennych
        System.out.println("Drugi sposob zapisu, bez przypisywania do zmiennych a przez wywolanie metody");
        System.out.println("Wynik dodawania dwóch podanych liczb wynosi " + calculator.add(firstNumber, secondNumber));
        System.out.println("Wynik odejmowania dwóch podanych liczb wynosi " + calculator.substraction(firstNumber, secondNumber));
        System.out.println("Wynik mnożenia dwóch podanych liczb wynosi " + calculator.multiplication(firstNumber, secondNumber));
        System.out.println("Wynik dzielenia dwóch podanych liczb wynosi " + calculator.division(firstNumber, secondNumber));
        System.out.println("Wynik modulo dwóch podanych liczb wynosi " + calculator.modulo(firstNumber, secondNumber));

    }
}
