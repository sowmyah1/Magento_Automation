package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageActions {
    private WebDriver webDriver ;

    public PageActions(WebDriver webDriver){
        this.webDriver=webDriver;
    }

    void click(By by){
        webDriver.findElement(by).click();
    }

    void sendKeys(By by,String key){
        webDriver.findElement(by).sendKeys(key);
    }
    public void navigateTo(String Url,WebDriver webDriver){
        this.webDriver.get(Url);
    }
}
