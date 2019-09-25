package org.infor.sample2;


	import java.io.File;
	import java.io.IOException;
	import java.util.Set;

	import org.apache.commons.io.FileUtils;
	import org.openqa.selenium.By;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	public class SnapDeal1 {
		public static void main(String[] args) throws IOException { 
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramasamy\\Desktop\\Chithu\\Selenium\\src\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.snapdeal.com/");
	driver.manage().window().maximize();
	WebElement searchItem = driver.findElement(By.id("inputValEnter"));
	searchItem.sendKeys("iphone x");
	TakesScreenshot src=(TakesScreenshot)driver;
	File f= src.getScreenshotAs(OutputType.FILE);
	System.out.println(f); 
	File des=new File("C:\\Users\\Ramasamy\\Desktop\\Chithu\\Selenium\\Screenshot2\\snapdeal.png");
	FileUtils.copyFile(f, des);
	WebElement searchBtn = driver.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']"));
	searchBtn.click();
	TakesScreenshot src1=(TakesScreenshot)driver;
	File f1= src1.getScreenshotAs(OutputType.FILE);
	System.out.println(f1);
	File des1=new File("C:\\Users\\Ramasamy\\Desktop\\Chithu\\Selenium\\Screenshot2\\snapdeal1.png");
	FileUtils.copyFile(f1, des1);
	WebElement clickPhn = driver.findElement(By.xpath("//p[@title='iPhone X iPhone X ( 4GB , 4 GB ) Silver']"));
	clickPhn.click();
	String s=driver.getWindowHandle();
	Set<String>  x= driver.getWindowHandles();
	for(String y:x){
		if(!s.equals(y))
		{
			driver.switchTo().window(y);
		}
	}
	TakesScreenshot src2=(TakesScreenshot)driver;
	File f2= src2.getScreenshotAs(OutputType.FILE);
	System.out.println(f2);
	File des2=new File("C:\\Users\\Ramasamy\\Desktop\\Chithu\\Selenium\\Screenshot2\\snapdeal2.png");
	FileUtils.copyFile(f2, des2);
	WebElement buyBtn = driver.findElement(By.xpath("//div[@class='col-xs-6 btn btn-xl rippleWhite buyLink buyNow marR15  ']"));
	buyBtn.click();
	TakesScreenshot src3=(TakesScreenshot)driver;
	File f3= src3.getScreenshotAs(OutputType.FILE);
	System.out.println(f3);
	File des3=new File("C:\\Users\\Ramasamy\\Desktop\\Chithu\\Selenium\\Screenshot2\\snapdeal3.png");
	FileUtils.copyFile(f3, des3);
		}

	}

