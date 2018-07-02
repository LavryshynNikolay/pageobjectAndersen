import comAndersen.pages.FindPage;
import comAndersen.pages.MainPage;
import comAndersen.setings.FireFoxSetings;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class MainClassTest extends FireFoxSetings {
    @Test
    public void contactUs() throws InterruptedException{
        MainPage mainPage = new MainPage(driver);
        mainPage.clickButton();
        mainPage.inputDate(username);
        mainPage.inputDateMail(useremail);
        mainPage.inputDateComments(usertext);
        mainPage.clickButtonSend();
    }
    @Test
    public void tittle() throws InterruptedException{
        MainPage mainPage = new MainPage(driver);
        mainPage.checkTitleTest();
    }
    @Test
    public void ContactUs() throws InterruptedException{
        MainPage mainPage = new MainPage(driver);
        mainPage.clickLink();
    }
    @Test
    public void checkTitleTest() {
        JavascriptExecutor jse =(JavascriptExecutor)driver;
        jse.executeScript("confirm('Ти бот?');");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        driver.switchTo().alert().dismiss();
    }
    @Test
    public void scrolTest() {
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,2000)","");
        jse.executeScript("window.scrollBy(0,-2000)","");
        //нужно розобратся, не сохраняет на жостком диске
        Date dateNow = new Date();
        SimpleDateFormat format = new SimpleDateFormat("hh_mm_ss");
        String fileName = format.format(dateNow) + ".png";

        File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenshot,new File("/Yuotub"+fileName));
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    @Test
    public void sigInTest() throws InterruptedException {
        MainPage mainPage = new MainPage(driver);
        String heading = mainPage.getHeadingTextMain();
        Assert.assertEquals("Andersen, software for business", heading);
    }
    @Test
    public void clickRunKLink() throws InterruptedException{
        MainPage mainPage = new MainPage(driver);
        mainPage.clickRunLink();
        //здесь элемент не инпут типа файл а див и у меня тест проходит но не загружает.
        // Пробовал на сайте гугла все работает ок
        FindPage findPage = new FindPage(driver);
        findPage.clickButtonAdd();
        findPage.downloadingFile();
    }
}
