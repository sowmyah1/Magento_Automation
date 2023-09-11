package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {

    By emailAddress = By.cssSelector("#email");
    By testPassWord = By.cssSelector("#pass");
    By submit = By.cssSelector("#send2");
    By changePassWord = By.cssSelector("#maincontent > div.columns > div.column.main > div.block.block-dashboard-info > div.block-content > div > div.box-actions > a.action.change-password");
    By currentPassWord =   By.cssSelector("#current-password");
    By updatedPassWord =   By.cssSelector("#password");
    By confirmPassWord =   By.cssSelector("#password");
    By save = By.cssSelector("#form-validate > div > div.primary > button");


    public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }

    public String loginDetailsOfUser(String emailAddress,String testPassWord){
        pageActions.sendKeys(this.emailAddress ,emailAddress);
        pageActions.sendKeys(this.testPassWord ,testPassWord);
        pageActions.click(submit);
        WebElement accountCreated = webDriver.findElement(By.cssSelector("body > div.page-wrapper > header > div.panel.wrapper > div > ul > li.greet.welcome > span"));
        String accountName = accountCreated.getText();
        return accountName;
    }

}
