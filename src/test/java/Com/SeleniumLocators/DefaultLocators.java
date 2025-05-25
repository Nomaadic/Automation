package Com.SeleniumLocators;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DefaultLocators
{
    //id, name, classname, TagName
    @Test
    @Description("Validating InValidaError Message  ")
    @Owner("Manikanta Karamsetty")
    public void test_VWO_InValidLogin_errorValidation() throws InterruptedException {
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

        Thread.sleep(4000);

        WebElement errormsg = WB.findElement(By.className("notification-box-description"));
        String ErrorTxt = errormsg.getText();
        System.out.println(ErrorTxt);
        Assert.assertEquals(ErrorTxt,"Your email, password, IP address or location did not match");

        WB.quit();
    }


}
