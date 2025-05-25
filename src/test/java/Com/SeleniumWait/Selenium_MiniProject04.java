package Com.SeleniumWait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Selenium_MiniProject04
{
    // Using EW, closes the popup once navigating to MakeMy Trip

    @Test

    public void popupClosure()
    {
        EdgeOptions Ed = new EdgeOptions();
        Ed.addArguments("--incognito");
        Ed.addArguments("--Start-maximized");

        WebDriver WB = new EdgeDriver(Ed);
        WB.get("https://www.makemytrip.com/");

        WebDriverWait wait = new WebDriverWait(WB, Duration.ofSeconds(6));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@data-cy='closeModal']")));

        WB.findElement(By.xpath("//span[@data-cy='closeModal']")).click();

        WB.quit();

    }

}
