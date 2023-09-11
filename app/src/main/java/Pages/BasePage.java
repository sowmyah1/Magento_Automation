package Pages;

import org.openqa.selenium.WebDriver;

public abstract class BasePage {
     protected PageWaits pageWaits;
     protected WebDriver webDriver;
     PageActions pageActions;

     public BasePage(WebDriver webDriver){
         this.webDriver= webDriver;
         this.pageActions = new PageActions(webDriver);
         this.pageWaits = new PageWaits(webDriver);
     }

}
