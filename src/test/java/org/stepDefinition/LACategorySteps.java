package org.stepDefinition;

import java.util.concurrent.TimeUnit;

import org.pojoclasses.LoginPojo;
import org.testng.Assert;

import baseclasstesting.org.BaseClass1;
import io.cucumber.java.en.*;

public class LACategorySteps extends BaseClass1{
@Given("The user should be in the home page")
	public void the_user_should_be_in_the_home_page() throws InterruptedException {
		launchBrowser();
		maxWindow();
		loadurl("https://www.lookagain.co.uk/");
		LoginPojo p= new LoginPojo();
		btnclick(p.getCookies());
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	}
@When("The user should click the women category")
	public void the_user_should_click_the_women_category() {
		LoginPojo p= new LoginPojo();
		toMove(p.getWomenCategory());
	}

@When("the user should choose any one product")
	public void the_user_should_choose_any_one_product() {
		
		LoginPojo p= new LoginPojo();
		toMove(p.getDressCategory());
		btnclick(p.getDressCategory());
	}

@Then("The user should view the correct product")
	public void the_user_should_view_the_correct_product() {
		String url = driver.getCurrentUrl();
		Assert.assertTrue(url.contains("topnav"), "Verifythepage");
		System.out.println("Feature file is successful");
	}


}
