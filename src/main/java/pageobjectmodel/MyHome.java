package pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import week3.day2.Annotation;

public class MyHome extends Annotation {
	public MyHome()

	{
		PageFactory.initElements(driver, this);
	}
	
@FindBy(linkText="Leads")
WebElement leads;



public MyLeads clickLeads()
{
	click(leads);
	return new MyLeads();
}
}