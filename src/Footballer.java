public class Footballer extends Person {

    public String footballClub;

    public Footballer(String name, int age, String footballClub) {
        super(name, age);
        System.out.println("jestem w konstruktorze Footballer");
        this.footballClub = footballClub;
    }

    public void eat() {
        System.out.println("I like healthy food !");
    }
    public void playFootbal(){
        System.out.println("I am playing football");
        System.out.println("My fav club is " + footballClub);
    }
}
