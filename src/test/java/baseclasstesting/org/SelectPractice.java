package baseclasstesting.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SelectPractice extends Baseclass {
	
	public static void main(String[] args) {
		launchBrowser();
		loadurl("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		maxWindow();
		WebElement choose = driver.findElement(By.id("select-demo"));
		
		
		clickButton(choose);
		byindex(2);
		
	}

}
