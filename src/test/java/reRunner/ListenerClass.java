package reRunner;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;

public class ListenerClass implements IAnnotationTransformer{

	public void transform(ITestAnnotation a, Class testClass, Constructor testConstructor, Method testMethod) {
		IRetryAnalyzer r = a.getRetryAnalyzer();
		if (r==null) {
			a.setRetryAnalyzer(MainClass.class);
			
		}
		
	}

}
