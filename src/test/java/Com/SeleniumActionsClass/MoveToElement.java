package Com.SeleniumActionsClass;

import Com.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MoveToElement extends CommonMethods
{
    @Test
    public void test_MoveToElement ()
    {
        driver.get("https://www.spicejet.com/");
        WebElement from =driver.findElement(By.xpath("//div[@data-testid=\"to-testID-origin\"]/div/div/input"));

        Actions AC = new Actions(driver);
        AC.moveToElement(from).click().sendKeys("HYD").build().perform();

    }
}
