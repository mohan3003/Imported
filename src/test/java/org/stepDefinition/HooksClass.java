package org.stepDefinition;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import baseclasstesting.org.BaseClass1;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.*;

public class HooksClass extends BaseClass1{
	
	@Before(order=1)
	public void start() {
		System.out.println("Order 1 executed");

	}
	
	
	@Before(order=2)
	public void startTime() {
		System.out.println("Order 2 executed");
		printStartTime();
		System.out.println("done");
		
	}
	
	@Before(order=3)
	public void beforeScenario() {
	System.out.println("order 3 executed");
	launchBrowser();
	System.out.println("done");
	System.out.println("new code added");

	
	loadurl("http://www.lookagain.co.uk/");
	maxWindow();
	}
	
	
	@After(order=2)
	public void afterScenario(Scenario s) throws IOException {
//	String name = s.getName();
//	String fileName = name.replace(" ", "_");
//	screenshot(fileName);
		
		if (s.isFailed()) {
			TakesScreenshot tk= (TakesScreenshot)driver;
			byte[] screenshotAs= tk.getScreenshotAs(OutputType.BYTES);
			s.embed(screenshotAs, "image/png");
			
		}
	closeBrowser();
	System.out.println("Scenario Ends");
	
	
	}
	@After(order=1)
	public void endTime() {
		printEndTime();

	}
}
