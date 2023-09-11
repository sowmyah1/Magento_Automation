package magento_first5;

import Driver.DriverCreator;
import Pages.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MagentoTest {
    WebDriver driver = new ChromeDriver();
    String emailaddress = "qwerty1q2qqwert3@gmail.com";
    String testpassword = "12345Qwerty";
    String updatedPassword = "12345Qwerty";


    @Test(groups = "sanity")
    void registerdetails() {
        String firstName = "alpha";
        String lastName = "h";
        String browserName = "Chrome";
        String expected = "Welcome, alpha h!";

        WebDriver webDriver = new DriverCreator().create(browserName);

        PageActions pageActions = new PageActions(webDriver);
        pageActions.navigateTo("https://magento.softwaretestingboard.com/customer/account/create/", webDriver);

        RegisterPage registerPage = new RegisterPage(webDriver);

        String name = registerPage.registerDetailsOfUser(firstName, lastName, emailaddress, testpassword, updatedPassword);

        Assert.assertEquals(name, name, "Account not created");
    }
//
    @Test(groups = "sanity")
    void loginDetails() throws InterruptedException {
        String browser = "Chrome";
        String expected ="Welcome, alpha h!";

        WebDriver webDriver = new DriverCreator().create(browser);

        PageActions pageActions = new PageActions(webDriver);
        pageActions.navigateTo("https://magento.softwaretestingboard.com/customer/account/",webDriver);

        LoginPage loginPage = new LoginPage(webDriver);
        String login = loginPage.loginDetailsOfUser(emailaddress,testpassword);

        Assert.assertEquals(login,expected,"Login unsuccessful");

    }
    @Test
    void resetPassword() throws InterruptedException {
        String browser = "Chrome";
        String expected ="You saved the account information.";
        WebDriver webDriver = new DriverCreator().create(browser);
//
        PageActions pageActions = new PageActions(webDriver);
        pageActions.navigateTo("https://magento.softwaretestingboard.com/customer/account/",webDriver);

        ResetPassWord resetPassWord = new ResetPassWord(webDriver);
        String value = resetPassWord.resetPassWordDetailsOfUser(emailaddress,testpassword,testpassword,updatedPassword,updatedPassword);
        System.out.println(value);
        Assert.assertEquals(value,"You saved the account information.","Password is not reset");


    }
    @Test
    void productList(){
        By item1 = By.cssSelector("#maincontent > div.columns > div.column.main > div.widget.block.block-static-block > div.block.widget.block-products-list.grid > div > div > ol > li:nth-child(3) > div > div > strong > a");
        By item2 = By.cssSelector("#maincontent > div.columns > div.column.main > div.widget.block.block-static-block > div.block.widget.block-products-list.grid > div > div > ol > li:nth-child(2) > div > div > strong > a");
        String item = "Affirm Water Bottle";
        String browser ="Chrome";
        WebDriver webDriver = new DriverCreator().create(browser);

        PageActions pageActions = new PageActions(webDriver);
        pageActions.navigateTo("https://magento.softwaretestingboard.com/gear.html",webDriver);

        ProductList productList= new ProductList(webDriver);
        int count1 = productList.setCartList(item,item1);

        Assert.assertEquals(count1,1,"number of items not in match");
        pageActions.navigateTo("https://magento.softwaretestingboard.com/gear.html",webDriver);

        int count2 = productList.setCartList(item,item2);
        Assert.assertEquals(count2,2,"number of items not in match");

    }

    @Test
    void shoppingCart(){
        String item = "Affirm Water Bottle";
        String browser ="Chrome";
        WebDriver webDriver = new DriverCreator().create(browser);

        PageActions pageActions = new PageActions(webDriver);
        pageActions.navigateTo("https://magento.softwaretestingboard.com/gear.html",webDriver);

        ShoppingCart shoppingCart = new ShoppingCart(webDriver);
         String s = shoppingCart.CartList(item);

        Assert.assertEquals(s,"Affirm Water Bottle","item not found");


    }
}
