package leadsannotation;



import org.openqa.selenium.WebElement;

import week3.day2.Annotation;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends Annotation{

	@Test(dataProvider= "fetchdata")
	public void createLead() throws InterruptedException {
		//		startApp("chrome", "http://leaftaps.com/opentaps");
		//		WebElement eleUserName = locateElement("id", "username");
		//		type(eleUserName, "DemoSalesManager");
		//		WebElement elePassword = locateElement("id","password");
		//		type(elePassword, "crmsfa");
		WebElement createLink = locateElement("linkText", "Create Lead");
		click(createLink);

		WebElement cmpny = locateElement("id", "createLeadForm_companyName");
		type(cmpny, "Infosys");
		WebElement firstn = locateElement("id","createLeadForm_firstName");
		type(firstn,"Gayathri");
		WebElement lName = locateElement("id","createLeadForm_lastName");
		type(lName, "K");
		WebElement ddSource = locateElement("id","createLeadForm_dataSourceId");
		selectDropDownUsingIndex(ddSource, 5);
		WebElement createBtnClick = locateElement("class","smallSubmit");
		click(createBtnClick);
		WebElement editlink = locateElement("linkText", "Edit");
		click(editlink);

	}

	@DataProvider(name="fetchdata")

	public Object[][] inputdataforcreatelead()
	{
		Object[][] data=new Object[2][3];
		data[0][1]="ValueGlobal";
		data[0][2]="Gayathri";
		data[0][3]="K";
		data[1][1]="Pathfinder";
		data[1][2]="sangeetha";
		data[1][3]="R";

		return data;


	}

}






