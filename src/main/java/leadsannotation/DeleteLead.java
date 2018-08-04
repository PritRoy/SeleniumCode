package leadsannotation;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import week3.day2.SeMethods;

public class DeleteLead extends SeMethods{

	@Test

	public void DeleteLead() throws InterruptedException {
		startApp("chrome", "http://leaftaps.com/opentaps/");
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, "DemoSalesManager");
		WebElement elePassword = locateElement("id","password");
		type(elePassword, "crmsfa");
		WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleLogin);
		WebElement crsmfaLink = locateElement("linkText", "CRM/SFA");
		click(crsmfaLink);
		WebElement createLink = locateElement("linkText", "Create Lead");
		click(createLink);
		//verifyTitle("");
		WebElement cmpny = locateElement("id", "createLeadForm_companyName");
		type(cmpny, "Infy");
		WebElement firstn = locateElement("createLeadForm_firstName");
		type(firstn,"Gayathri");
		WebElement lName = locateElement("createLeadForm_lastName");
		type(lName, "K");
		WebElement ddSource = locateElement("createLeadForm_dataSourceId");
		selectDropDownUsingIndex(ddSource, 5);
		WebElement createBtnClick = locateElement("class","smallSubmit");
		click(createBtnClick);

		WebElement deletebtn = locateElement("xpath", "//a[text()='Delete']");
		click(deletebtn);
		WebElement view = locateElement("xpath", "//a[text()='10040']");
		click(view);
		
		
		
	}
}