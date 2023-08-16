public class UserTest {

    public static void main(String[] args) {

       // User user = new User();   //konstruktor, to specjalna metoda ktora wywolywana jest podczas tworzenia obiektu
        User user = new User("Piotrekkk", "Hello");
        //User user2 = new User("Krzysiek", "Hello");


/*      user.username = "Piotrek";
        user.password = "haslo1";*/
        System.out.println(user.username);
        System.out.println(user.password);
        //System.out.println(user2.username);
        //user.sayHello();
        user.sayHello();

    }
}
