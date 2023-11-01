package lambda;

import static lambda.StudentTest.sayHello;

public class StudentTest2 {
    public static void main(String[] args) {
        Student student2 = (name, age) -> System.out.println("New student2 named "+ name + ". His age is " + age);
        sayHello("Peter", student2, 33);
    }
}
