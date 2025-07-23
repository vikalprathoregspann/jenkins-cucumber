package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class DriverFactory {
 
    // ThreadLocal driver for parallel execution support
    private static ThreadLocal<WebDriver> driverTL = new ThreadLocal<>();
 
    // Get driver instance
    public static WebDriver getDriver() {
        if (driverTL.get() == null) {
            driverTL.set(new ChromeDriver());
        }
        return driverTL.get();
    }
 
    // Quit and clean up driver
    public static void quitDriver() {
        if (driverTL.get() != null) {
            driverTL.get().quit();
            driverTL.remove();
        }
    }
}
