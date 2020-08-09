package com.healthedge.toys;

class HealthEdgeCountMaxQuantityToys {
	static int maxQuantityOfToys(int[] toysCost, int size, int purchaseAmt, int[] quantityOfToys) {
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

	public static void main(String[] args) {
		int purchaseAmount = 25;
		int[] costOfToysArr = { 5, 1, 3, 2, 8 };
		int[] quantityOfToysArr = { 1, 10, 5, 3, 0 };
		int size = costOfToysArr.length;

		System.out.println("Total Number of toys you can get is: "
				+ maxQuantityOfToys(costOfToysArr, size, purchaseAmount, quantityOfToysArr));
	}
}
