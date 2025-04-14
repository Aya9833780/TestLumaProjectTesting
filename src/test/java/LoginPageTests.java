import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class LoginPageTests extends BaseTest {
    @Test
    public void testSuccessLogin(){
        //add user email
        loginPage.AddUserEmail("ayakhalil1688@gmail.com");
        //add password
        loginPage.addPassword("Ayakhalil168");
        //click login button
        loginPage.ClickLoginButton();
        assertEquals(driver.getCurrentUrl(), "https://magento.softwaretestingboard.com/customer/account/");

    }
    @Test
    //invalid email
    public void testInvalidUserEmailAndPassword(){
        loginPage.AddUserEmail("ayakhalil88@gmail.com");
        loginPage.addPassword("Ayakhalil8");
        loginPage.ClickLoginButton();
        assertTrue(loginPage.isInavalidErrorMessageVisible());
    }
    @Test
    //invalid password by xpath but different cuz wanna just word of invalid incriemnetal
    //by xpath
    public void testEmptyEmailAndPassword() {
        loginPage.AddUserEmail("");
        loginPage.addPassword("");
        loginPage.ClickLoginButton();
        assertTrue(loginPage.isDuplicatRequiredMessage());
    }
    @Test

    //empty password from required in password field in website warning message from span field in inspect
    // by css
    public void testEmptyEmail() {
        loginPage.AddUserEmail("");
        loginPage.addPassword("Ayakhalil168");
        loginPage.ClickLoginButton();
        assertTrue(loginPage.requiredErrormessage());
    }
    @Test
    //empty username by the same mthode and same required css
    public void testEmptyPassword() {
        loginPage.AddUserEmail("ayakhalil1688@gmail.com");
        loginPage.addPassword("");
        loginPage.ClickLoginButton();
        assertTrue(loginPage.requiredErrormessage());
    }
    @Test

    public void testIvalidPassword() {
        loginPage.AddUserEmail("ayakhalil1688@gmail.com");
        loginPage.addPassword("Ayak168");
        loginPage.ClickLoginButton();
        assertTrue(loginPage.isInavalidErrorMessageVisible());
    }
    @Test

    public void testIvalidEmail() {
        loginPage.AddUserEmail("ayakhalil8@gmail.com");
        loginPage.addPassword("Ayakhalil168");
        loginPage.ClickLoginButton();
        assertTrue(loginPage.isInavalidErrorMessageVisible());
    }
    @Test

    public void testWrongFormatEmail() {
        loginPage.AddUserEmail("ayakhalil8@com");
        loginPage.addPassword("Ayakhalil168");
        loginPage.ClickLoginButton();
        assertTrue(loginPage.requiredWrongFormatMessageError());
    }



    }


