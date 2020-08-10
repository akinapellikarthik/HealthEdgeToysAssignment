/*
 * Author: Karthik Akinapelli
 */
package com.healthedge.toys;

import java.util.Arrays;
import java.util.Scanner;

public class HealthEdgeCountMaxQuantityToys {
	
	/**
	 * Max quantity of toys.
	 *
	 * @param toysCost the toys cost
	 * @param size the size
	 * @param purchaseAmt the purchase amt
	 * @param quantityOfToys the quantity of toys
	 * @return the int
	 */
	public static int maxQuantityOfToys(int[] toysCost, int size, int purchaseAmt, int[] quantityOfToys) {
		int count = 0;
		int temp = 0;
		for (int i = 0; i < size; i++) {
			if ((temp + toysCost[i] <= purchaseAmt) && quantityOfToys[i] > 0) {
				temp = temp + (toysCost[i] * quantityOfToys[i]);
				count += quantityOfToys[i];
			}
		}
		return count;
	}

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int purchaseAmount = 0;
			int[] costOfToysArr = { 5, 1, 3, 2, 8 };
			int size = costOfToysArr.length;

			System.out.println("********************");
			System.out.print("Enter Toys availability in shop for A B C D E :: ");
			String quantityToysAvailable = scanner.nextLine();
			int[] quantityOfToysArr = Arrays.stream(quantityToysAvailable.split(" ")).mapToInt(Integer::parseInt)
					.toArray();

			System.out.print("Enter the payable amount :: ");
			purchaseAmount = scanner.nextInt();

			System.out.println("********************");
			System.out.println("Maximum quantity of toys can be purchased :: "
					+ maxQuantityOfToys(costOfToysArr, size, purchaseAmount, quantityOfToysArr));
		}
	}
}
