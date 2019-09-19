package clone.org.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CloneTask {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MORTEIN KENNEDY\\eclipse-workspace\\SeleniumDay5\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		WebElement w = driver.findElement(By.xpath("//a[text()='COURSES']"));
		Actions a=new Actions(driver);
		a.moveToElement(w).perform();
		
		WebElement et = driver.findElement(By.xpath("(//span[contains(text(),'SAP ')])[1]"));
		a.moveToElement(et).perform();
		
		WebElement ert = driver.findElement(By.xpath("//span[text()='SAP MM Training']"));
		ert.click();
		
		WebElement erty = driver.findElement(By.xpath("//p[text()='Greens technology’s selenium training will upgrade your skills in automation testing field and makes you master in selenium architecture.  We provide training in all the components of selenium and mainly focuses on your hand-on experience with multiple project works. This course was demonstrated by Greens technology experts who have intensive knowledge in selenium field. Our prior candidates consider us as a ']"));
		String text = erty.getText();
		System.out.println(text);
		

	

	}

}
