package Com.SeleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Linktext_PartialText
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver WB = new EdgeDriver();
        WB.get("https://app.vwo.com/");
        WB.manage().window().maximize();

        WebElement freetrail = WB.findElement(By.linkText("Start a free trial"));
        freetrail.click();

//        WebElement freetrail1 = WB.findElement(By.partialLinkText("Start "));
//        freetrail1.click();

        Thread.sleep(2000);

        WB.quit();
    }
}
