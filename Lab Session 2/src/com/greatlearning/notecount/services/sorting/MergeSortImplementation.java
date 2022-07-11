package com.greatlearning.notecount.services.sorting;

public class MergeSortImplementation {

	public static void mergeSort(int[] array, int start, int end) {
		if(start<end) {
			int mid = start+(end-start)/2;

			mergeSort(array,start,mid);
			mergeSort(array,mid+1,end);

			merge(array, start, mid, end);
		}
	}

	public static void merge(int[] array, int start, int mid, int end) {
		int size1=mid-start+1;
		int size2=end-mid;

		int[] arr1 = new int[size1];
		for(int i=0; i<size1; i++)
			arr1[i]=array[start+i];

		int[] arr2 = new int[size2];
		for(int i=0; i<size2; i++)
			arr2[i]=array[mid+1+i];

		int array1Index=0;
		int array2Index=0;
		int resultIndex=start;

		while(array1Index<size1&&array2Index<size2) {
			if(arr1[array1Index]>=arr2[array2Index])
				array[resultIndex++]=arr1[array1Index++];
			else
				array[resultIndex++]=arr2[array2Index++];
		}
		while(array1Index<size1)
			array[resultIndex++]=arr1[array1Index++];
		while(array2Index<size2)
			array[resultIndex++]=arr2[array2Index++];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {14,25,8,22,67,41,38,50};
		System.out.println("Array before sorting:");
		for(int i=0; i<array.length; i++)
			System.out.print(array[i] +" ");
		mergeSort(array,0,array.length-1);
		System.out.println("\nArray after sorting:");
		for(int i=0; i<array.length; i++)
			System.out.print(array[i] +" ");
	}

}
