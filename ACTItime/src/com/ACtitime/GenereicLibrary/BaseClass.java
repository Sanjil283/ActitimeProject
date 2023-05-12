package com.ACtitime.GenereicLibrary;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.ACtitime.objectRepository.Homepage;
import com.ACtitime.objectRepository.Login_Page;

public class BaseClass {
	WebDriver driver;
	FileLibrary f=new FileLibrary();
	
	
	@BeforeSuite
	public void DataBaseConnection()
	{
		Reporter.log("Database Connected",true);
	}
	
	
	@BeforeClass
	public void launchtheBrowser() throws IOException
	{
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	 String url=f.readFromPropertyFile("URL");
	
	
		driver.get(url);
		Reporter.log("Launch successfully",true);
		
	}
	
	@BeforeMethod
	public void loginTOActitime() throws IOException
	{
		Login_Page p=new Login_Page(driver);
		String untxf=f.readFromPropertyFile("UN");
		String pwtf= f.readFromPropertyFile("PWD");
		
		p.getUntbx().sendKeys(untxf);
		p.getPwtxb().sendKeys(pwtf);
		p.getLgbtn().click();
		Reporter.log("Login succesfully",true);
		
	}

	@AfterMethod
	public void LogoutfromBrowser()
	{
		Homepage p=new Homepage(driver);
		WebElement lgbtn=p.getLgbton();
		lgbtn.click();
		
		Reporter.log("logged out successfully",true);
		
		
	}
	@AfterSuite
	public void DatabaseDisocnnected()
	{
		Reporter.log("database Disocnnected",true);
	}
}
