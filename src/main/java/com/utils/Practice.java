package com.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.pages.LoginPage;

public class Practice {

	WebDriver driver;
	String name = null;
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable- notification");
		
		driver = new ChromeDriver(option);
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void test02()throws Exception {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.id("signin-block")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("signInLink")).click();
		Thread.sleep(5000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='modalIframe']")));
		Thread.sleep(5000);
		driver.findElement(By.id("mobileNoInp")).sendKeys("596325852");
		Thread.sleep(5000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='reCAPTCHA']")));
		Thread.sleep(5000);
		driver.findElement(By.id("recaptcha-anchor")).click();
	}
}
