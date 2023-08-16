public class MathTeacher extends Person {

    public String school;

    public MathTeacher(String name, int age) {
        super(name, age);
        System.out.println("jestem w konstruktorze MathTechaer");
        this.school = school;
    }

    public void teachMath(){
        System.out.println("I am teaching math");
    }

    public void sayHello() {
        System.out.println("Hello my name is " + name);
        System.out.println("I am " + age);
    }
}
