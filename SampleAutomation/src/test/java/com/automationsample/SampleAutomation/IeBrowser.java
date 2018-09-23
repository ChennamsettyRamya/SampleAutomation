package com.automationsample.SampleAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IeBrowser {
	public static void main(String[] args) {
		//System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+"//Drivers//IEDriverServer.exe");
		System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+"//Drivers//IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.get("https://www.gmail.com");
		System.out.println(driver.getTitle());
	}

}
