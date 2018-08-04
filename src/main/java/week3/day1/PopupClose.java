package week3.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupClose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\TestLeaf\\Selenium\\Softwares-20180630T225014Z-001\\Softwares\\drivers\\chromedriver.exe");


		
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://popuptest.com/");
		driver.manage().window().maximize();
		driver.findElementByXPath("//a[text()='Multi-PopUp Test #2']").click();
 



	}

}
