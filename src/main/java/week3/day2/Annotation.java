package week3.day2;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class Annotation extends SeMethods{
	//@Parameters({"url","username","password"})

 public String excelfilename,testname,testdesc,category,Author,Modulename;

	@BeforeSuite
	public void  startSuite() 
	{
		beginResult();
	}

	
	@BeforeClass
	public void startTest()
	{
		startTest(excelfilename,testname,testdesc,category,Author,Modulename) ;
	}

	
	
	@Parameters({"url","username","password"})
	@BeforeMethod

	public void login(String url,String username,String password)
	{
		startTestIteration(Author, category,Modulename);
		startApp("chrome", url);
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, username);
		WebElement elePassword = locateElement("id","password");
		type(elePassword, password);
		WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleLogin);
		//		WebElement crsmfaLink = locateElement("linkText", "CRM/SFA");
		//		click(crsmfaLink);
		WebElement crsmfaLink = locateElement("linkText", "CRM/SFA");
		click(crsmfaLink);
	}

	@AfterMethod
	public void close() 

	{
		closeBrowser();
	}

	@AfterSuite
	public void  stopsuite() 
	{
		endResult();
	}

	@DataProvider(name="fetchdata")
	public Object[][] input() throws IOException {
		ReadFromExcel excel = new ReadFromExcel();
		return excel.readExcel("CreateLead");
	}
}





