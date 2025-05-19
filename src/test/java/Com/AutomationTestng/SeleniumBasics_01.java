package Com.AutomationTestng;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumBasics_01
{
    @Test
    public void openpage()
    {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com");
        System.out.println(driver.getTitle());
    }

}
