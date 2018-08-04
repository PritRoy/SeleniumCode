package week3.day2;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.hamcrest.core.IsSame;
import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;


public class TestNgListeners implements IAnnotationTransformer,IRetryAnalyzer{
	int imaxretry=1;
	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		if(!result.isSuccess() && imaxretry<2)
		{
			imaxretry++;
			return true;
		}
		else {

			return false;
		}

	}

	@Override
	public void transform(ITestAnnotation annotation, Class testClass, 
			Constructor testConstructor, Method testMethod) {
		// TODO Auto-generated method stub
		
		annotation.setRetryAnalyzer(this.getClass());

	}


}
