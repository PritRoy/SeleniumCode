package week3.day2;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class EditLead extends Annotation{

	@Test(dataProvider="editdata")

	public void EditLead() throws InterruptedException {
//		startApp("chrome", "http://leaftaps.com/opentaps/");
//		WebElement eleUserName = locateElement("id", "username");
//		type(eleUserName, "DemoSalesManager");
//		WebElement elePassword = locateElement("id","password");
//		type(elePassword, "crmsfa");
//		WebElement eleLogin = locateElement("class","decorativeSubmit");
//		click(eleLogin);
//		WebElement crsmfaLink = locateElement("linkText", "CRM/SFA");
//		click(crsmfaLink);
		WebElement createLink = locateElement("linkText", "Create Lead");
		click(createLink);
		//verifyTitle("");
		WebElement cmpny = locateElement("id", "createLeadForm_companyName");
		type(cmpny, "Infy");
		WebElement firstn = locateElement("id","createLeadForm_firstName");
		type(firstn,"Gayathri");
		WebElement lName = locateElement("id","createLeadForm_lastName");
		type(lName, "K");
		WebElement ddSource = locateElement("id","createLeadForm_dataSourceId");
		selectDropDownUsingIndex(ddSource, 5);
		WebElement createBtnClick = locateElement("class","smallSubmit");
		click(createBtnClick);
		WebElement editlink = locateElement("xpath", "//a[text()='Edit']");
		click(editlink);
		WebElement fnlocal = locateElement("id","updateLeadForm_firstNameLocal");
		type(fnlocal,"gayu");
		WebElement lnlocal = locateElement("id","updateLeadForm_lastNameLocal");
		type(lnlocal,"kris");
		WebElement btnupdate = locateElement("class","smallSubmit");
		click(btnupdate);

	}
	
	@DataProvider(name="editdata")

	public Object[][] inputdataforeditlead()
	{
	Object[][] data=new Object[2][3];
	data[0][1]="ValueGlobal1";
	data[0][2]="Gayathriedit";
	data[0][3]="Kedit";
	data[0][4]="firstnamelocal";
	data[0][5]="lastnamelocal";
	data[1][1]="TCS";
	data[2][2]="Sangeetha";
	data[3][3]="R";
	data[4][4]="firstnameSangeetha";
	data[5][5]="lastnameRaja";
	return data;
}
}