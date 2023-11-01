package drivers;

public class WebDriverTest {
    public static void main(String[] args) throws NoValidBrowserName {

        DriverType[]  driverTypes = DriverType.values();
        for (int i = 0; i<driverTypes.length; i++) {
            System.out.println(driverTypes[i].name);
            System.out.println(driverTypes[i].path);
        }


        WebDriver driver = getDriver(DriverType.CHROME);
        driver.get();
        driver.findElementBy();


        /*FirefoxDriver Firefox = new FirefoxDriver();
        Firefox.info();
        Firefox.get();
        Firefox.findElementBy();*/
    }

    private static WebDriver getDriver(DriverType type) {
        if (type.name.equals("chrome")) {
            System.out.println(type.path);
            return new ChromeDriver();
        }
        System.out.println(type.path);
            return new FirefoxDriver();
        }
    }
