public class StudentTest {
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.imie = "Piotr1";
        student1.nazwisko = "Siuta1";
        student1.numerIndeksu = 11111;
        student1.nick = "myNick1";
        student1.MyEmail = "myEmail1";

        Student student2 = new Student();
        student2.imie = "Piotr2";
        student2.nazwisko = "Siuta2";
        student2.numerIndeksu = 22222;
        student2.nick = "myNick2";
        student2.MyEmail = "myEmail2";

        Student student3 = new Student();
        student3.imie = "Piotr3";
        student3.nazwisko = "Siuta3";
        student3.numerIndeksu = 33333;
        student3.nick = "myNick3";
        student3.MyEmail = "myEmail3";

        Student[] students = new Student[3];
        students[0] = student1;
        students[1] = student2;
        students[2] = student3;

        for (int i = 0; i < students.length; i++) {
            students[i].przedstawSie();
            students[i].podajEmail();
            students[i].podajNumerIndeksu();
            students[i].zalogujSie();

        }
    }
}
