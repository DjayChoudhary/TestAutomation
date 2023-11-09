/**
 * 
 */
package automation.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * 
 */
public class HomePage {

	private WebDriver driver;

	By createTaskBtn = By.xpath("//button[contains(text(),'Create Task')]");
	By header = By.className("hnname");
	By newsTitle = By.className("titleline");

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public NewTaskPage createTask() {
		driver.findElement(createTaskBtn).click();
		return new NewTaskPage(driver);

	}

	public boolean isHeaderPresent() {
		return driver.findElement(header).isDisplayed();

	}
	
	public void listNewsTitles() {
		List<WebElement> newsTitleElements = driver.findElements(newsTitle);
		
		for(WebElement newsTitle: newsTitleElements) {
			System.out.println("\n --> " + newsTitle.getText());
		}
	}

}
