package br.ce.wcaquino.utils;

import org.junit.Assert;
import org.junit.Test;

public class AssertTest {
	
	@Test
	public void test() {
		Assert.assertTrue(true);
		Assert.assertFalse(false);
		
		
		Assert.assertEquals(1, 1);
		
		Assert.assertEquals(0.51234, 0.512, 0.01);
		Assert.assertEquals(Math.PI, 3.14, 0.01);

		
		
	}

}
