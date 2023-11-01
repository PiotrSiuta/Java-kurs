public class PersonTest {
    public static void main(String[] args) {
        MathTeacher teacher = new MathTeacher("tom", 29, "university");
        teacher.walk();
        teacher.eat();
        teacher.sayHello();
        teacher.teachMath();


        Footballer footballer = new Footballer("Mike", 30, "Real Madrid");
        footballer.playFootbal();
        footballer.eat();
    }
}
