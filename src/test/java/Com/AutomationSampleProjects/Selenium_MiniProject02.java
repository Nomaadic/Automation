package Com.AutomationSampleProjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.io.File;

public class Selenium_MiniProject02
{
    // We need to open youtube
    // Add an extension which blocks ads in youtue

    @Test
    public void extensionBlocker() throws InterruptedException {
        EdgeOptions ED1 = new EdgeOptions();
//        ED1.addArguments("--incognito");
        ED1.addArguments("--window-size=720,720");
        ED1.addExtensions(new File("src/test/java/Com/AutomationSampleProjects/AddBlock.crx"));
        WebDriver D2 = new EdgeDriver(ED1);
        D2.navigate().to("https://www.youtube.com/watch?v=NaPUdob0IWo");
        Thread.sleep(1000);

        D2.quit();
    }
}
