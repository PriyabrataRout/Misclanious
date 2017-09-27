package com.mine.DS_ALGO;

public class BubbleSort {

	public void bubbleSort(int[] arr) {

		for (int i = 1; i < arr.length; i++) {

			for (int j = 0; j < arr.length-1; j++) {
				if (arr[j] > arr[j + 1])
					swap(arr, j, j+1);
			}
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
		new BubbleSort().bubbleSort(arr);
		for (int i : arr) {
			System.out.print(i + "  ");
		}
	}
}
