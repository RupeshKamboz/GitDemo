package TestPackege;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day2 {
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before  Test");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("After  Test");
	}

	@Test(groups= {"Smoke"})
	public void thoiswillrunn() {
		System.out.println("this will Onky RUN");
	}
	@Parameters({"URL"})
	@Test
	public void memmo(String uname) {
		System.out.println("---------------------------");
		System.out.println("URL(1) Day2 = "+uname);
		System.out.println("---------------------------");
	}

	@Test
	public void mobileLoginCarLoad() {
		System.out.println("mobileLoginCarLoad	mobileLoginCarLoad	mobileLoginCarLoad");
	}

	@Test
	public void mobileLoginPersonalLoad() {
		System.out.println("mobileLoginPersonalLoad	mobileLoginPersonalLoad	mobileLoginPersonalLoad");
	}
}
