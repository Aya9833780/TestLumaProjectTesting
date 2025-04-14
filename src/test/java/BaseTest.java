
import org.example.FindProduct;
import org.example.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    public WebDriver driver;
    protected LoginPage loginPage;
    protected FindProduct findproduct;
    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS8%2C/");
        driver.manage().window().maximize();
        loginPage = new LoginPage(driver);
        findproduct = new FindProduct(driver);
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
