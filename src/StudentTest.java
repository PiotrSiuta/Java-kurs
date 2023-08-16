public class StudentTest {
    public static void main(String[] args) {

        Student.nazwaUczelni = Student.nazwaUczelni;
        //Student.infoUczelnia();

        Student student1 = new Student();
        student1.imie = "Piotr";
        student1.nazwisko = "Siuta";
        student1.numerIndeksu = 11111;
        student1.nick = "nickPiotr";
        student1.MyEmail = "piotr@email.com";
        String uczelniaPiotra = student1.nazwaUczelni;
        student1.infoUczelnia();


        Student student2 = new Student();
        student2.imie = "Tomasz";
        student2.nazwisko = "Kowalczyk";
        student2.numerIndeksu = 22222;
        student2.nick = "nickTomasz";
        student2.MyEmail = "tomasz@email.com";
        String uczelniaTomasza = student2.nazwaUczelni;

        Student student3 = new Student();
        student3.imie = "Wojciech";
        student3.nazwisko = "Malinowski";
        student3.numerIndeksu = 33333;
        student3.nick = "nickWojciech";
        student3.MyEmail = "wojciech@email.com";
        String uczelniaWojciecha = student3.nazwaUczelni;

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
