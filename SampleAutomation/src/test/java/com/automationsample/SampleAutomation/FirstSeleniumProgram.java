package com.automationsample.SampleAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSeleniumProgram {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"//Drivers//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.gmail.com");
		System.out.println(driver.getTitle());
	

	}

}
