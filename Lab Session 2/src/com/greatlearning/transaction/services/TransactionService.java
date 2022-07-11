package com.greatlearning.transaction.services;

public class TransactionService {
	public void checkTransaction(int[] array, int target) {
		int transactions = findTarget(array, target);
		if(transactions<0) {
			System.out.println("\nGiven target is not achieved");
		}
		else {
			System.out.println("\nTarget achieved after " +transactions +" transactions!");
		}
	}

	public int findTarget (int[] array, int target) {
		int sum=0, i=0;
		while(i<array.length) {
			sum+=array[i++];
			if(sum>=target) {
				return i;
			}
		}
		return -1;
	}
}
