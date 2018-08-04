package week3.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class HWweek3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\TestLeaf\\Selenium\\Softwares-20180630T225014Z-001\\Softwares\\drivers\\chromedriver.exe");


		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		driver.manage().window().maximize();
		driver.findElementByXPath("//a[text()='Contact Us']").click();
		Set<String> windowHandles = driver.getWindowHandles();
//		driver.switchTo().window(windowHandles.get(1));
		List<String> allWindowHandle=new ArrayList<String>();
		allWindowHandle.addAll(windowHandles);
		driver.switchTo().window(allWindowHandle.get(1));
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.switchTo().window(allWindowHandle.get(0));
		driver.findElementByXPath("//a[text()='Compatible Browser']");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//driver.findElementByXPath("//a[text()='Compatible Browser']").click();
	/*	List<WebElement> allElements = driver.findElementsByXPath("/html/body/div[4]/div/div/div[2]/a");
		int count=allElements.size();
		for(int i=1;i<=count;i++){
		    allElements = driver.findElementsByXPath("/html/body/div[4]/div/div/div[2]/a");
		    System.out.println(allElements);}*/
		

		driver.close();
		driver.quit();
	}
	}


