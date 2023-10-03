package com.lab.currency;

public class Currency {

	public void currencyCount(int[] denominations, int payValue) {
		int[] countDenominations = new int[denominations.length];
		for (int i = 0; i < denominations.length; i++) {

			if (payValue > denominations[i]) {
				int noOfNotes = payValue / denominations[i];
				payValue = payValue - (denominations[i] * noOfNotes);
				countDenominations[i] = noOfNotes;
				if (payValue == 0) {
					break;
				}
			}
		}
		if (payValue == 0) {
			System.out.println("Your payment approach in order to give min number of notes will be ");
			for (int i = 0; i < denominations.length; i++) {
				if (countDenominations[i] != 0) {
					System.out.println(denominations[i] + ":" + countDenominations[i]);
				}
			}
		} else {
			System.out.println("Exact pay value can't be paid with highest possible denominations");

		}
	}
}
