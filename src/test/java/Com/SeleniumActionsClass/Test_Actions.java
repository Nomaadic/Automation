package Com.SeleniumActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test_Actions
{
    private static final Logger log = LoggerFactory.getLogger(Test_Actions.class);

    // Enter text in textbox using Actions Class
    public static void main(String[] args)
    {
        WebDriver WB = new EdgeDriver();
        WB.get("https://awesomeqa.com/practice.html");
        WB.manage().window().maximize();

        WB.findElement(By.name("lastname")).click();

        Actions AC = new Actions(WB);
        AC.keyDown(Keys.SHIFT);
        AC.sendKeys("Raja");
        AC.keyDown(Keys.SHIFT).build().perform();

        WB.quit();



    }

}
