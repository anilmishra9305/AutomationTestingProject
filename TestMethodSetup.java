package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestMethodSetup {
	
	public static WebDriver driver=null;
	
	
	public void openBrowser()
	{
		
		
		String commonPath=System.getProperty("user.dir");
		try {
			
			
			CommonFunction com=new CommonFunction();
			String browservalue=com.readPropertyFile("browsername");
			
			if (browservalue.equals("chrome")) {
				
				System.setProperty("webdriver.chrome.driver", commonPath+"\\driver\\chromedriver.exe");
				driver=new ChromeDriver();
				driver.manage().window().maximize();
				
				
			}
			
			
			else if(browservalue.equals("firefox"))
			{
				
            System.setProperty("webdriver.gecko.driver", commonPath+"\\driver\\geckodriver.exe");
            
            driver=new FirefoxDriver();
            driver.manage().window().maximize();
				
				
			}
			
			else if(browservalue.equals("ie"))
			{
				
				
			}
			
			
			else
			{
				
				System.out.println("Please check your code!!");
			}
			
			
			
			
			
			
			
			
		} catch (Exception e) {

		e.printStackTrace();
		}
		
		
		
		
		
	}
	
	
	
	

}
