package org.example;

import org.openqa.selenium.By;

public class Register extends Utils {

    private By yourpersonaldetails = By.className("title");
    private By Gender = By.id("gender-male");
    private By FirstName = By.id("FirstName");
    private By LastName = By.id("LastName");
    private By dayDropList = By.xpath("//div[@class='date-picker-wrapper']/select[1]");
    private By monthDropList = By.xpath("//select[@name='DateOfBirthMonth']");
    private By yearDropList = By.xpath("//select[@name='DateOfBirthYear']");
    private By Email = By.id("Email");
    private By CompanyName=By.id("Company");
    private By Password=By.id("Password");
    private By ConfirmPassword=By.id("ConfirmPassword");




    public void Yourpersonaldetails(){

        System.out.println(getTextFromElement(yourpersonaldetails));
        try{
            Thread.sleep(4000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        ClickOnElement(Gender);
        enterText(FirstName,"haresh");
        enterText(LastName, "Ahir");
        SelectByVisibletext(dayDropList, "1" );
        SelectByVisibletext(monthDropList, "March");
        SelectByVisibletext(yearDropList, "1990");
        enterText(Email, "abc@haresh.com");
        enterText(CompanyName, "Atmiy");
        enterText(Password, "yds369");
        enterText(ConfirmPassword, "yds369");

        }
    }



