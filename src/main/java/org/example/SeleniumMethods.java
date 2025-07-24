package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SeleniumMethods {
    //    static WebDriver driver = new ChromeDriver();
//    static WebDriver driver;
//    static EdgeOptions options = new EdgeOptions();
//    static WebDriver driver = new EdgeDriver(options);
//    EdgeOptions options = new EdgeOptions();
//    driver = new EdgeDriver(options);k
    //test commit
    static WebDriver driver;
    static EdgeOptions options = new EdgeOptions();

    String chromeDriverPath = System.getProperty("user.dir") + "/BrowsersDriver/chromedriver.exe";
    String edgeDriverPath = System.getProperty("user.dir") + "/BrowsersDriver/msedgedriver.exe";

    public void startEdgeDriver(String url) throws InterruptedException {
        System.setProperty("webdriver.edge.driver", edgeDriverPath);

        options.addArguments("--start-maximized");
        driver = new EdgeDriver(options);

        driver.get(url);
        driver.manage().window().fullscreen();

    }

    public void startChromeDriver(String url) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);

        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().fullscreen();
    }

    public void quitBrowser() {
        driver.quit();
    }

    public void waitfor(long time) {
        try {
            Thread.sleep(time);
        } catch (Exception e) {

        }
    }

    public void textBox(String id, String text) {
        driver.findElement(By.id(id)).clear();
        driver.findElement(By.id(id)).sendKeys(text);
    }

    public void textBoxwithxpath(String xpath, String text) {
        driver.findElement(By.xpath(xpath)).clear();
        driver.findElement(By.xpath(xpath)).sendKeys(text);
    }

    public void click(String xpath) {
        driver.findElement(By.xpath(xpath)).click();
    }

    public void waitForElementToLoad(String xpath) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
    }

    public void hoverElement(String xpath) {
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(By.xpath(xpath));
        action.moveToElement(we).build().perform();
    }

    public void hoverElementAndClick(String hoverxpath, String clickxpath) {
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(By.xpath(hoverxpath));
        action.moveToElement(we).moveToElement(driver.findElement(By.xpath(clickxpath))).click().build().perform();
    }

    public void selectDropdown(String dropdownXpath, String text) {
        Select select = new Select(driver.findElement(By.xpath(dropdownXpath)));
        select.selectByVisibleText(text);
    }

}
