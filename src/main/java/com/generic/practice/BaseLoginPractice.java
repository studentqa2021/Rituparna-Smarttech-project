package com.generic.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.util.BaseConfig;
import com.util.Highlight;


public class BaseLoginPractice {
 public void getLogin() throws Exception {
	 
	 System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.get(BaseConfig.getValue("URL"));
	 driver.manage().window().maximize();
	 MasterPageFactory mpf = new MasterPageFactory(driver);
	 Highlight.getColor( mpf.getEmail(), driver);
	 mpf.getEmail().sendKeys(BaseConfig.getValue("Email"));
	 Highlight.getColor(mpf.getPassword() , driver);
	 mpf.getPassword().sendKeys(BaseConfig.getValue("Password"));
	 mpf.getLogInButton().click();
	 driver.quit();
	 
	 

 }
}
