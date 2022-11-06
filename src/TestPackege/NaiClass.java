package TestPackege;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NaiClass {

	@Test(dataProvider = "getData")
	public void allData(String name, String password) {
		System.out.println("Name = " + name + "\tPassword = " + password);

	}
	@Test
	public void methodTestCheck()
	{
		Assert.assertTrue(false);
	}

	@DataProvider
	public Object getData() {
		Object[][] data = new Object[3][2];
		data[0][0] = "FirstUserName";
		data[0][1] = "FirstUserPassword";
		data[1][0] = "SecondUserName";
		data[1][1] = "SecondUserPassword";
		data[2][0] = "ThirdUserName";
		data[2][1] = "ThirdUserPassword";
		return data;

	}

}
