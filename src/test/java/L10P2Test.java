// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class L10P2Test {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;
    @Before
    public void setUp() {
       // System.setProperty("webdriver.gecko.driver", "C:/temp/geckodriver.exe");
        System.setProperty("webdriver.chrome.driver", "C:/temp/chromedriver.exe");
        //driver = new FirefoxDriver();
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }
    @After
    public void tearDown() {
        driver.quit();
    }
    @Test
    public void l10P2() throws InterruptedException {
        driver.get("https://docs.oracle.com/javase/9/docs/api/overview-summary.html");
        TimeUnit.SECONDS.sleep(5); // So I can close setting browser down
        driver.manage().window().setSize(new Dimension(680, 761));
        driver.findElement(By.id("search")).sendKeys("java.lang.string");
        TimeUnit.SECONDS.sleep(1);
        driver.findElement(By.id("search")).sendKeys(Keys.ENTER);
        TimeUnit.SECONDS.sleep(5);
        driver.findElement(By.cssSelector(".rowColor:nth-child(3) > .colConstructorName a")).click();
        TimeUnit.SECONDS.sleep(5);
        driver.findElement(By.id("search")).click();
        driver.findElement(By.id("search")).sendKeys("javax.swing.jframe");
        TimeUnit.SECONDS.sleep(1);
        driver.findElement(By.id("search")).sendKeys(Keys.DOWN);
        TimeUnit.SECONDS.sleep(1);
        driver.findElement(By.id("search")).sendKeys(Keys.ENTER);
        TimeUnit.SECONDS.sleep(5);
        driver.findElement(By.cssSelector(".altColor:nth-child(4) > .colConstructorName .memberNameLink > a")).click();
        TimeUnit.SECONDS.sleep(5);
    }
}
