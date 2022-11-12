package tests;



import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class loginTest {

	@Test
	public void login() throws IOException  {
		
//		//Open chrome browser
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver=new ChromeDriver();
//		
//		//Open URL of the Application
//		driver.get("URL");
//		
//		//Create WebElements
//		WebElement username=driver.findElement(By.xpath(""));
//		
//		WebElement password=driver.findElement(By.xpath(""));
//		
//		These are new chnages
//		//Read MyProject.properties
//		
		Properties prop=new Properties();
		
		//Load properties file
		
		prop.load(loginTest.class.getClassLoader().getResourceAsStream("MyProject.properties"));
		
		String uName=prop.getProperty("uName");//AgentHunt
		String pwd=prop.getProperty("Pwd");//MissionImpossible
		
		System.out.println("Username Value is ==> " +uName);
		System.out.println("Password Value is ==> " +pwd);
		//Enter username and password values
		
//       	username.sendKeys(uName);//AgentHunt
//		password.sendKeys(pwd);//MissionImpossible

		//Run CMD- mvn -Dusername=AgentHunt -Dpassword=MissionImpossible clean install
	}
}
