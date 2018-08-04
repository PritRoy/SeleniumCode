package seleniumcode;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumtables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\TestLeaf\\Selenium\\Softwares-20180630T225014Z-001\\Softwares\\drivers\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/table.html");
		int size = driver.findElementsByXPath("//table/tbody/tr").size();
		System.out.println(size);
		int size2 = driver.findElementsByXPath("(//table/tbody/tr)[2]/td").size();
		System.out.println(size2);
		 String value = driver.findElementByXPath("//table/tbody/tr[3]/td[1]/following-sibling::td[1]").getText();
		
		System.out.println("the progress value of Learn to interact with Elements" +value);
		//font[text()='20%']
		
		
		

	}

}
