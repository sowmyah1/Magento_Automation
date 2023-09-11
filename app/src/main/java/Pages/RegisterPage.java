package Pages;

//import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RegisterPage extends BasePage{

    By firstName  = By.cssSelector("#firstname");
    By lastName = By.cssSelector("#lastname");
    By email = By.cssSelector("#email_address");
    By passWord = By.cssSelector("#password");
    By confirmPasWord = By.cssSelector("#password-confirmation");
    By submit = By.cssSelector("#form-validate > div > div.primary > button");
    By accname = By.cssSelector("accountCreated");
//    WebElement accountCreated = webDriver.findElement(By.cssSelector("accountCreated"));
    //WebElement accountCreated = webDriver.findElement(By.cssSelector("body > div.page-wrapper > header > div.panel.wrapper > div > ul > li.greet.welcome > span"));

    public RegisterPage(WebDriver webDriver) {
        super(webDriver);
    }
    public String registerDetailsOfUser(String firstName,String lastName,String email,String passWord,String confirmPassWord)  {
        pageActions.sendKeys(this.firstName,firstName);
        pageActions.sendKeys(this.lastName,lastName);
        pageActions.sendKeys(this.email,email);
        pageActions.sendKeys(this.passWord,passWord);
        pageActions.sendKeys(this.confirmPasWord,confirmPassWord);
        pageActions.click(submit);
        WebElement accountCreated = webDriver.findElement(By.cssSelector("body > div.page-wrapper > header > div.panel.wrapper > div > ul > li.greet.welcome > span"));
        String accountName = accountCreated.getText();
        return accountName;

//
    }


}
