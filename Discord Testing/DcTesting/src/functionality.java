import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Keys;

public class functionality {
    public void functionality(WebDriver driver) {

        driver.get("https://discord.com/");
        driver.manage().window().setSize(new Dimension(1000, 800));

// Discord Main Page
        driver.findElement(By.linkText("Giriş")).click();

        WebDriverWait waitRegister = new WebDriverWait(driver, 15); //To Go Registration Page With a Sublink !
        waitRegister.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/form/div/div/div[1]/div[3]/div[3]/button"))).click();

// Registration Part
        WebDriverWait waitMail = new WebDriverWait(driver, 15);
        waitMail.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div[2]/div/div[2]/div/form/div/div[2]/div[1]/div/input")))
                .sendKeys("!non---existentmail!@gmail.com");

        driver.findElement(By.name("username")).click();
        driver.findElement(By.name("username")).sendKeys("LifeGuard");
        driver.findElement(By.name("password")).click();
        driver.findElement(By.name("password")).sendKeys("Serkan35");


        WebDriverWait waitEntry = new WebDriverWait(driver, 30);
        waitEntry.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".button-3k0cO7"))).click();


        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#app-mount > div:nth-child(6) > div.modal-3c3bKg > div > div > " +
                "div > div > div > div > div > div:nth-child(2) > div > div > div > div:nth-child(1)"))).click(); // Create My Server Button

        WebDriverWait waitForButton = new WebDriverWait(driver, 20);
        waitForButton.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div[4]/div[2]/div/div/div/div/div/div/div/div[2]/" +
                "div/div[2]/button[1]"))).click(); // Create Button

        WebDriverWait waitForClose = new WebDriverWait(driver, 20);
        waitForClose.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div[4]/div[2]/div/div/div/div/div/div/div/div/div[1]/button"))).click();//Close

// Create Text Channels Test

        WebDriverWait wait4Add = new WebDriverWait(driver, 5);
        wait4Add.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#channels-0 > div > button"))).click();  // upper + sign (create channel)

        driver.findElement(By.cssSelector(".inputDefault-_djjkz")).sendKeys("genel");
        driver.findElement(By.xpath("/html/body/div/div[4]/div[2]/div/form/div[3]/button[1]")).click();   // Verify Creating
        driver.findElement(By.cssSelector(".inputDefault-_djjkz")).clear();  //Clear Text Field


// Create Sound Channels
        driver.findElement(By.cssSelector("#app-mount > div:nth-child(6) > div.modal-3c3bKg > div > form > div.flex-1xMQg5.flex-1O1GKY.horizontalReverse-2eTKWD.horizontalReverse-3tRjY7.flex-1O1GKY.directionRowReverse-m8IjIq.justifyStart-" +
                "2NDFzi.alignStretch-DpGPf3.noWrap-3jynv6.footer-3rDWdC > button.button-38aScr.lookFilled-1Gx00P.colorBrand-3pXr91.sizeMedium-1AC_Sl.grow-q77ONN")).click();
        driver.findElement(By.xpath("/html/body/div/div[4]/div[2]/div/form/div[2]/div/div[1]/div/div[2]/label/input")).click();// Sound Channel Checkbox
        driver.findElement(By.cssSelector("#app-mount > div:nth-child(6) > div.modal-3c3bKg > div > form > div.scrollerWrap-2lJEkd.content-1EtbQh.scrollerThemed-2oenus" +
                ".themeGhostHairline-DBD-2d > div > div.name-3ChUIO.marginBottom20-32qID7 > div > input")).sendKeys("Genel");
        driver.findElement(By.xpath("/html/body/div/div[4]/div[2]/div/form/div[3]/button[1]")).click();  // Verify Creating


// Channel Chat Test
        driver.findElement(By.className("emojiButtonNormal-TdumYh")).click();// Choose Emoji Button
        driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[2]/div/main/form/div/div/section/div/div[2]/div/div[1]/div[2]/div/div/div/div/div[1]/div[2]/ul[1]/li[1]")).click();

        driver.findElement(By.cssSelector(".slateTextArea-1Mkdgw")).sendKeys("Lorem Ipsum Dolor Sit Amet");
        driver.findElement(By.cssSelector(".slateTextArea-1Mkdgw")).sendKeys(Keys.ENTER);  //Sent to Channel Chat

        driver.findElement(By.cssSelector(".slateTextArea-1Mkdgw")).sendKeys("Test Done !");
        driver.findElement(By.cssSelector(".slateTextArea-1Mkdgw")).sendKeys(Keys.ENTER); //Sent to Channel Chat


// Add a Friend Test
        driver.findElement(By.cssSelector(".homeIcon-tEMBK1 > path")).click();
        driver.findElement(By.cssSelector(".addFriendInput-4bcerK")).sendKeys("LifeGuard#7129");
        driver.findElement(By.cssSelector(".lookFilled-1Gx00P")).click();

// Settings
        driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[1]/section/div/div[3]/button[3]")).click();// Settings Button
        driver.findElement(By.cssSelector(".lookInverted-2D7oAl")).click();
    }

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\serka\\Desktop\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--whitelisted-ips=''");
        WebDriver driver = new ChromeDriver(options);

        functionality f = new functionality();
        f.functionality(driver);
    }
}
