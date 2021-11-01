package org.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SampleClass  {
	public static void main(String[] args) {
		// Incognito mode
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\eclipse-workspace\\MyProject\\drivers\\chromedriver.exe");
		ChromeOptions c= new ChromeOptions();
		c.addArguments("--incognito");
		WebDriver driver= new ChromeDriver(c);
		driver.get("https://www.facebook.com/");
		
	}
	

}
