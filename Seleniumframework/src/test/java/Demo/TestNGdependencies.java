package Demo;

import org.testng.annotations.Test;

public class TestNGdependencies {
	
	
	@Test(dependsOnGroups ="a1" )
	public void testa() {
		System.out.println("this is test a");
	}
	
	@Test(groups = "a1")
	public void testb() {
		System.out.println("this is test b");
			}
	
	@Test
	public void testc() {
		System.out.println("this is test c");
	}

}
