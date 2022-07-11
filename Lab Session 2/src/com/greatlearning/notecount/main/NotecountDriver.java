package com.greatlearning.notecount.main;

import java.util.Scanner;
import com.greatlearning.notecount.services.counting.NoteCounting;
import com.greatlearning.notecount.services.sorting.MergeSortImplementation;

public class NotecountDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergeSortImplementation sort = new MergeSortImplementation();
		NoteCounting count = new NoteCounting();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of currency denominations:");
		int denom = scan.nextInt();
		int[] notes = new int[denom];
		System.out.println("Enter the currency denominations value");
		for(int j=0; j<denom; j++)
			notes[j]=scan.nextInt();
		System.out.println("Enter the amount you want to pay");
		int amount = scan.nextInt();
		sort.mergeSort(notes, 0, notes.length-1);
		count.notesCountImplementation(notes, amount);
		//System.out.println("Thank You!");
		scan.close();
	}

}
