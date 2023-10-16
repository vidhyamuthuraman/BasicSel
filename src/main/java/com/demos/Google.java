package com.demos;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Google {

	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver;
		driver=new EdgeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		
		/*WebElement search=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
				Actions a=new Actions(driver);
				a.contextClick(search);
		a.moveToElement(search);*/
		
		
		WebElement about=driver.findElement(By.xpath("//a[@class='MV3Tnb']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click(0);", about);
		
		
	driver.findElement(By.xpath("//a[@data-g-action='keyword']")).click();
	Set<String>windows=driver.getWindowHandles();
	List<String>windowlist=new ArrayList<>(windows);
	
	driver.switchTo().window(windowlist.get(0));
	driver.findElement(By.xpath("//a[@data-g-action='stories']")).click();


	
	
		}
}
