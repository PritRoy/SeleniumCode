package week3.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class CreateContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtentHtmlReporter html= new ExtentHtmlReporter("./Report") ;
		html.setAppendExisting(false);
		ExtentReports extent= new ExtentReports();
		extent.attachReporter(html);
		ExtentTest SuiteTest=extent.createTest("TC001", "Create Lead");
		ExtentTest test=SuiteTest.createNode("Leads");
		
		
		System.setProperty("webdriver.chrome.driver","C:\\TestLeaf\\Selenium\\Softwares-20180630T225014Z-001\\Softwares\\drivers\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementById("username").sendKeys("demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByXPath("//a[text()='Create Contact']").click();
		driver.findElementById("firstNameField").sendKeys("Gayathri");
		
		driver.findElementById("lastNameField").sendKeys("Krishnan");
		driver.findElementById("createContactForm_firstNameLocal").sendKeys("Gayathritest");
		driver.findElementById("createContactForm_lastNameLocal").sendKeys("Krishnan test");
		driver.findElementById("createContactForm_personalTitle").sendKeys("hi");
		driver.findElementById("createContactForm_generalProfTitle").sendKeys("Hello Mrs");
		driver.findElementById("createContactForm_departmentName").sendKeys("Computer");
		WebElement ddcurrency = driver.findElementById("createContactForm_preferredCurrencyUomId");
		Select currency= new Select(ddcurrency);
		currency.selectByIndex(10);
		driver.findElementById("createContactForm_description").sendKeys("Test description");
		driver.findElementById("createContactForm_importantNote").sendKeys("Test Important notes");
		driver.findElementById("createContactForm_primaryPhoneAreaCode").sendKeys("600100");
		driver.findElementById("createContactForm_primaryPhoneExtension").sendKeys("1900");
		driver.findElementById("createContactForm_primaryEmail").sendKeys("gayathri@gmail.com");
		driver.findElementById("createContactForm_primaryPhoneNumber").sendKeys("9840360566");
		driver.findElementById("createContactForm_primaryPhoneAskForName").sendKeys("Sangeetha");
		String Toname = driver.findElementById("generalToNameField").getAttribute("value");     //.sendKeys("Gayathri")
		driver.findElementById("createContactForm_generalAddress1").sendKeys("10/257 vimala nagar 2nd street");
		driver.findElementById("createContactForm_generalAddress2").sendKeys("Near Nilgris");
		driver.findElementById("createContactForm_generalCity").sendKeys("Chennai");
		driver.findElementById("createContactForm_generalPostalCode").sendKeys("600100");
		driver.findElementById("createContactForm_generalPostalCodeExt").sendKeys("200");
		driver.findElementById("createContactForm_generalAttnName").sendKeys("AttentionName");
		driver.findElementById("createContactForm_generalAddress2").sendKeys("Tambaram");
		WebElement ddcountry = driver.findElementById("createContactForm_generalCountryGeoId");
		Select country= new Select(ddcountry);
		country.selectByVisibleText("India");
		WebElement ddstate = driver.findElementById("createContactForm_generalStateProvinceGeoId");
		Select state= new Select(ddstate);
		state.selectByVisibleText("Texas");
		driver.findElementByXPath("//input[@name='submitButton']").click();
		String Fname=driver.findElementById("viewContact_firstName_sp").getText(); 
		System.out.println("FirstName:" +Fname);
				if(Toname.contains(Fname))
		{
			System.out.println("Name is" +Fname.concat(Toname));
		}
		driver.findElementByLinkText("Edit").click();
		WebElement ddmarket = driver.findElementById("createContactForm_preferredCurrencyUomId");
		Select market= new Select(ddmarket);
		market.selectByIndex(2);
		driver.findElementByXPath("(//td//input[@name='submitButton'])[2]").click();
		driver.findElementByXPath("(//td//input[@name='submitButton'])[1]").click();
		
		
		
		
		
		
		
		
		
		
		

	}

}
