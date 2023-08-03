public class Student {
    public String imie;
    public String nazwisko;
    public String nick;
    public String email;
    public String numerIndeksu;

    public void przedstawSie() {
        System.out.println("Nazywam sie " + imie + nazwisko);
    }

    public void zalogujSie () {
        System.out.println("Loguje sie za pomoca " + nick);
    }

    public void podajNumerIndeksu () {
        System.out.println("Moj numer indeksu to " + numerIndeksu);
    }

    public void setNumerIndeksu () {
        System.out.println("Moj numer indeksu to " + numerIndeksu);
    }
}
