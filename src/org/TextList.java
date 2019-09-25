package org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextList {
public static void main(String[] args) {
	System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Ramasamy\\Desktop\\Chithu\\Selenium\\src\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.snapdeal.com/");
 
}
}
