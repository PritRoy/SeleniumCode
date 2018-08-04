package seleniumcode;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IrctcCode {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\TestLeaf\\Selenium\\Softwares-20180630T225014Z-001\\Softwares\\drivers\\chromedriver.exe");


		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		driver.manage().window().maximize();
		driver.findElementById("userRegistrationForm:userName").sendKeys("gaythri123");
		driver.findElementById("userRegistrationForm:password").sendKeys("gaythri");
		driver.findElementById("userRegistrationForm:confpasword").sendKeys("gaythri");
		WebElement securityqn = driver.findElementById("userRegistrationForm:securityQ");
		Select dd1= new Select(securityqn);
		dd1.selectByIndex(3);
		driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("test");
		//WebElement preferredLanguage = driver.findElementById("userRegistrationForm:securityQ");
		//Select dd2= new Select(preferredLanguage);
		//dd2.selectByVisibleText("English");
		driver.findElementById("userRegistrationForm:firstName").sendKeys("Gayathri");
		driver.findElementById("userRegistrationForm:middleName").sendKeys("K");
		driver.findElementById("userRegistrationForm:lastName").sendKeys("Krishnan");

		WebElement gender= driver.findElementById("userRegistrationForm:gender:1");
		gender.click();
		driver.findElementById("userRegistrationForm:maritalStatus:0").click();
		//maritalstaus.click();
		WebElement date = driver.findElementById("userRegistrationForm:dobDay");
		Select dd2 = new Select(date);
		dd2.selectByVisibleText("07");
		WebElement month= driver.findElementById("userRegistrationForm:dobMonth"); 
		Select dd3=new Select(month);
		dd3.selectByVisibleText("DEC");
		WebElement year= driver.findElementById("userRegistrationForm:dateOfBirth");
		Select dd4=new Select(year);
		dd4.selectByVisibleText("2000");
		WebElement occupation = driver.findElementById("userRegistrationForm:occupation");
		Select dd5=new Select(occupation);
		dd5.selectByIndex(2);
		driver.findElementById("userRegistrationForm:uidno").sendKeys("908990811112");
		driver.findElementById("userRegistrationForm:idno").sendKeys("AWWER8978N");
		WebElement countries= driver.findElementById("userRegistrationForm:countries");
				Select dd6=new Select(countries);
		dd6.selectByVisibleText("India");	

		driver.findElementById("userRegistrationForm:email").sendKeys("gayathritest@gmail.com");
		driver.findElementById("userRegistrationForm:mobile").sendKeys("9840360566");
		WebElement nationality = driver.findElementById("userRegistrationForm:nationalityId");
		Select dd7= new Select(nationality);
		dd7.selectByIndex(0);
		


		driver.findElementById("userRegistrationForm:address").sendKeys("10/257");
		driver.findElementById("userRegistrationForm:street").sendKeys("near park");
		driver.findElementById("userRegistrationForm:area").sendKeys("Vimala Nagar");
		driver.findElementById("userRegistrationForm:pincode").sendKeys("600100",Keys.TAB);
		Thread.sleep(3000);
		
		
		WebElement city= driver.findElementById("userRegistrationForm:cityName");
		Select dd8 = new Select(city);
		dd8.selectByVisibleText("Kanchipuram");
		Thread.sleep(1000);


		//PO
		WebElement PO= driver.findElementById("userRegistrationForm:postofficeName");
		Select dd9 = new Select(PO);
		dd9.selectByVisibleText("Medavakkam  S.O");
		
		driver.findElementById("userRegistrationForm:landline").sendKeys("0448878989890");
		//radio
		
		driver.findElementById("userRegistrationForm:resAndOff").click();
		



	}


}
