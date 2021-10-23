package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;

public class ActionTask {
	 public static void main(String[] args) {
	        System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();

	        driver.get("https://www.facebook.com/");
	        WebElement elm1 = driver.findElement(By.id("email"));
	        WebElement elm2 = driver.findElement(By.id("pass"));
	        Actions cpypast = new Actions(driver); 


	       Action write = cpypast.sendKeys(elm1, "Pratik").build();
	       Action select = cpypast.doubleClick(elm1).build();
	       Action copy = cpypast.sendKeys(elm1, Keys.CONTROL).sendKeys(elm1, "C").build();
	       Action past = cpypast.sendKeys(elm2,Keys.CONTROL).sendKeys(elm2,"V").build();
	        write.perform();
	        select.perform();
	        copy.perform();
	        past.perform();

	        String str = elm2.getText();
	        System.out.println(str);

	        driver.close();

	    }


}
