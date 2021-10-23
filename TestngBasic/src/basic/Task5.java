package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Task5 {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","E:\\ChromeDriver.exe");
		driver.get("https://www.goibibo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='gosuggest_inputSrc']")).sendKeys("Pune(PNQ)");
		/*driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div[1]/div/div[1]/input")).sendKeys("Pune(PNQ)");
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div[1]/div/div[4]/input")).sendKeys("Nagpur(NAG)");
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div[1]/div/div[6]/input")).sendKeys("Tue,14 Sep");
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div[2]/button")).click();
		*/
	}
}
