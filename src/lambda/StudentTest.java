package lambda;

public class StudentTest {
    public static void main(String[] args) {
        Student it = new ItStudent();
        sayHello("John", it, 21);

        Student med = new Student() {
            @Override
            public void sayHello(String name, int age) {
                System.out.println("I will be a doctor");
                System.out.println("my name is " + name);
            }
        };


        sayHello("Kate", med, 31);

        //lambda zapis
        // (parametr) -> wyrażenie
        // (parametr) ->  System.out.println("I am not a student, My name is " + name);

        Student noStudent = (name, age) ->  System.out.println("I am not a student, My name is " + name + " I am " + age);
        sayHello("Tom", noStudent, 22);

        Student noStudentTwo = (name, age) -> {
            System.out.println("I am not a student, My name is " + name + " I am " + age);
            if (age > 18) {
                System.out.println("You can buy a beer");
            } else {
                System.out.println("You can't buy a beer");
            }
        };
            sayHello("Tom", noStudentTwo, 21);

    }

    public static void sayHello (String name, Student student, int age) {
        student.sayHello(name,age );
    }
}
