package Com.SeleniumBasics;

import org.openqa.selenium.WebDriver;

public class CommonMethods
{
    public void openBrowser(WebDriver driver, String url)
    {

        driver.get(url);
    }

    public void closeBrowser(WebDriver driver)
    {
         driver.close();
    }

}
