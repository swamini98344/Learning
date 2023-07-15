package com.LearningFromJiju;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpenBrowser {
	
	
	@Test
	void testOpenBrowser() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		//a[text()='Sell']
		
		//a[text()='Sell']/following-sibling::a[text()='Amazon miniTV']
		
		//a[text()='Sell']/preceding-sibling::a[text()='Prime Day Deals']
		

		
		
	}

}
