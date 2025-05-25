package Com.SeleniumWait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class SeleniumExplicitWait
{
    @Test
    public void explicitWait()
    {
        EdgeOptions Ed = new EdgeOptions();
        Ed.addArguments("--Start-maximized");

        WebDriver WB = new EdgeDriver(Ed);
        WB.get("https://app.vwo.com/");

        WebElement login = WB.findElement(By.id("login-username"));
        login.sendKeys("abu@gmail.com");

        WebElement password = WB.findElement(By.id("login-password"));
        password.sendKeys("hahaha");

        WebElement signIn = WB.findElement(By.id("js-login-btn"));
        signIn.click();

        WebDriverWait wait = new WebDriverWait(WB, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("notification-box-description")));

        WebElement errormsg = WB.findElement(By.className("notification-box-description"));
        String ErrorTxt = errormsg.getText();
        System.out.println(ErrorTxt);
        Assert.assertEquals(ErrorTxt,"Your email, password, IP address or location did not match");

        WB.quit();
    }

}
