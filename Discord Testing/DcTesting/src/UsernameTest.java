// Generated by Selenium IDE
//Serkan Koçoğlu 17070006004
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Keys;

    public class UsernameTest {
    public void username(WebDriver driver) {
        driver.get("https://discord.com/");
        driver.manage().window().setSize(new Dimension(1051, 806));
        driver.findElement(By.linkText("Giriş")).click();
        {
            WebElement element = driver.findElement(By.cssSelector(".smallRegisterLink-2LCrMe > .contents-18-Yxp"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).clickAndHold().perform();
        }
        {
            WebElement element = driver.findElement(By.cssSelector(".smallRegisterLink-2LCrMe > .contents-18-Yxp"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        driver.findElement(By.cssSelector(".smallRegisterLink-2LCrMe > .contents-18-Yxp")).click();
        driver.findElement(By.name("email")).sendKeys("nonexistentmail96@gmail.com");
        driver.findElement(By.name("password")).sendKeys("Serkan35");
        driver.findElement(By.name("password")).sendKeys(Keys.ENTER);


        driver.findElement(By.name("username")).sendKeys("a");
        driver.findElement(By.name("username")).sendKeys(Keys.ENTER);
        driver.findElement(By.name("username")).clear();

        driver.findElement(By.name("username")).sendKeys("length33length33length33length33l");
        driver.findElement(By.name("username")).sendKeys(Keys.ENTER);
        driver.findElement(By.name("username")).clear();

        driver.findElement(By.name("username")).sendKeys("123456");
        driver.findElement(By.name("username")).sendKeys(Keys.ENTER);
        driver.findElement(By.name("username")).clear();
        driver.findElement(By.name("username")).clear();
        driver.findElement(By.name("username")).clear();
        driver.findElement(By.name("username")).clear();

        driver.findElement(By.name("username")).sendKeys("1?/*-+!?");   // Enters to System By Fault !
        driver.findElement(By.name("username")).sendKeys(Keys.ENTER);

    }

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\serka\\Desktop\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--whitelisted-ips=''");
        WebDriver driver = new ChromeDriver(options);

        UsernameTest ut = new UsernameTest();
        ut.username(driver);
    }
}
