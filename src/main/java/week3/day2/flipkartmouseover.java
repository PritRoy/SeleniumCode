package week3.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class flipkartmouseover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\TestLeaf\\Selenium\\Softwares-20180630T225014Z-001\\Softwares\\drivers\\chromedriver.exe");



		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByXPath("//button[text()='✕']").click();
		WebElement eleTV = driver.findElementByXPath("//span[text()='TVs & Appliances']");
		WebElement eleThomson = driver.findElementByXPath("//span[text()='Thomson']");
		Actions builder = new Actions(driver);
		builder.moveToElement(eleTV).pause(3000).click(eleThomson).perform();
		
		
		

	}

}
