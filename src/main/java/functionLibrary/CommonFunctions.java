package functionLibrary;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.http.UrlPath;

public class CommonFunctions {
    public static WebDriver driver;

    public void openBrowser() {
        WebDriverManager.chromedriver().setup();;
        driver = new ChromeDriver();
        driver.get(driver.getCurrentUrl());
    }

    public void closeBrowser() {
        driver.quit();
    }
}
