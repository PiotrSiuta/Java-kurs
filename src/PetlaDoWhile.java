public class PetlaDoWhile {

    public static void main(String[] args) {
        int number = 10;

        do {
            System.out.println("Moja wartośc to " + number + " i jest mniejsza od 30");
            number++;
            //pętla do while wykona sie przynajmniej raz (zawsze), bo najpierw jest wypełnienie warunków a nastepnie ich sprawdzenie czy się spełniaja
        }
        while ( number <30);
    }
}
