package Com.AutomationTestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium_Assertations
{
    @Test
    public void testAssertations()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com");
        driver.getTitle();
        driver.close();
        Assert.assertEquals(driver.getTitle(), "Login - VWO");
    }
}


//AsssertJ can also be used if it requies other than asserations in TestNJ