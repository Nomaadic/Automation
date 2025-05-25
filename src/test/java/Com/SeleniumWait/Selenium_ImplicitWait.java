package Com.SeleniumWait;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Selenium_ImplicitWait
{
    @Test
    public void implicitWait() throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.navigate().to("https://www.youtube.com/watch?v=2NXBA6K975o");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.quit();
    }
}
