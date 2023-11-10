package automation;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import automation.pages.HomePage;
import automation.pages.NewTaskPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HackerNewsTest {

	private WebDriver driver;
	private HomePage homePage;
	private NewTaskPage newTaskPage;

	@BeforeTest
	public void launchTest() {
		System.out.println("Hello World!!");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://news.ycombinator.com/");

	}

	@Test(groups = { "sanity" })
	public void createTaskTest() {
		homePage = new HomePage(driver);
		Assert.assertTrue(homePage.isHeaderPresent(), "Header not present");

		homePage.listNewsTitles();

	}

}
