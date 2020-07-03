package org.example;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserSetup extends BasePage  {

    @Before
    public void openBroswer()
    {
        System.setProperty("webdriver.chrome.driver","src\\Resources\\BrowserDriver\\chromedriver.exe");
        //finish code for driver maximize and implicite wait
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

    }

    @After
    public void closeBrowser()
    {
        //driver.close();
    }

}
