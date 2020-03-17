package reRunner;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RerunnerDemo {
	@Test
	public void tCase1() {
		Assert.assertTrue(true);
		Assert.assertTrue(true);

		System.out.println("Test Case 1");

	}

	@Test//(retryAnalyzer=MainClass.class)
	public void tCase2() {
		Assert.assertTrue(false);
		Assert.assertTrue(true);

		System.out.println("Test Case 2");

	}

	@Test
	public void tCase3() {
		Assert.assertTrue(true);
		Assert.assertTrue(true);

		System.out.println("Test Case 3");

	}

	@Test
	public void tCase4() {
		Assert.assertTrue(false);
		Assert.assertTrue(true);

		System.out.println("Test Case 4");

	}
}
