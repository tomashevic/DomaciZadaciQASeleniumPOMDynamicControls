package Base;

import Pages.DynamicControlsPage;
import Pages.HomepagePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BaseTest {

    public WebDriver driver;

    public HomepagePage homepagePage;

    public DynamicControlsPage dynamicControlsPage;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();

        homepagePage = new HomepagePage(driver);
        dynamicControlsPage = new DynamicControlsPage(driver);

    }

}
