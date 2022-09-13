package demo;

import org.testng.annotations.Test;

public class DataFromVarugTest {
	@Test
	public void readata()
	{
		String Browser=System.getProperty("browser");
		String USERNAME=System.getProperty("username");
		String URL=System.getProperty("url");
		System.out.println(Browser);
		System.out.println(USERNAME);
		System.out.println(URL);
	}
	@Test
	public void getdata()
	{
		System.out.println("read");
	}

}
