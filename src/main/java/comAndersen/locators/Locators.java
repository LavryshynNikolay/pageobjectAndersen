package comAndersen.locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Locators {
    private WebDriver driver;
    public Locators(WebDriver driver) { this.driver = driver;}
    public static By clickButtonLocator = By.xpath("//div[@class='header__topline']//span[@class='nav__link']");
    public static By inputDateLocator = By.xpath("//div[@id='popup_feedback']/div//input[@class='control__field']");
    public static By inputDateMailLocator = By.xpath("//div[@id='popup_feedback']/div//input[@class='control__field js--required']");
    public static By inputDateCommentsLocator = By.xpath("//div[@id='popup_feedback']//textarea");
    public static By clickButtonSendLocator = By.xpath("//div[@id='popup_feedback']");
    public static By clickLinkLocator = By.xpath("//div[@id='extra-services-link']//a[text()='Extra Services']");
    public static By clickButtonAddLocator = By.xpath("//div[@class='managed-project__accordion managed-project__accordion_m0']");
    public static By downloadingFileLocator = By.xpath("//div[@class='control__dropfield dz-clickable']");
    public static By clickRunLinkLocator = By.xpath("//div[@class='header__botline-inside']//a[text()='Run Projects']");
    public static By headingMainLocator = By.xpath("//div[@class='intro intro_index-page box-md']/h1");
}
