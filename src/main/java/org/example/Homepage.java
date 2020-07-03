package org.example;

import org.openqa.selenium.By;
import sun.security.mscapi.CPublicKey;


public class Homepage extends Utils  {
    private By search = By.id("small-searchterms");
    private By SearchButton=By.xpath("//input[@class='button-1 search-box-button']");
    public void searchField(){
        enterText(search,"Electronics");
        ClickOnElement(SearchButton);
    }
    private By register = By.className("ico-register");
    public void clickOnRegister(){
        ClickOnElement(register);
    }
    public void getTextofRegister(){
        System.out.println(getTextFromElement(register));
    }

    private By clickCurrency=By.id("customerCurrency");
    private By SelectEuroCurrency=By.xpath("//div[@class='currency-selector']//option[2]");
    private By giftcard = By.xpath("//ul[@class='top-menu notmobile']/li[7]");
    private By Computer = By.xpath("//ul[@class='top-menu notmobile']/li[1]");
    private By Desktop = By.cssSelector("h2 [title=\"Show products in category Desktops\"]");

    public void SelectEuroCurrency(){
        ClickOnElement(clickCurrency);
        ClickOnElement(SelectEuroCurrency);}
        public void giftcard(){
            ClickOnElement(giftcard);}
        public void Computer(){
            ClickOnElement(Computer);
            ClickOnElement(Desktop);
            }



    }


