package lambda;
//interfejs funkcjonalny  - moze byc tylko jedna metoda zdeficniowana

@FunctionalInterface
public interface Student {

    void sayHello(String name, int age);
}
