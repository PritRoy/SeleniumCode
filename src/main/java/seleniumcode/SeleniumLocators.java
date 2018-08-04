package seleniumcode;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	System.setProperty("webdriver.chrome.driver","C:\\TestLeaf\\Selenium\\Softwares-20180630T225014Z-001\\Softwares\\drivers.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementById("ext-gen587").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("Value Global IT solutions");
		driver.findElementById("createLeadForm_firstName").sendKeys("");
		driver.findElementById("createLeadForm_lastName").sendKeys("Sangeetha");
		driver.findElementById("ext-gen604").click();
		
	}

}
