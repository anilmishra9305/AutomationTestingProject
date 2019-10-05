package util;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CommonFunction extends TestMethodSetup{
	
	
	
	
	
	
	public String readPropertyFile(String key)
	{
		String value="";
		
		try {
			
			String path=System.getProperty("user.dir")+"\\testing.properties";
			
		    FileInputStream file=new FileInputStream(path);	
		    
		    Properties prop=new Properties();
		    prop.load(file);
		    
		    value=prop.getProperty(key);
			
			
		} catch (Exception e) {

		e.printStackTrace();
		}
		return value;
		
	}
	
	
	
	
	public void openUrl(String url)
	{
		
		
		try {
			
			driver.get(url);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	
	
	
	// this method is used for entering the data to any object
	public void enterdata(WebElement ele,String data)
	{
		
		
		try {
			
			ele.sendKeys(data);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	// to click on particular object
	
	public void clickonAnyObject(WebElement ele)
	{
		
		try {
			
			ele.click();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
	}
	
	// method for selecting any value from dropdown
	
	
	public void selectdropdownByIndex(WebElement ele,int data)
	{
		
		try {
			
			
			Select se=new Select(ele);
			se.selectByIndex(data);
			
		} catch (Exception e) {

		e.printStackTrace();
		}
		
		
		
		
		
		
	}
	
	
	
	
	
	
	

}
