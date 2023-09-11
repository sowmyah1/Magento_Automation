package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class ProductList extends BasePage{
    By addToCart = By.cssSelector("#product-addtocart-button");
    By cartList = By.cssSelector("#maincontent > div.page.messages > div:nth-child(2) > div > div > div > a");
    By listitem =By.cssSelector("#shopping-cart-table > tbody > tr.item-info > td.col.item > div > strong");
    By proccedToCheckOut = By.cssSelector("#maincontent > div.columns > div > div.cart-container > div.cart-summary > ul > li:nth-child(1) > button");
    By itemCount = By.cssSelector("#opc-sidebar > div.opc-block-summary > div > div.title > strong > span:nth-child(1)");

    public ProductList(WebDriver webDriver) {
        super(webDriver);
    }
    public int setCartList(String item,By item1){
        ((JavascriptExecutor) webDriver).executeScript("window.scrollTo(0, document.body.scrollHeight);");
        ((JavascriptExecutor) webDriver).executeScript("window.scrollBy(200, 0);");

        pageActions.click(item1);
        pageActions.click(this.addToCart);
        pageWaits.waitForElementToBePresent(this.cartList);
        pageActions.click(this.cartList);
        pageWaits.waitForElementToBePresent(this.proccedToCheckOut).click();
        pageWaits.waitForElementToBePresent(this.itemCount).click();
        WebElement element = webDriver.findElement(By.cssSelector("#opc-sidebar > div.opc-block-summary > div > div.title > strong > span:nth-child(1)"));
        String a = element.getText();
        return Integer.parseInt(a);
    }
//
}
