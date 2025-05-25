package Com.SeleniumTables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Selenium_Print_Table
{

    @Test

    public void Print()
    {
        WebDriver WB = new EdgeDriver();
        WB.get("https://awesomeqa.com/webtable.html");
        WB.manage().window().maximize();

        // Entire table got printed including Headers
//        WebElement table = WB.findElement(By.tagName("table"));
//        System.out.println(table.getText());
//        WB.quit();

        // To print only table contents exempting headers
        int rowCount = WB.findElements(By.tagName("tr")).size();
        for(int i = 2; i < rowCount; i++)
        {
            WebElement row = WB.findElement(By.xpath("//tr["+i+"]"));
            System.out.println(row.getText());
        }

        WB.quit();
    }

}
