package Com.AutomationTestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class SeleniumOptionClasses
{
    public static void main(String[] args) throws InterruptedException {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--incognito");
        edgeOptions.addArguments("--window-size=1280,720");
       String browsername =  edgeOptions.getBrowserName();

        WebDriver d1 = new EdgeDriver(edgeOptions);
        d1.get("https://katalon-demo-cura.herokuapp.com/");
        Thread.sleep(2000);
        System.out.println(browsername);
        d1.quit();


    }
}
