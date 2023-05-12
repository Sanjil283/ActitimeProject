package com.ACtitime.objectRepository;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page  {
	
	//declaration
 @FindBy (name="username")
 private WebElement untbx;
 
 @FindBy (name="pwd")
 private WebElement pwtxb;
 
 @FindBy(xpath="//div[.='Login ']")
 private WebElement lgbtn;
 
 //initialization
 public Login_Page(WebDriver driver) {
	 
	 PageFactory.initElements(driver,this);
	 
 }
 
 //utilization

public WebElement getUntbx() {
	return untbx;
}

public WebElement getPwtxb() {
	return pwtxb;
}

public WebElement getLgbtn() {
	return lgbtn;
}
	

 
	

	
	
}
