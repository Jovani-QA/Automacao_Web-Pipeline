package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class config {

    public WebDriver WebDriver()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("http://169.62.128.221/Casting/CASTING_ADM_HOMO");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        return driver;
    }
}
