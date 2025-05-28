package Com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class DharaniTask
{
    @Test
    public void navigation()
    {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://katalon-demo-cura.herokuapp.com/");

        driver.findElement(By.xpath("//a[@id=\"btn-make-appointment\"]")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // Login
        driver.findElement(By.xpath("//input[@id=\"txt-username\"]")).sendKeys("John Doe");
        driver.findElement(By.xpath("//input[@id=\"txt-password\"]")).sendKeys("ThisIsNotAPassword");

        driver.findElement(By.xpath("//button[@id=\"btn-login\"]")).click();

        driver.quit();

    }
}
