public class OperatoryLogiczne {
    public static void main(String[] args) {
        boolean firstValue = true;
        boolean secondValue = false;
        boolean thirdValue = true;
        boolean forthValue = false;

        //&& operator "i", ktory sprawdza wartośc pierwszego wyrazenia i drugiego wyrazenia i zwroci wartosc true, wtedy gdy wyrazenia skladowe sa rowne true
        System.out.println(firstValue && secondValue); //false
        System.out.println(firstValue && thirdValue); // true
        System.out.println(secondValue && forthValue); // false

        // || operator "lub", ktory sprawdza czy jedno z wyrazen skladowych jest rowne true
        System.out.println(firstValue || secondValue); //true
        System.out.println(secondValue || forthValue); //false

        // ! operator negacji, ktora zwraca wartośc przeciwną do wyrażenia, przed ktorym sie znajduje
        System.out.println(!firstValue); //false
        System.out.println(!thirdValue); //true
        System.out.println(! (firstValue && secondValue)); //z wyrazenia otrzymujemy wartosc false, natomiast uzylismy negacji przed wyraeniem, wiec zwroci nam wartosc true
    }
}
