package Com.SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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
