package Listerers;

import org.junit.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listerers.testNGListerners.class)

public class ListernersDemo1 {
	
	@Test
	public void test1() {
		System.out.println("This is test1");
	}
	@Test
	public void test2() {
		System.out.println("This is test2");
		Assert.assertTrue(false);
	}
	@Test
	public void test3() {
		System.out.println("This is test3");
	}

}
