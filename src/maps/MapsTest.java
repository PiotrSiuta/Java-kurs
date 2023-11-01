package maps;

import java.util.HashMap;
import java.util.Map;

public class MapsTest {

    public static void main(String[] args) {

        Map<Integer, String> students = new HashMap<>();
        students.put(1, "Basia");
        students.put(2, "Tomek");
        students.put(3, "basia");


        System.out.println(students.get(1));

        Map<Integer, String > otherStudents =new HashMap<>();
        otherStudents.putAll(students);

        System.out.println(students.containsKey(1));
        System.out.println(students.containsValue("Pawel"));

        System.out.println(students.isEmpty());
        System.out.println(students.size());

        students.remove(1);
        System.out.println(students.size());

        for (Integer key : students.keySet()){
            System.out.println(key);
            System.out.println(students.get(key));
        }

        for (String student : students.values()) {
            System.out.println(student);
        }


    }
}
