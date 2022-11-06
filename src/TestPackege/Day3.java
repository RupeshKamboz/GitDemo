package TestPackege;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Day3 {
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("I am the first first");
	}
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("I ma in the LAst LAst");
	}
	@BeforeMethod
	public void bMethod()
	{
		System.out.println("Before Method");
	}
	@AfterMethod
	public void aMethod()
	{
		System.out.println("After Method");
	}
	@Test(timeOut=2000)
	public void m3() {
		System.out.println("Day3 = yes22222");
	}
@Parameters({"URL"})
	@Test
	public void mr(String urlName) {
	System.out.println("---------------------------");
		System.out.println("Day3(2) URL Name = "+urlName);
		System.out.println("---------------------------");
	}
	@Test(enabled = false)
	public void mree() {
		System.out.println("This will not Execute");
	}

	@Test(dependsOnMethods= {"mr"})
	public void dt() {
		System.out.println("Day3 =yes yes yes3333");
	}
	@Test(groups= {"Smoke"})
	public void thoiswillrunn() {
		System.out.println("D3 Same name as DAy Method");
	}
	@Test(groups= {"Smoke"})
	public void thoiswillr() {
		System.out.println("D3 Differ name ");
	}


}
