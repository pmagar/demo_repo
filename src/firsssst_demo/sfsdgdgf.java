package firsssst_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class sfsdgdgf {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","E:\\selenium_3.141.59\\selenium_setup\\drivers\\firefoxdriver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.toolsqa.com/");
		Thread.sleep(2000);
	//	driver.findElement(By.xpath("//*[@id=\"primary-menu\"]/li[1]/a/span/span")).click();//home
	//	driver.navigate().back();
		Actions act=new Actions(driver);
		WebElement ele=driver.findElement(By.xpath("//*[@id=\"primary-menu\"]/li[2]/a/span/span"));
		act.build().perform();
		WebElement ele2=driver.findElement(By.xpath("//*[@id=\"primary-menu\"]/li[2]/ul/li[1]/a/span/span"));
		act.moveToElement(ele2).build().perform();
		Thread.sleep(2000);
		System.out.println("print ");
		
		
	}

}
