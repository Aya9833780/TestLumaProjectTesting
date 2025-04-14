package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class LoginPage{

    private WebDriver driver;
    private WebDriverWait wait;
    //webelements
    private By userEmailFilledy = By.cssSelector("#email");
    private By PasswordField = By.cssSelector("input[name='login[password]");
    private By LoginButton = By.cssSelector("#send2");
    private By InvalidError = By.xpath("//*[@id=\"maincontent\"]/div[2]/div[2]/div/div/div");
    private By emptyMessage = By.cssSelector("#pass-error");
   private By WrongFormatEmail = By.xpath("//*[@id=\"email-error\"]");

    public LoginPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }
    //webMethodes
    public void AddUserEmail(String Email){
        wait.until(ExpectedConditions.visibilityOfElementLocated(userEmailFilledy));
        driver.findElement(userEmailFilledy).sendKeys(Email);

    }
    public void addPassword(String password){
        driver.findElement(PasswordField).sendKeys(password);
    }
    public void ClickLoginButton(){
        driver.findElement(LoginButton).click();
    }
    public boolean isInavalidErrorMessageVisible(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(InvalidError));
        return driver.findElement(InvalidError).isDisplayed();
    }
    public boolean requiredErrormessage(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(emptyMessage));
        return driver.findElement(emptyMessage).isDisplayed();
    }
    public boolean requiredWrongFormatMessageError() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(WrongFormatEmail));
        return driver.findElement(WrongFormatEmail).isDisplayed();
    }
    //لو عايزة اعمل طريقة بقى ل اتنين two empty username and password field
    // special implement methode for bussinics domain
    //findelements acted as array list
    public boolean isDuplicatRequiredMessage(){
        List<WebElement> requiredErrorList = driver.findElements(emptyMessage);
        for(int i =0; i<requiredErrorList.size();i++){
            if(!requiredErrorList.get(i).isDisplayed()){
                return false;
            }
        }
        return true;
    }


}
