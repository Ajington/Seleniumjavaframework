package Demo;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;


public class TestNGIgnoretest {
	
	
	@Test()
	public void testa() {
		System.out.println("this is test a");
	}
	
	@Test()
	public void testb() {
		System.out.println("this is test b");
		int a=1/0;
	}
	
	@Ignore
	@Test
	public void testc() {
		System.out.println("this is test c");
	}

}
