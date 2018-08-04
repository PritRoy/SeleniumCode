package week3.day2;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
public class FindLeads extends SeMethods {
	@Test
	public void FindLeads() throws InterruptedException
	{
	
//		startApp("chrome", "http://leaftaps.com/opentaps/");
//		WebElement eleUserName = locateElement("id", "username");
//		type(eleUserName, "DemoSalesManager");
//		WebElement elePassword = locateElement("id","password");
//		type(elePassword, "crmsfa");
		WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleLogin);
		WebElement crsmfaLink = locateElement("linkText", "CRM/SFA");
		click(crsmfaLink);
		WebElement createLink = locateElement("linkText", "Create Lead");
		click(createLink);
		
		WebElement findleadlink = locateElement("xpath","//a[text()='Find Leads']");
		click(findleadlink);
		//WebElement leadid = locateElement("id", "ext-gen253"); 
		//type(leadid,"10040");
		WebElement findlead = locateElement("xpath","//button[text()='Find Leads']");
		click(findlead);
		
	}
	

}
