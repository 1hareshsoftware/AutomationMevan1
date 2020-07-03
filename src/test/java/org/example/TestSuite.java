package org.example;

import org.junit.Test;


public class TestSuite extends BrowserSetup
{
    Homepage homepage = new Homepage();
    Register registerPage = new Register();

    @Test
    public void openHomepage(){
        homepage.clickOnRegister();
        homepage.getTextofRegister();
        registerPage.Yourpersonaldetails();
        homepage.searchField();
        homepage.SelectEuroCurrency();
        homepage.giftcard();
        homepage.Computer();

    }


}
