package Com.AutomationSampleProjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Selenium_MiniProject01 extends CommonMethods
{
    @Test
    public void textValidation()
    {
        WebDriver driver = new ChromeDriver();
        openBrowser(driver, "https://katalon-demo-cura.herokuapp.com/");

        if(driver.getPageSource().contains("CURA Healthcare Service"))
        {
            System.out.println("Test Passed");
        }
        else
        {
            System.out.println("Failed");
        }

        closeBrowser(driver);
    }

}
