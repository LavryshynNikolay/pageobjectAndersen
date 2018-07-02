package comAndersen.pages;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import static comAndersen.locators.Locators.*;
import org.openqa.selenium.WebDriver;

public class FindPage {
    private WebDriver driver;
    public FindPage (WebDriver driver) { this.driver = driver;}
    public void clickButtonAdd(){driver.findElement(clickButtonAddLocator).click();}
    public void downloadingFile(){driver.findElement(downloadingFileLocator).sendKeys("/Summary.docx");}
}
