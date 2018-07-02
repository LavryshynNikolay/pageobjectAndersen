package comAndersen.setings;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;

public class FireFoxSetings {
    protected WebDriver driver;
    protected String useremail ="dk5h7@carbtc.net";
    protected  String username = "KolyaAvtotest";
    protected String usertext = "Avtotest=)";

    @BeforeMethod
    public  void setUp(){
        driver = new FirefoxDriver();
        driver.get("https://www.andersenlab.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @AfterMethod
    public void tearDown(){ driver.quit(); }

}
