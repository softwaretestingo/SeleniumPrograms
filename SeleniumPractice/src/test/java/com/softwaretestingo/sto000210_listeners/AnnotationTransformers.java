package com.softwaretestingo.sto000210_listeners;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;
public class AnnotationTransformers implements IAnnotationTransformer 
{
	public boolean isTestRunning(ITestAnnotation ins)
	{
		if(ins.getAlwaysRun())
		{
			return true;
		}
		return false;
	}

	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) 
	{
		if(isTestRunning(annotation))
		{
			annotation.setEnabled(false);
		}
	}
}