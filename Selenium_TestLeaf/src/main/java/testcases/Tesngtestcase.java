package testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;


public class Tesngtestcase {
	
	@BeforeSuite
	public void suite(){
		System.out.println("Beforesuite executed");
	}
	@BeforeClass
	public void clas(){
		System.out.println("Before class executed");
	}
	
	@BeforeTest
	public void test(){
		System.out.println("Before Test is executed");
	}
	
	@BeforeMethod
	
	public void metod(){
		System.out.println("before method executed ");
	}
	@AfterSuite
	public void suite2(){
		System.out.println("After suite executed");
	}
	@AfterClass
	public void clas2(){
		System.out.println("After class executed");
	}
	
	@AfterTest
	public void test3(){
		System.out.println("After Test is executed");
	}
	
	@AfterMethod
	
	public void metod3(){
		System.out.println("After Method is executed ");
	}

}
