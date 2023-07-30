import java.util.Scanner;

public class OperatoryPorownania {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbę do porównania");
        int firstNumber = scaner.nextInt();
        System.out.println("Podaj drugą liczbe do porównania");
        int secondNumber = scaner.nextInt();
        System.out.println("Podane liczby do porównania to " + firstNumber + " i " + secondNumber);
/*
        boolean result = secondNumber > firstNumber; //true

        System.out.println(result);*/
        System.out.println("Czy a jest większe b? " + (firstNumber > secondNumber)); //false
        System.out.println("Czy a jest mniejsze b?4 " + (firstNumber < secondNumber)); //true
        System.out.println("Czy a jest większe lub równe b? " + (firstNumber >= secondNumber)); //false
        System.out.println("Czy a jest mniejsze lub równe b? " + (firstNumber <= secondNumber)); //true
        System.out.println("Czy a jest równe b? " + (firstNumber == secondNumber)); //false
        System.out.println("Czy a jest różne od b? " + (firstNumber != secondNumber)); //true
    }
}
