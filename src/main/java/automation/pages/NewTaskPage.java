
package automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewTaskPage {
	By taskTitleInput = By.name("title");
	By taskDescriptionInput = By.name("description");
	By submitBtn = By.xpath("//button[@type='submit']");

	private WebDriver driver;
	public NewTaskPage(WebDriver driver) {
		this.driver = driver;
	}

	public void createNewTask() {
		driver.findElement(taskTitleInput).sendKeys("New Task Title ");
		
		driver.findElement(taskDescriptionInput).click();
		driver.findElement(taskDescriptionInput).sendKeys("New Task Description ");
		driver.findElement(submitBtn).click();
		
		
	}
}
