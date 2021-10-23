package basic;

import java.util.ArrayList;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlerTask {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		Thread.sleep(500);
		driver.manage().window().maximize();
		String parent = driver.getWindowHandle();
		System.out.println("Parent Window id is ="+parent);
		Set<String>allWindows = driver.getWindowHandles();
		int count= allWindows.size();
		System.out.println("Total Count"+count);
		//Using for each Loop
		for(String child:allWindows){
			if(!parent.equalsIgnoreCase(child)){
				driver.switchTo().window(child);
				System.out.println("Child window title is:"+driver.getTitle());
				Thread.sleep(500);
				driver.close();
			}
		}
	driver.switchTo().window(parent);
	System.out.println("Parent Window Title is: "+driver.getTitle());

	
	
	
	//Using Array List
	/*ArrayList<String>tabs = new ArrayList<>(allWindows);
	driver.switchTo().window(tabs.get(2));
	driver.close();
	driver.switchTo().window(tabs.get(1));
	driver.close();
	driver.switchTo().window(tabs.get(0));
	System.out.println("Title of parent window is:"+driver.getTitle());
	*/
		
	}
}
