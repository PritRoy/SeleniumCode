package seleniumcode;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HWTestCaseSheet1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\TestLeaf\\Selenium\\Softwares-20180630T225014Z-001\\Softwares\\drivers\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElementById("username").sendKeys("demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_firstName").sendKeys("Gayathri");
		driver.findElementById("createLeadForm_lastName").sendKeys("Krishnan");
		driver.findElementById("createLeadForm_firstNameLocal").sendKeys("gayu");
		driver.findElementById("createLeadForm_lastNameLocal").sendKeys("krish");
		driver.findElementById("createLeadForm_personalTitle").sendKeys("Hi");
		WebElement Source = driver.findElementById("createLeadForm_dataSourceId");
		Select ddsource= new Select(Source);
		ddsource.selectByIndex(2);	
		driver.findElementById("createLeadForm_generalProfTitle").sendKeys("Hi Mr");
		driver.findElementById("createLeadForm_annualRevenue").sendKeys("500000", Keys.TAB);
		Thread.sleep(3000);
		WebElement industry = driver.findElementById("createLeadForm_dataSourceId");
		Select ddindustry= new Select(industry);
		ddindustry.selectByIndex(2);

		WebElement ownership = driver.findElementById("createLeadForm_ownershipEnumId"); 
		Select ddownership= new Select(ownership);
		ddownership.selectByIndex(2);
		driver.findElementById("createLeadForm_sicCode").sendKeys("123456");
		driver.findElementById("createLeadForm_description").sendKeys("test description..Hi Wow are you");
		driver.findElementById("createLeadForm_importantNote").sendKeys("Test important note");
		driver.findElementById("createLeadForm_primaryPhoneCountryCode").clear();
		driver.findElementById("createLeadForm_primaryPhoneCountryCode").sendKeys("773");
		driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("463");
		driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("7245");
		driver.findElementById("createLeadForm_departmentName").sendKeys("computer");
		WebElement preferrendcurrency = driver.findElementById("icreateLeadForm_currencyUomId");
		Select currency=new Select(preferrendcurrency);
		currency.selectByIndex(2);
		driver.findElementById("createLeadForm_numberEmployees").sendKeys("89");
		createLeadForm_tickerSymbol
		createLeadForm_primaryPhoneAskForName
		createLeadForm_primaryWebUrl
		createLeadForm_generalToName
		createLeadForm_generalAddress1
		createLeadForm_generalAddress2
		createLeadForm_generalCity
		createLeadForm_generalStateProvinceGeoId // state dd
		createLeadForm_generalCountryGeoId //dd
		createLeadForm_generalPostalCode
		createLeadForm_generalPostalCodeExt
		createLeadForm_marketingCampaignId
		createLeadForm_primaryPhoneNumber
		createLeadForm_primaryEmail
		submitButton //class name - create liad
		//input[@name="submitButton"] - xpath for createlead button
		

	}

}
