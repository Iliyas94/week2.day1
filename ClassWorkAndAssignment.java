package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassWorkAndAssignment {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		
		driver.manage().window().maximize();
		
		WebElement findElement = driver.findElement(By.id("username"));
		findElement.sendKeys("Demosalesmanager");
		WebElement findElement1 = driver.findElement(By.name("PASSWORD"));
		findElement1.sendKeys("crmsfa");
		WebElement classname = driver.findElement(By.className("decorativeSubmit"));
		classname.click();
		WebElement findElement2 = driver.findElement(By.linkText("CRM/SFA"));
		findElement2.click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		WebElement companyName = driver.findElement(By.id("createLeadForm_companyName"));
		companyName.sendKeys("Tata");
		WebElement firstName = driver.findElement(By.id("createLeadForm_firstName"));
		firstName.sendKeys("Iliyas");
		WebElement lastName = driver.findElement(By.id("createLeadForm_lastName"));
		lastName.sendKeys("Ahmed");
		
		WebElement dateOfBirth = driver.findElement(By.id("createLeadForm_birthDate"));
		dateOfBirth.sendKeys("12/29/1994");
		WebElement countrycode = driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
		countrycode.sendKeys("91");
		WebElement phoneNumber = driver.findElement(By.id("createLeadForm_primaryPhoneNumber"));
		phoneNumber.sendKeys("8681908640");
		WebElement addressname = driver.findElement(By.id("createLeadForm_generalToName"));
		addressname.sendKeys("IliyasAhmed");
		WebElement genralName = driver.findElement(By.id("createLeadForm_generalAttnName"));
		genralName.sendKeys("Iliyas");
		WebElement address1 = driver.findElement(By.id("createLeadForm_generalAddress1"));
		address1.sendKeys("No64,BHEL Nagar");
		WebElement address2 = driver.findElement(By.id("createLeadForm_generalAddress2"));
		address2.sendKeys("Medavakkam");
		WebElement city = driver.findElement(By.id("createLeadForm_generalCity"));
		city.sendKeys("Chennai");
		WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		state.sendKeys("Tamilnadu");
		WebElement postalcode = driver.findElement(By.id("createLeadForm_generalPostalCode"));
		postalcode.sendKeys("600100");
		WebElement country = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		country.sendKeys("India");
		
		WebElement createLead = driver.findElement(By.name("submitButton"));
		createLead.click();
		
		
		//driver.close();
		
		
		
		
		
	}

}
