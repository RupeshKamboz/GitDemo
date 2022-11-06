package TestPackege;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.Test;


public class TestDemo {
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before Test");
	}
	@Test(groups= {"Smoke"})
	public void thoiswillrunn() {
		System.out.println("TestDemo Same Name as d2 and d3");
	}
	@Parameters({"URL"})
	@Test
	public void Dead(String uname)
	{
		System.out.println("---------------------------");
		System.out.println("TestDemo(1) Url Name "+uname );
		System.out.println("---------------------------");
	}
	@Test
	public void Dead2()
	{
		System.out.println("Dead !!!");
	}

}
