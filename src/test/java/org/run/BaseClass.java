package org.run;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;

	public void browserLunch(String Url) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/BookHotel.php");

	}

	public void typeText(WebElement ele, String data) {
		ele.sendKeys(data);
	}

	public void clickButton(WebElement e) {
		e.click();
	}

	public String atrribute(WebElement k, String value) {
	
		return k.getAttribute(value);
	}
	public void acceptMthd() {
		Alert a = driver.switchTo().alert();
		a.accept();
	}
	}


