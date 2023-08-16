public class Student {
    public String imie;
    public String nazwisko;
    public String nick;
    public String MyEmail;
    public Integer numerIndeksu;
    public static String nazwaUczelni = "AGH"; //pole statyczne bedzie wspoldzielone przez obiekty klasy Student np w klasie StudentTest ale nie bedzie przypisane konkretnie do obiektu

    public static  void infoUczelnia() {
        System.out.println("Moja uczelnia to AGH");
        druga();
    }

    public static void main(String[] args) {     //metoda statyczna, mozemy sie w niej odwolac do pol statycznych, charakterystycznych dla tej metody
                                                    // i wyloac wewnatrz niej inna metode, ale musi to byc metoda statyczna
        System.out.println("Moja uczelnia to " + nazwaUczelni);
    }
    public void przedstawSie() {
        System.out.println("Nazywam sie " + imie + " " + nazwisko);
    }

    public void zalogujSie () {
        System.out.println("Loguje sie za pomoca " + nick);
    }

    public void podajNumerIndeksu () {
        System.out.println("Moj numer indeksu to " + numerIndeksu);
    }

    public void podajEmail () {
        System.out.println("Moj email to " + MyEmail);

    }
    public static void druga() {
        System.out.println("Jestem druga metoda");;
    }
}
