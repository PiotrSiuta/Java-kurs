package drivers;

import drivers.WebDriver;

public class ChromeDriver implements WebDriver {
    @Override
    public void get() {
        System.out.println("Otwieramy przegladarke Google Chrome");
    }

    @Override
    public void findElementBy() {
        System.out.println("Znajdujemy element za pomoca przeglądarki Chrome");
    }

    @Override
    public String info() {
        return "Chrome";
    }
}
