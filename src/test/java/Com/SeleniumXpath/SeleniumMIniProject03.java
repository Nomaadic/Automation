package Com.SeleniumXpath;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumMIniProject03
{

        @Test
        @Description("Validation of login credentials and appointment page")
        @Owner("Manikanta Karamsetty")

    public void test_Katalon_Login() throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");

        WebElement appointment_btn = driver.findElement(By.xpath("//a[@id='btn-make-appointment']"));
        appointment_btn.click();

        WebElement username = driver.findElement(By.xpath("//input[@id='txt-username']"));
        username.sendKeys("John Doe");

        WebElement password = driver.findElement(By.xpath("//input[@id='txt-password']"));
        password.sendKeys("ThisIsNotAPassword");

        WebElement login_btn = driver.findElement(By.xpath("//button[@id='btn-login']"));
        login_btn.click();

        Thread.sleep(2000);

        System.out.println(driver.getCurrentUrl());

        driver.quit();

    }


}
