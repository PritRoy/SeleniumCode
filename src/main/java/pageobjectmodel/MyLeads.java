package pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import week3.day2.Annotation;

public class MyLeads extends Annotation {
	public MyLeads()

	{
		PageFactory.initElements(driver, this);
	}
	
@FindBy(linkText="Create Lead")
WebElement myleads;


public CreateLead clickcreateLeads()
{
	click(myleads);
	return new CreateLead();
}
}