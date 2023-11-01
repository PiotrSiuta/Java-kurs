package lists;

import java.util.ArrayList;
import java.util.List;

public class ListsTest {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Pawel");
        names.add("Kasia");
        names.add("Ola");

/*
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(23232);*/


        System.out.println(names.get(0));
        System.out.println(names.indexOf("Pawel"));
        System.out.println(names.size());

        System.out.println(names.size());


/*        System.out.println(numbers.isEmpty());*/


    }
}
