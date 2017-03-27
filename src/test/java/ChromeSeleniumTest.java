import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by savenok_a on 20.03.2017.
 */
public class ChromeSeleniumTest {

    @Test
    public void openOnlinerTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\WebDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.onliner.by/");

        Thread.sleep(5000);

        driver.quit();
    }
}
