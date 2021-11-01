package org.pojoclasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclasstesting.org.BaseClass1;

public class LoginPojo extends BaseClass1{
	
	public LoginPojo() {
		
		PageFactory.initElements(driver, this);
	}
	
@FindBy(xpath="//span[text()='My Account']")
private WebElement signIn;

@FindBy(xpath="(//input[@type='text'])[2]")
private WebElement email;

@FindBy(xpath="//input[@type='password']")
private WebElement password;

@FindBy(xpath="(//input[@type='text'])[3]")
private WebElement postalCode;

@FindBy(xpath="//span[text()='Accept Cookies']")
private WebElement cookies;

@FindBy(xpath="//button[text()='Sign In']")
private WebElement signInBtn;

@FindBy(xpath="//a[text()='Register it now']")
private WebElement register;

@FindBy(xpath="//input[@name='account_noPass']")
private WebElement AccNum;


@FindBy(xpath="//button[@class='primary']")
private WebElement continueBtn;

@FindBy(xpath="//a[@title='Womens']")
private WebElement womenCategory;

@FindBy(xpath="(//a[text()='Dresses'])[1]")
private WebElement dressCategory;



public WebElement getWomenCategory() {
	return womenCategory;
}


public void setWomenCategory(WebElement womenCategory) {
	this.womenCategory = womenCategory;
}


public WebElement getDressCategory() {
	return dressCategory;
}


public void setDressCategory(WebElement dressCategory) {
	this.dressCategory = dressCategory;
}


public WebElement getSignIn() {
	return signIn;
}


public void setSignIn(WebElement signIn) {
	this.signIn = signIn;
}


public WebElement getEmail() {
	return email;
}


public void setEmail(WebElement email) {
	this.email = email;
}


public WebElement getPassword() {
	return password;
}


public void setPassword(WebElement password) {
	this.password = password;
}


public WebElement getPostalCode() {
	return postalCode;
}


public void setPostalCode(WebElement postalCode) {
	this.postalCode = postalCode;
}


public WebElement getCookies() {
	return cookies;
}


public void setCookies(WebElement cookies) {
	this.cookies = cookies;
}


public WebElement getSignInBtn() {
	return signInBtn;
}


public void setSignInBtn(WebElement signInBtn) {
	this.signInBtn = signInBtn;
}


public WebElement getRegister() {
	return register;
}


public void setRegister(WebElement register) {
	this.register = register;
}


public WebElement getAccNum() {
	return AccNum;
}


public void setAccNum(WebElement accNum) {
	AccNum = accNum;
}


public WebElement getContinueBtn() {
	return continueBtn;
}


public void setContinueBtn(WebElement continueBtn) {
	this.continueBtn = continueBtn;
}








}
