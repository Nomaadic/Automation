package Com.SeleniumActionsClass;

import Com.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class MoveToElement02 extends CommonMethods
{
    // Navigate to Make my trip and close
    @Test
    public void test_MakemyTrip()
    {
        driver.get("https://www.makemytrip.com/");


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(6));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@data-cy='closeModal']")));

        driver.findElement(By.xpath("//span[@data-cy='closeModal']")).click();

        WebElement frmCity = driver.findElement(By.xpath("//input[@data-cy=\"fromCity\"]"));
        frmCity.click();



//
//        WebElement Hyd = driver.findElement(By.xpath())

    }

}
