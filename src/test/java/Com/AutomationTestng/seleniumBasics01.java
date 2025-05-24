package Com.AutomationTestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class seleniumBasics01
{
//    @Test
//    public void openPage() throws InterruptedException
//    {
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://app.vwo.com");
//        driver.manage().window().maximize();
//        Thread.sleep(1000);
//        driver.close();
//    }

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.close();

    }

}
