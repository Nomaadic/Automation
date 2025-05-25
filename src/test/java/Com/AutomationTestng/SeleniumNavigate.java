package Com.AutomationTestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumNavigate
{
    public static void main(String[] args)
    {
        // Navigate and get both are same, whereas navigate has move,back, refersh optin

        WebDriver driver = new EdgeDriver();
        driver.navigate().to("https://www.youtube.com/watch?v=2NXBA6K975o");
        driver.navigate().refresh();
        driver.navigate().back();
        driver.quit();



    }
}
