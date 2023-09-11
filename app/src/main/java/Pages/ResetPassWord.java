package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ResetPassWord extends BasePage {

    By emailAddress = By.cssSelector("#email");
    By testPassWord = By.cssSelector("#pass");
    By submit = By.cssSelector("#send2");
    By changePassWord = By.cssSelector("#maincontent > div.columns > div.column.main > div.block.block-dashboard-info > div.block-content > div > div.box-actions > a.action.change-password");
    By currentPassWord =   By.cssSelector("#current-password");
    By updatedPassWord =   By.cssSelector("#password");
    By confirmPassWord =   By.cssSelector("#password-confirmation");
    By save = By.cssSelector("#form-validate > div > div.primary > button");
    By successMsg = By.xpath("/html/body/div[2]/main/div[2]/div[2]/div/div/div");


    public ResetPassWord(WebDriver webDriver) {
        super(webDriver);
    }

//
    public String resetPassWordDetailsOfUser(String emailAddress,String testPassWord, String currentPassWord,String updatedPassWord,String confirmPassWord) throws InterruptedException {

        pageActions.sendKeys(this.emailAddress ,emailAddress);
        pageActions.sendKeys(this.testPassWord ,testPassWord);
        pageActions.click(submit);
//
        pageActions.click(changePassWord);
        pageWaits.waitForElementToBePresent(this.currentPassWord);
        pageActions.sendKeys(this.currentPassWord,currentPassWord);
        pageActions.sendKeys(this.updatedPassWord,updatedPassWord);
        pageWaits.waitForElementToBePresent(this.confirmPassWord);
        pageActions.sendKeys(this.confirmPassWord,confirmPassWord);
        pageActions.click(save);
//        Thread.sleep(5000);
        pageWaits.waitForElementToBePresent(this.successMsg);
        //pageWaits.expilicitWaits(this.successMsg);
        WebElement  element = webDriver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div[2]/div/div/div"));
        String successMsgDisplay = element.getText();
        return successMsgDisplay;
    }
}
