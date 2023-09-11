//import Driver.DriverCreator;
//import Pages.*;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//import java.time.Duration;
//import java.util.List;
//
//
//
//public class test2 {
//    @Test
//    public void shouldTestSomething() throws InterruptedException {
//        //Arrange
//        ChromeDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
//        //Act
//        driver.get("https://testvagrant.myshopify.com");
////        totals__subtotal-value
//
//        driver.findElement(By.linkText("Activity Auto")).click();
//        WebElement quantityInput = driver.findElement(By.className("quantity__input"));
//        quantityInput.clear();
//        quantityInput.sendKeys("4");
//        WebElement addProducts = driver.findElement(By.name("add"));
//        addProducts.click();
//        WebDriverWait waitTillDisplayButton= new WebDriverWait(driver,Duration.ofMillis(2000));
//        WebElement addToCart = driver.findElement(By.id("cart-notification-button"));
//        waitTillDisplayButton.until(ExpectedConditions.visibilityOfElementLocated(By.id("cart-notification-button")));
////        WebElement addToCart = driver.findElement(By.partialLinkText("View my cart"));
//        addToCart.click();
//        WebElement Price = driver.findElement(By.className("totals__subtotal-value"));
//        String price=Price.getText();
//        System.out.println(price+"the price");
////        driver.findElement(By.id("checkout")).click();
////        String tax=driver.findElement(By.cssSelector("#app > div > div > div > div > div > aside > div.RTcqB > div > div > div > section > div.nfgb6p0 > div:nth-child(3) > div._1qy6ue67 > div > div > span")).getText();
////        driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
////        driver.findElement(By.cssSelector("label[for='marketing_opt_in']")).click();
////        driver.findElement(By.name("firstName")).sendKeys("Hemanth");
////        driver.findElement(By.name("lastName")).sendKeys("N B");
////        driver.findElement(By.name("address1")).sendKeys("HAl,Indiranagar,Bengaluru");
////
////        List<WebElement> suggestions = driver.findElements(By.className("OXBZC"));
////        suggestions.get(0).click();
//////        driver.findElement(By.name("address2")).sendKeys("Indiranagar HAL 2 stage");
//////        driver.findElement(By.name("city")).sendKeys("Bengaluru");
////
////
////
////        WebElement zone = driver.findElement(By.name("zone"));
////        Select select=new Select(zone);
////        select.selectByVisibleText("Karnataka");
////
////        //        System.out.println("Tax = "+tax);
////
//////        #disclosure_content > div > div > div > div > section > div.nfgb6p0 > div:nth-child(3) > div._1qy6ue67
////        //Assert
////        Assert.assertEquals(price,"59.96","Price doesn't match");
////        Assert.assertEquals(tax.substring(1),"5.40","Taxes doesn't match");
////        driver.quit();
//
//
//
//
//        import Driver.DriverCreator;
//import Pages.*;
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//import java.time.Duration;
//import java.util.concurrent.TimeUnit;
//
//        public class test {
//            WebDriver driver = new ChromeDriver();
//            String emailaddress = "qwerty1q2qqwert3@gmail.com";
//            String testpassword = "12345Qwerty";
//            String updatedPassword = "12345Qwerty";
//            //    @Test
////    void register() {
////
////        driver.get("https://magento.softwaretestingboard.com/");
////
////        //Arrange
////        WebElement createAccount = driver.findElement(By.cssSelector("body > div.page-wrapper > header > div.panel.wrapper > div > ul > li:nth-child(3) > a"));
////
//////Action
////        createAccount.click();
////
////
////    }
//            @Test
//            void registerdetails()  {
//                String firstName ="alpha";
//                String lastName ="h";
//                String browserName ="Chrome";
//                String expected ="Welcome, alpha h!";
//
//                WebDriver webDriver = new DriverCreator().create(browserName);
//
//                PageActions pageActions = new PageActions(webDriver);
//                pageActions.navigateTo("https://magento.softwaretestingboard.com/customer/account/create/",webDriver);
//
//                RegisterPage registerPage = new RegisterPage(webDriver);
//
//                String name = registerPage.registerDetailsOfUser(firstName,lastName,emailaddress,testpassword,updatedPassword);
//
//                Assert.assertEquals(name,name,"Account not created");
////        System.out.println(output);
//
////        Assert.assertEquals(output,"Welcome, alpha h!","register unsuccessful");
//
//            }
//            //    @Test
////    void loginNavigation(){
////        driver.get("https://magento.softwaretestingboard.com/");
////
////        driver.findElement(By.cssSelector("body > div.page-wrapper > header > div.panel.wrapper > div > ul > li.authorization-link > a")).click();
////
////    }
//            @Test
//            void loginDetails() throws InterruptedException {
//                String browser = "Chrome";
//                String expected ="Welcome, alpha h!";
//
//                WebDriver webDriver = new DriverCreator().create(browser);
//
//                PageActions pageActions = new PageActions(webDriver);
//                pageActions.navigateTo("https://magento.softwaretestingboard.com/customer/account/",webDriver);
//
//                LoginPage loginPage = new LoginPage(webDriver);
//                String login = loginPage.loginDetailsOfUser(emailaddress,testpassword);
//
//                Assert.assertEquals(login,expected,"Login unsuccessful");
//
////        loginPage.resetPassWordDetailsOfUser(testpassword,updatedPassword,updatedPassword);
////        PageWaits pageWaits = new PageWaits(webDriver);
////        pageWaits.wait(5);
////
////        driver.get("https://magento.softwaretestingboard.com/customer/account/");
////
////        driver.findElement(By.cssSelector("#email")).sendKeys(emailaddress);
////        driver.findElement(By.cssSelector("#pass")).sendKeys(testpassword);
////        driver.findElement(By.cssSelector("#send2")).click();
//            }
//            @Test
//            void resetPassword() throws InterruptedException {
////      loginDetails();
////
////
//                String browser = "Chrome";
//                String expected ="You saved the account information.";
//                WebDriver webDriver = new DriverCreator().create(browser);
////
//                PageActions pageActions = new PageActions(webDriver);
//                pageActions.navigateTo("https://magento.softwaretestingboard.com/customer/account/",webDriver);
//
//                ResetPassWord resetPassWord = new ResetPassWord(webDriver);
//                String value = resetPassWord.resetPassWordDetailsOfUser(emailaddress,testpassword,testpassword,updatedPassword,updatedPassword);
//                System.out.println(value);
//                Assert.assertEquals(value,"You saved the account information","Password is not reset");
//
////
////        ResetPassWord resetPassWord  = new ResetPassWord(webDriver);
////        resetPassWord.resetPassWordDetailsOfUser(testpassword,updatedPassword,updatedPassword);
//
//            }
//            @Test
//            void productList(){
//                String item = "Affirm Water Bottle";
//                String browser ="Chrome";
//                WebDriver webDriver = new DriverCreator().create(browser);
//
//                PageActions pageActions = new PageActions(webDriver);
//                pageActions.navigateTo("https://magento.softwaretestingboard.com/gear.html",webDriver);
//
//                ProductList productList= new ProductList(webDriver);
//                String count = productList.setCartList(item);
//
//                Assert.assertEquals(count,"1","number of items not in match");
//
//
////
////        driver.get("https://magento.softwaretestingboard.com/gear.html");
////        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
////
////        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");
////        ((JavascriptExecutor) driver).executeScript("window.scrollBy(200, 0);");
////
////        driver.findElement(By.cssSelector("#maincontent > div.columns > div.column.main > div.widget.block.block-static-block > div.block.widget.block-products-list.grid > div > div > ol > li:nth-child(3) > div > div > strong > a")).click();
////        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
////        driver.findElement(By.cssSelector("#product-addtocart-button")).click();
////        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
////        driver.findElement(By.cssSelector("#maincontent > div.page.messages > div:nth-child(2) > div > div > div > a")).click();
////        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
////        driver.findElement(By.cssSelector("#maincontent > div.columns > div > div.cart-container > div.cart-summary > ul > li:nth-child(1) > button")).click();
////        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
////        WebElement element = driver.findElement(By.cssSelector("#opc-sidebar > div.opc-block-summary > div > div.title > strong > span:nth-child(1)"));
////        String a = element.getText();
////        System.out.println(a);
//
////        WebDriverWait waitForElementEnabled = new WebDriverWait(driver, Duration.ofSeconds(5));
////        WebElement enableButton = driver.findElement(By.cssSelector("body > div.page-wrapper > header > div.header.content > div.minicart-wrapper > a"));
////
////        enableButton.click();
////        waitForElementEnabled.until(ExpectedConditions.elementToBeClickable(By.cssSelector("body > div.page-wrapper > header > div.header.content > div.minicart-wrapper > a")));
////        System.out.println(enableButton.isEnabled());
//
////        driver.findElement(By.partialLinkText("https://magento.softwaretestingboard.com/checkout/cart/")).click();
////        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
////
////        driver.findElement(By.cssSelector("#minicart-content-wrapper > div.block-content > div:nth-child(7) > div > a > span")).click();
////        String count = driver.findElement(By.cssSelector("#cart-332096-qty")).getText();
////
////
////        System.out.println(count);
//
//            }
//
//            @Test
//            void shoppingCart(){
//                String item = "Affirm Water Bottle";
//                String browser ="Chrome";
//                WebDriver webDriver = new DriverCreator().create(browser);
//
//                PageActions pageActions = new PageActions(webDriver);
//                pageActions.navigateTo("https://magento.softwaretestingboard.com/gear.html",webDriver);
//
//                ShoppingCart shoppingCart = new ShoppingCart(webDriver);
//                String s = shoppingCart.CartList(item);
//
//                Assert.assertEquals(s,"Affirm Water Bottle","item not found");
//
////        driver.get("https://magento.softwaretestingboard.com/gear.html");
////        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
////
////        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");
////        ((JavascriptExecutor) driver).executeScript("window.scrollBy(200, 0);");
////
////        driver.findElement(By.cssSelector("#maincontent > div.columns > div.column.main > div.widget.block.block-static-block > div.block.widget.block-products-list.grid > div > div > ol > li:nth-child(3) > div > div > strong > a")).click();
////        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
////        driver.findElement(By.cssSelector("#product-addtocart-button")).click();
////        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
////        driver.findElement(By.cssSelector("#maincontent > div.page.messages > div:nth-child(2) > div > div > div > a")).click();
//
////        WebElement element=  driver.findElement(By.cssSelector("#shopping-cart-table > tbody > tr.item-info > td.col.item > div > strong"));
////        String s = element.getText();
////        System.out.println(s);
//
//            }
//        }
//
//    }
//
//}
//
