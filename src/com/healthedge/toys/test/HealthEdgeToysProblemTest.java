/*
 * Author: Karthik Akinapelli
 */
package com.healthedge.toys.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.healthedge.toys.HealthEdgeCountMaxQuantityToys;

public class HealthEdgeToysProblemTest {
	
	/**
	 * Test max quantity of toys.
	 */
	@Test
	public void testMaxQuantityOfToys() {
		int purchaseAmount = 25;
		int[] costOfToysArr = { 5, 1, 3, 2, 8 };
		int[] quantityOfToysArr = { 1, 10, 5, 3, 0 };
		int size = costOfToysArr.length;
		
		int maxQuantityOfToys = HealthEdgeCountMaxQuantityToys.maxQuantityOfToys(costOfToysArr, size, purchaseAmount, quantityOfToysArr);
		
		assertEquals(16, maxQuantityOfToys);
	}

}
