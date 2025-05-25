package Com.SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumHierarchy_02
{
//    SearchContext - Inteface
//    Webdriver - Interface
//    RemoteWebdriver - Class
//    ChromeDriver, EdgeDriver, Firefoxriver, Safari Driver

    public static void main(String[] args)
    {
        // If I want to change browsers
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com");

        // If I want to run on different machines
        RemoteWebDriver driver1 = new ChromeDriver();
        driver1.get("https://app.vwo.com");


    }
}
