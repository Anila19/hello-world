package Strings.Interviews;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Del1 {
public static void main(String[] args){
//	WebDriver driver = new FirefoxDriver();
//	
//	driver.get("https://www.google.com");
//	driver.findElement(By.linkText("Gmail")).click();
//	WebDriverWait wait = new WebDriverWait(driver,10);
//	wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Gmail")));
	
	String name = "anila";
	int len = name.length()-1;
	System.out.println(len);
}
}
