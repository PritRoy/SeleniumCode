package week3.day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\TestLeaf\\Selenium\\Softwares-20180630T225014Z-001\\Softwares\\drivers\\chromedriver.exe");



		ChromeDriver driver= new ChromeDriver();
		driver.get("http://layout.jquery-dev.com/demos/iframes_many.html");
		driver.manage().window().maximize();
		//to print the # of frames in this particular web page --determine the count by nimber od iframes in the DOM
		List<WebElement> iframes = driver.findElementsByXPath("//iframe");
		System.out.println("Total number of frames are :" +iframes.size());


		driver.close();


	}

}
