package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShoppingCart extends BasePage{
    By item = By.cssSelector("#maincontent > div.columns > div.column.main > div.widget.block.block-static-block > div.block.widget.block-products-list.grid > div > div > ol > li:nth-child(3) > div > div > strong > a");
    By addToCart = By.cssSelector("#product-addtocart-button");
    By cartList = By.cssSelector("#maincontent > div.page.messages > div:nth-child(2) > div > div > div > a");
    By listitem =By.cssSelector("#shopping-cart-table > tbody > tr.item-info > td.col.item > div > strong");

    public ShoppingCart(WebDriver webDriver) {
        super(webDriver);
    }
    public String CartList(String item){
        ((JavascriptExecutor) webDriver).executeScript("window.scrollTo(0, document.body.scrollHeight);");
        ((JavascriptExecutor) webDriver).executeScript("window.scrollBy(200, 0);");

        pageActions.click(this.item);
        pageActions.click(this.addToCart);
        pageWaits.waitForElementToBePresent(this.cartList);
//        webDriver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        pageActions.click(this.cartList);
        WebElement element=  webDriver.findElement(By.cssSelector("#shopping-cart-table > tbody > tr.item-info > td.col.item > div > strong"));
        String s = element.getText();
        return s;
    }

    public void shoppingCartDetails(String item){
        WebElement element=  webDriver.findElement(By.cssSelector("#shopping-cart-table > tbody > tr.item-info > td.col.item > div > strong"));
        String s = element.getText();
    }
}
