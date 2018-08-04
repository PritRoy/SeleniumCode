package week3.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\TestLeaf\\Selenium\\Softwares-20180630T225014Z-001\\Softwares\\drivers\\chromedriver.exe");



		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().window().maximize();

		WebElement frameobject = driver.findElementById("iframeResult");
		driver.switchTo().frame(frameobject);
		driver.findElementByXPath("//button[text()='Try it']").click();

		Alert alobj=driver.switchTo().alert();
		alobj.sendKeys("Sangeetha");
		System.out.println(alobj);
		alobj.accept();
		
		driver.switchTo().defaultContent();
		driver.findElementByXPath("//a[@id='tryhome']").click();
		
		driver.close();
		


	}

}
