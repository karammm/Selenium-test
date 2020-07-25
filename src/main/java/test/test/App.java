package test.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

/**
 * Hello world!
 *
 */

public class App 
{	
	/*
	 * WebDriver driver;
	 * 
	 * @Test public void test(){ System.setProperty("webdriver.chrome.driver",
	 * "C:\\Users\\user\\Music\\chromedriver.exe"); driver = new ChromeDriver();
	 * driver.get("http://www.facebook.com/");
	 * driver.findElement(By.name("email")).sendKeys("Hell World");
	 * driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("hello123"); }
	 */
	
	//
	
	/*
	 * @BeforeSuite public void beforesuit() {
	 * System.out.println("Before Suit Annotation"); }
	 * 
	 * @BeforeClass public void beforeclass() {
	 * System.out.println("Before Class Annotation"); }
	 * 
	 * @AfterClass public void afterclass() {
	 * System.out.println("After Class Annotation"); }
	 * 
	 * @BeforeMethod public void beforemethod() {
	 * System.out.println("Before Method Annotation"); }
	 * 
	 * @AfterMethod public void aftermethod() {
	 * System.out.println("After Method Annotation"); }
	 * 
	 * @Test public void test1() { System.out.println("Before Test Annotation"); }
	 * 
	 * @Test public void test2() { System.out.println("Before Test 2 Annotation"); }
	 * 
	 * @Test public void test3() { System.out.println("Before Test 3 Annotation"); }
	 * //while leaving the suite
	 * 
	 * @AfterSuite public void Aftersute() {
	 * System.out.println("After suite Annotation"); }
	 */
	
	//
	WebDriver driver;	
	@BeforeTest
	public void beforetest() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Music\\chromedriver.exe"); driver = new ChromeDriver();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--headless");
		driver=new ChromeDriver(options);
		
		}
	
	@BeforeMethod
	public void open() {
		driver.get("http://www.intellipaat.com");
	}
	
	@Test
	public void test() {
		driver.findElement(By.xpath("//input[@id='s']")).sendKeys("Devops");
		driver.findElement(By.xpath("//button[@id='home-search-btn']")).click();
		driver.findElement(By.xpath("//h3[contains(text(),'DevOps Certification Training Course Online')]")).click();
		driver.findElement(By.xpath("//h1[contains(text(),'DevOps Certification Training Course Online')]")).isDisplayed();
	}
	
//	@AfterClass
//	private void close() {
//		driver.quit();
//	}
	
	
}
