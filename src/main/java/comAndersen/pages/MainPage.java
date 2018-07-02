package comAndersen.pages;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import static comAndersen.locators.Locators.*;

public class MainPage {
    private WebDriver driver;
    public MainPage(WebDriver driver) { this.driver = driver;}
    public void clickButton(){ driver.findElement(clickButtonLocator).click(); }
    public void inputDate(String name){
        WebElement nameDate = driver.findElement(inputDateLocator);
        nameDate.click();
        nameDate.clear();//здесь ставлю очистку поля на тот случай вдруг там будут какието дание.но можно и без этого
        nameDate.sendKeys(Keys.chord(Keys.SHIFT,name));
    }
    public void inputDateMail(String email){
        WebElement emailDate = driver.findElement(inputDateMailLocator);
        String select = Keys.chord(Keys.COMMAND,"a");
        String cut = Keys.chord(Keys.COMMAND,"x");
        String paste = Keys.chord(Keys.COMMAND,"v");
        emailDate.click();
        emailDate.clear();
        emailDate.sendKeys(email);
        emailDate.sendKeys(select);
        emailDate.sendKeys(cut);
        emailDate.sendKeys(paste);
    }
    public void inputDateComments(String comments){
        WebElement commentsDate = driver.findElement(inputDateCommentsLocator);
        commentsDate.click();
        commentsDate.clear();
        commentsDate.sendKeys(comments);
    }
    public void clickButtonSend(){
        WebElement clickEsk = driver.findElement(clickButtonSendLocator);
        clickEsk.sendKeys(Keys.ESCAPE);
    }
    public void checkTitleTest() {
        Assert.assertEquals(driver.getTitle(), "Qualitative software development");
    }
    public void clickLink(){
        WebElement link = driver.findElement(clickLinkLocator);
        Actions actions = new Actions(driver);
        actions.moveToElement(link).build().perform();
    }
    public  void clickRunLink(){driver.findElement(clickRunLinkLocator).click();}
    public  String getHeadingTextMain() {
        return driver.findElement(headingMainLocator).getText();
    }
}
