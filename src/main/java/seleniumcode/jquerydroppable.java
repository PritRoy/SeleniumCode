package seleniumcode;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class jquerydroppable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\TestLeaf\\Selenium\\Softwares-20180630T225014Z-001\\Softwares\\drivers\\chromedriver.exe");



		ChromeDriver driver= new ChromeDriver();
		driver.get("http://jqueryui.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByXPath("//a[text()='Droppable']").click();
		WebElement eleDrag = driver.findElementByClassName("demo-frame");
		driver.switchTo().frame(eleDrag);		
		WebElement eleDrag1 = driver.findElementById("draggable");		
		WebElement eleDrag2 = driver.findElementById("droppable");
		Actions builder = new Actions(driver);
		builder.dragAndDrop(eleDrag1, eleDrag2).perform();
		
	}
}