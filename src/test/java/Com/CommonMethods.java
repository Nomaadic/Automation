package Com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class CommonMethods
{
    public WebDriver driver;

    public void openBrowser(WebDriver driver, String url)
    {
        driver.get(url);
    }

    public void closeBrowser(WebDriver driver)
    {
         driver.close();
    }

    @BeforeTest
    public void setup()
    {
        EdgeOptions ED1 = new EdgeOptions();
        ED1.addArguments("--incognito");
        driver = new EdgeDriver(ED1);
        driver.manage().window().maximize();
    }

   //@AfterTest
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
