public class ReadOnly {

    //get -> getter metoda zwracajaca nam wartosc pola name prywatnego

    private String nameGet = "Bartek";

    public String getNameGet() {
        return nameGet;
    }


    // set -> getSet metoda pozwalajaca ustawic wartosc pola ktore jest prywatne
    private String nameSet = "Piotrek";
    public void setNameSet(String name) {
        this.nameSet = name;

    }
}
