package br.ce.wcaquino.utils;

import org.junit.Assert;
import org.junit.Test;

public class AssertTest {
	
	@Test
	public void test() {
		Assert.assertTrue(true);
		Assert.assertFalse(false);
		
		
		Assert.assertEquals(1, 1);
		
		Assert.assertEquals(0.51, 0.51, 0.1);

		
	}

}
