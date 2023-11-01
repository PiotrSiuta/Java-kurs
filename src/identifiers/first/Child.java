package identifiers.first;

public class Child extends Parent {


    //klasa potomna w tej samej paczce nie ma dostepu do pol/metod jesli sa one private
    //private dostepy jest tylko wewnatrz danej klasy
    public void testIdentifier() {
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        firstMethod();
        secondMethod();
        thirdMethod();
    }
}
