package Com.SeleniumDropDowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class StaticDropDown
{
    @Test

    public void Validate_staticDropDown()
    {
        WebDriver WB = new EdgeDriver();
        WB.get("https://practice.expandtesting.com/dropdown");
        WB.manage().window().maximize();

        WB.findElement(By.cssSelector("#dropdown")).click();
        Select dropdown = new Select(WB.findElement(By.cssSelector("#dropdown")));
        dropdown.selectByVisibleText("Option 2");

        WB.quit();


    }

}
