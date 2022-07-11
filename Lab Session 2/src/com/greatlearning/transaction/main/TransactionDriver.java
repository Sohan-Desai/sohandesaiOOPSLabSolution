package com.greatlearning.transaction.main;
import java.util.Scanner;
import com.greatlearning.transaction.services.TransactionService;

public class TransactionDriver {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		TransactionService transServ = new TransactionService();
		System.out.println("Enter the size of transaction array:");
		int size = scan.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the values of array");
		for (int i=0; i<size; i++) {
			arr[i]=scan.nextInt();
		}
		
		System.out.println("Enter the total no of targets that need to be achieved");
		int targetSize = scan.nextInt();
		int target;
		while (targetSize-->0) {
			System.out.println("Enter the value of target");
			target=scan.nextInt();
			transServ.checkTransaction(arr, target);
		}
		scan.close();
	}

}
