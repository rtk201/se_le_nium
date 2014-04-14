package com.packt.webdriver.chapter1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class NavigateToUrl {
	public static void main(String[] args){
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		WebElement aboutLink = driver.findElement(By.linkText("About"));
		aboutLink.click();
		
	}

}