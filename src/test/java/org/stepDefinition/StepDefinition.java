package org.stepDefinition;

import baseclasstesting.org.BaseClass1;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.pojoclasses.LoginPojo;
public class StepDefinition extends BaseClass1 {
	
//	@Given("The user should be in the login page")
//	public void the_user_should_be_in_the_login_page() {
//		
//		launchBrowser();
//		loadurl("http://www.lookagain.co.uk/");
//		maxWindow();
//		currentUrl();
//	   
	//}
	
	@When("The user should enter user name{string}and password{string}")
	public void theUserShouldEnterUserNameAndPassword(String email, String password) throws InterruptedException {
		
		LoginPojo p= new LoginPojo();
		btnclick(p.getSignIn());
		btnclick(p.getCookies());
		Thread.sleep(3000);
		fill(p.getEmail(), email);
		fill(p.getPassword(), password);
		fill(p.getPostalCode(), "GU16 7HF");
		btnclick(p.getSignInBtn());
		
	    
	}



	//@When("The user should enter user name and password")
	//public void the_user_should_enter_user_name_and_password() throws IOException, InterruptedException {
		
		//LoginPojo p= new LoginPojo();
		//btnclick(p.getSignIn());
	//	btnclick(p.getCookies());
		//Thread.sleep(3000);
		//fill(p.getEmail(), "Damon@gmail.com");
		//fill(p.getPassword(), "Don@321");
		//fill(p.getPostalCode(), "GU16 7HF");
		//btnclick(p.getSignInBtn());
		
		
	   
	//}
	
	@When("The user should register to the account")
	public void the_user_should_register_to_the_account() {
		LoginPojo p= new LoginPojo();
		btnclick(p.getRegister());
		fill(p.getAccNum(), "5432561");
		btnclick(p.getContinueBtn());
		driver.quit();
	  
	}


	@Then("The user should be able to get into their account")
	public void the_user_should_be_able_to_get_into_their_account() {
		
	String currentUrl = driver.getCurrentUrl();
	Assert.assertTrue("ma_login.asp", currentUrl.contains("ma_login.asp"));
	}
	
//	@When("The user should enter user name and password.")
//	public void theUserShouldEnterUserNameAndPassword() throws InterruptedException {
//		LoginPojo p= new LoginPojo();
//		btnclick(p.getSignIn());
//		btnclick(p.getCookies());
//		Thread.sleep(3000);
//		fill(p.getEmail(), "jeremy@gmail.com");
//		fill(p.getPassword(), "mat@32");
//		fill(p.getPostalCode(), "GU16 7HF");
//		btnclick(p.getSignInBtn());
//	   
//	}
//	
	
	@When("The user should enter invalid user name and password")
	public void the_user_should_enter_invalid_user_name_and_password(io.cucumber.datatable.DataTable d) throws InterruptedException {
		List<Map<String, String>> mp = d.asMaps();
		LoginPojo p= new LoginPojo();
		btnclick(p.getSignIn());
		btnclick(p.getCookies());
		Thread.sleep(3000);
		fill(p.getEmail(), mp.get(1).get("UserName"));
		fill(p.getPassword(),mp.get(1).get("Password"));
		fill(p.getPostalCode(), mp.get(1).get("Postalcode"));
		btnclick(p.getSignInBtn());
	}







}
