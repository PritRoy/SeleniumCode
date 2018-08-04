package week3.day2;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class SeMethods extends Reporterfinal implements WdMethods{
	public static RemoteWebDriver driver ;
	int i = 1;
	public void startApp(String browser, String url) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\TestLeaf\\Selenium\\Softwares-20180630T225014Z-001\\Softwares\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();			
		} else if (browser.equalsIgnoreCase("firefox")) {
			//System.setProperty("webdriver.gecko.driver", "C:\\TestLeaf\\Selenium\\Softwares-20180630T225014Z-001\\Softwares\\drivers\\geckodriver.exe");"./drivers/geckoriver.exe");
			driver = new FirefoxDriver();		
		}
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		takeSnap();

	}

	public WebElement locateElement(String locator, String locValue) {
		try {
			switch (locator) {
			case "id": 	  return driver.findElementById(locValue);
			case "class": return driver.findElementByClassName(locValue);
			case "xpath": return driver.findElementByXPath(locValue);		
			case "linkText": return driver.findElementByLinkText(locValue);
			}
		} catch (WebDriverException e) { // handles the webdriver exception
			// TODO Auto-generated catch block
			System.err.println("Webdriver exception has occurred");
			throw new RuntimeException();
		}
		catch (Exception e) {// handles all type of exception. we could not handle all types of exception
			// TODO Auto-generated catch block
			System.err.println(" exception has occurred");
			throw new RuntimeException(); //stop the execution
		}
		finally
		{
			takeSnap();
		}

		return null;
	}

	public WebElement locateElement(String locValue) {
		return driver.findElementById(locValue);
		//case "class": return driver.findElementByClassName(locValue);
	}


	public void type(WebElement ele, String data) {
		try {
			ele.sendKeys(data);
			//System.out.println("The Data "+data+" is Entered Successfully");
			reportStep("The text field is entered successfully "+data,"Pass");
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			System.err.println("Webdriver exception has occurred");
			throw new RuntimeException();

		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			//	System.err.println("Webdriver exception has occurred");
			e.printStackTrace();
			throw new RuntimeException();

		}
		finally
		{
			takeSnap();

		}
	}

	public void click(WebElement ele) {
		ele.click();
		//System.out.println("The Element "+ele+" is clicked Successfully");

		takeSnap();		
	}

	public String getText(WebElement ele) {
		// TODO Auto-generated method stub
		String textvalue =ele.getText();
		System.out.println("Text is" +textvalue);
		return textvalue;	

	}

	public String getAttribute(WebElement ele, String tName) {
		// TODO Auto-generated method stub
		String value =ele.getAttribute(tName);
		//		System.out.println("Text is" +value);
		return value;	

	}

	public void selectDropDownUsingText(WebElement ele, String value) {
		// TODO Auto-generated method stub

		Select dd = new Select(ele);
		dd.selectByVisibleText(value);
		System.out.println("The value is "+value+" selected successfully");
		takeSnap();		

	}

	public void mouseoverAction(WebElement ele1,WebElement ele2) {
		// TODO Auto-generated method stub

		Actions builder = new Actions(driver);
		builder.moveToElement(ele1);
		builder.pause(3000).click(ele2).perform();

		System.out.println("The value is "+ele2+" selected successfully");
		takeSnap();		

	}

	public void selectDropDownUsingIndex(WebElement ele, int index) throws NullPointerException{
		// TODO Auto-generated method stub
		try {
			Select dropdown = new Select(ele);
			dropdown.selectByIndex(index);
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			System.err.println("Webderiver exception has occurred");
			throw new RuntimeException();
		}
		catch(Exception e) {
			System.err.println(" exception has occurred");
			throw new RuntimeException();
		}

	}

	public boolean verifyTitle(String expectedTitle) {
		// TODO Auto-generated method stub
		String originalTitle=driver.getTitle();
		if(originalTitle.equals(expectedTitle))
		{
			System.out.println("Title matches with the exact title");
			return true;
		}
		{
			System.out.println("Exact Title verification failed, expected is "+expectedTitle +" ");
			return false;
		}


	}

	public void verifyExactText(WebElement ele, String expectedText) {

		String txtVerify = ele.getText();
		if(txtVerify.equals(expectedText))
		{
			System.out.println("Text matches with the exact text");

		}
		{
			System.out.println("Exact Text verification failed, expected is "+expectedText +" ");

		}
		takeSnap();	
	}

	public void verifyPartialText(WebElement ele, String expectedText) {
		// TODO Auto-generated method stub
		String txtpartialVerify = ele.getText();
		if(txtpartialVerify.contains(expectedText))
		{
			System.out.println("Text matches with the exact text");

		}
		{
			System.out.println("Exact Text verification failed, expected is "+expectedText +" ");

		}
		takeSnap();	



	}

	public void verifyExactAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub
		String getExactattribute = ele.getAttribute(value);
		if(getExactattribute.equals(value));
		{
			System.out.println("Attriute matches with the exact attribute");

		}
		{
			System.out.println("Attribute verification failed, expected is "+value +" ");

		}
		takeSnap();	

	}

	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub
		String getPartialattribute = ele.getAttribute(value);
		if(getPartialattribute.contains(value));
		{
			System.out.println("Attriute matches with the partial attribute");

		}
		{
			System.out.println("PartialAttribute verification failed, expected is "+value +" ");

		}
		takeSnap();	
	}

	public void verifySelected(WebElement ele) {
		// TODO Auto-generated method stub
		ele.isSelected();
		System.out.println("Element selected"+ele);

	}

	public void verifyDisplayed(WebElement ele) {
		// TODO Auto-generated method stub
		ele.isDisplayed();
		System.out.println("Dsiplayed Element"+ele);
		takeSnap();	
	}

	public void switchToWindow(int index) {

		Set<String> allWindow = driver.getWindowHandles();
		List<String> listOfWindows=new ArrayList<String>();
		listOfWindows.addAll(allWindow);
		driver.switchTo().window(listOfWindows.get(index));
		takeSnap();	
	}

	public void switchToFrame(WebElement ele) {
		// TODO Auto-generated method stub

		driver.switchTo().frame(ele);
	}

	public void acceptAlert() {
		// TODO Auto-generated method stub
		driver.switchTo().alert().accept();
		System.out.println("The value OK is selected");
	}

	public void dismissAlert() {
		// TODO Auto-generated method stub
		driver.switchTo().alert().dismiss();
		System.out.println("The value Cancel is selected");
	}

	public String getAlertText() {
		// TODO Auto-generated method stub
		String alerttext= driver.switchTo().alert().getText();
		return alerttext;

	}

	public void takeSnap() {
		File src = driver.getScreenshotAs(OutputType.FILE);
		File desc = new File("./snaps/img"+i+".png");
		try {
			FileUtils.copyFile(src, desc);
		} catch (IOException e) {
			e.printStackTrace();
		}
		i++;
	}

	public void closeBrowser() {
		// TODO Auto-generated method stub

		driver.close();
	}

	public void closeAllBrowsers() {
		// TODO Auto-generated method stub
		driver.quit();

	}

}
