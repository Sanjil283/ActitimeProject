package com.ACtitime.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

	//declaration
	@FindBy(xpath="//div[.='Tasks']")
    private WebElement tskmajortab;
	
	
	@FindBy(xpath="//div[.='Reports']")
	private WebElement rpmajortab;
	
	
	@FindBy(xpath="//div[.='Users']")
	private WebElement usmjrtab;
	
	@FindBy(xpath="//a[.='Logout']")
	private WebElement lgbton;
	
	//initialization
	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	
	//utlization
	public WebElement getTskmajortab() {
		return tskmajortab;
	}

	public WebElement getRpmajortab() {
		return rpmajortab;
	}

	public WebElement getUsmjrtab() {
		return usmjrtab;
	}

	public WebElement getLgbton() {
		return lgbton;
	}
	

	
}
