package drivers;

public class FirefoxDriver implements WebDriver {

    @Override
    public void get() {
        System.out.println("Otwieramy przegladarke FireFox");
    }

    @Override
    public void findElementBy() {
        System.out.println("Znajdujemy element za pomoca przeglądarki Firefox");
    }

    @Override
    public String info() {
        return "FireFox";
    }
}

