package pages;

import com.base.OpenChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.OpenChromeDriver;

import static com.base.OpenChromeDriver.driver;

public class NavigationPage {

    public static void optionbrowser() {
        OpenChromeDriver.opendriver();
    }

    static WebElement search = driver.findElement(By.xpath("//*[@id=\"post-2715\"]/div[2]/div/div/div[2]/div[1]/ul/li[2]/a"));

    public static void clicktabstab() {
        search.click();
    }

}
