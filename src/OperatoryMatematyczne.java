public class OperatoryMatematyczne {

    public static void main(String[] args) {
        int firstNumber = 4;
        int secondNumber = 6;
        float thirdNumber = 4.0F;

        int addition = firstNumber + secondNumber;  //10
        int subtraction = firstNumber - secondNumber;  //-2
        int multiplication = firstNumber * secondNumber; //24
        double division = thirdNumber / secondNumber; // 0,66
        int mod = secondNumber % firstNumber; //1, reszta 2

       /* System.out.println("Wynik dodawania = " + addition);
        System.out.println("Wynik odejmowania = " + subtraction);
        System.out.println("Wynik mnożenia = " + multiplication);
        System.out.println("Wynik dzielenia = " + division);
        System.out.println("Wynik modulo = " + mod);*/

        firstNumber+=secondNumber; //firstNumber = firstNumber (4) + secondNumber (6)
        System.out.println("Po dodaniu " + firstNumber);   //10
        firstNumber-=secondNumber;  //firstNumber (ktore teraz jest 10 bo wartosc zmiennej firstNumber zostala nadpisana przez powyzsza operacje) - secondNumber
        System.out.println("Po odjeciu " + firstNumber); //4
        firstNumber*=secondNumber; // firstNumber (4) * secondNumber (6)
        System.out.println("Po mnożeniu " + firstNumber); //24
        firstNumber/=secondNumber; // firstNumber (4) / secondNumber (6) //
        System.out.println(("Po dzieleniu " + firstNumber)); //4
        firstNumber%=secondNumber; // firstNumber % secondNumber
        System.out.println("Modulo " + firstNumber);

    }
}
