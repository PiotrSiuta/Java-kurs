public class Bike implements Vehicle {
    @Override
    public void jazda(int speed) {
        System.out.println("Jadę rowerem z predkościa " + speed);

    }

    @Override
    public void stop() {
        System.out.println("Hamuje rowerem! Naciskam mocno na pedały");
    }

    @Override
    public String info() {
        return "rower";
    }
    public void napompuj (){
        System.out.println("napompuj kola roweru");
    }
}
