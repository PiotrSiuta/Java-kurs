public class MetodyTest {
/*    public static void main(String[] args) {   //ta metoda nic nie zwraca
        Metody rezultat = new Metody();
        rezultat.nazwaMetodyPoliczWynik();;
        int result = rezultat.metodaPobierzWynik();
        int result2 = result*2;
        System.out.println("rezultat dwa to: " + result2);
    }*/

    public static void main(String[] args) {
        Metody metody = new Metody();
/*      metody.nazwaMetodyPoliczWynikParam(2);
        metody.nazwaMetodyPoliczWynikParam(100);
        metody.nazwaMetodyPoliczWynikParam(23);*/

        int result = metody.add(2,3,"Hello");
        System.out.println(metody.add(5,7, "hey"));
        System.out.println(result);

    }
}
