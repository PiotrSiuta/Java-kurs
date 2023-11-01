import drivers.ChromeDriver;
import drivers.FirefoxDriver;
import drivers.WebDriver;

public class ExceptionsExample {
    public static void main(String[] args) {
/*
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 3;
        numbers[2] = 5;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }*/
        WebDriver driver = getDriver("Firefox");
        driver.get();
        driver.findElementBy();
    }
    private static WebDriver getDriver(String name) {
        if (name.equals("Chrome")) {
            return new ChromeDriver();
        } else if (name.equals("Firefox")) {
            return new FirefoxDriver();
        }
        return null;
    }
}
