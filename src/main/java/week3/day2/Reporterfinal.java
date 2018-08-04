package week3.day2;

import javax.xml.crypto.dsig.spec.ExcC14NParameterSpec;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Reporterfinal {
	public static ExtentReports extent;
	public static ExtentTest suiteTest ,test;
	// This method creates the HTML report
	
	public void beginResult() {
		ExtentHtmlReporter html = new ExtentHtmlReporter("./report/result.html");
		html.setAppendExisting(true);		
		extent = new ExtentReports();
		extent.attachReporter(html);
	}

	// This method creates the test case level report in HTML
	
	public ExtentTest startTest(String excelfilename,String testname,String testdesc,String category,String Author,String Modulename) {
		suiteTest = extent.createTest(testname, testdesc);
		return suiteTest;
	}

	// This method create entry for every test case iteration

	
	public ExtentTest startTestIteration(String authorName, String category,String modulename) {	
		test = suiteTest.createNode(modulename);
		test.assignAuthor(authorName);
		test.assignCategory(category);
		
		return test;
	}

	// This method create entry for every step
	public void reportStep(String desc,String status) {
		if (status.equalsIgnoreCase("pass")) {
			test.pass(desc);
		} else if (status.equalsIgnoreCase("fail")) {
			test.fail(desc);
		}else if (status.equalsIgnoreCase("warning")) {
			test.warning(desc);
		}
	}

	// This method create the html report finally
	public void endResult() {
		extent.flush();
	}

	

}






