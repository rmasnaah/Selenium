import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class newUser {
	public static void main(String[]args) {
		
		String projectPath = System.getProperty("user.dir");
		System.out.println("projectPath : "+projectPath);
		
		System.setProperty("webdriver.chrome.driver", projectPath+"/driver/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://tutorialsninja.com/demo");
		
		driver.findElement(By.cssSelector(".caret")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
		String uuid = UUID.randomUUID().toString();
		driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("Rawan");
		driver.findElement(By.id("input-lastname")).sendKeys("Almasnaah");
		driver.findElement(By.cssSelector("#input-email")).sendKeys(uuid +"@gmail.com");
		driver.findElement(By.cssSelector("#input-telephone")).sendKeys("(313)898-5155");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("123Test");
		driver.findElement(By.id("input-confirm")).sendKeys("123Test");
		driver.findElement(By.xpath("//label[normalize-space()='Yes']//input[@name='newsletter']")).click();
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
	}

}
