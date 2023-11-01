public class Truck implements Vehicle{

    @Override
    public void jazda(int speed) {
        System.out.println("Jade cieżarówka z predkościa " + speed);
    }

    @Override
    public void stop() {
        System.out.println("hamuję cieżarówka");
    }

    @Override
    public String info() {
        return "ciężarówka";
    }
    public void zatankuj(){
        System.out.println("nalej paliwa do ciężarówki");
    }
}
