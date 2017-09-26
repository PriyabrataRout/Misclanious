package com.mine.DS_ALGO;

public class SelectionSort {

	public void selectionSort(int[] arr){
		for(int i=0;i<arr.length-1;i++){
			int imin=i;
			for (int j = i+1; j < arr.length; j++) {
				if(arr[j]<arr[imin])
					imin=j;
			}
			swap(arr, i, imin);
			
		}
		
	}
	public void swap(int[] arr, int lo, int hi) {
		int temp = arr[lo];
		arr[lo] = arr[hi];
		arr[hi] = temp;
	}
	
	public static void main(String[] args) {
		int[] arr = { 5, 7, 6, 8, 1, 3, 9, 2, 4 };

		for (int i : arr) {
			System.out.print(i + "  ");
		}
		System.out.println("\n-------------------------");
		new SelectionSort().selectionSort(arr);
		for (int i : arr) {
			System.out.print(i + "  ");
		}
	}

}
