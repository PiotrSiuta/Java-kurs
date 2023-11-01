package drivers;

public class WebDriverSecondTest {

    public static void main(String[] args) {
        WebDriver  chrome = new ChromeDriver();
        WebDriver secondChrome = new ChromeDriver();

        WebDriver firefox = new FirefoxDriver();
        WebDriver secondFirefox = new FirefoxDriver();
        WebDriver firefoxThird = new FirefoxDriver();


        WebDriver safari = new WebDriver() {
            @Override
            public void get() {
                System.out.println("Opening element with Safari");

            }

            @Override
            public void findElementBy() {
                System.out.println("Finding element with Safari");
            }

            @Override
            public String info() {
                return null;
            }
        };
        safari.get();
        safari.findElementBy();
    }
}
