package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {

	public static void main(String[] args) {
		WebDriver driver;
		String basepath=System.getProperty("user.dir");
		System.out.println(basepath);
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\src\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://www.google.co.in");	
		driver.findElement(By.xpath("//*[@id='gs_htif0']")).sendKeys("selenium");
		driver.close();
	}

}
