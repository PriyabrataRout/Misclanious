package com.priya.Algos;

public class QuickSort {

	public void quickSort(int[] arr, int lo, int hi) {
		if (lo >= hi)
			return;
		int pivot = partition(arr, lo, hi);
		quickSort(arr, lo, pivot);
		quickSort(arr, pivot + 1, hi);

	}

	public int partition(int[] arr, int lo, int hi) {
		int pivot = arr[lo];
		int i = lo - 1;
		int j = hi + 1;
		while (true) {
			do {
				i++;
			} while (arr[i] < pivot);
			do {
				j--;
			} while (arr[j] > pivot);

			if (i >= j)
				return j;

			swap(arr, i, j);

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
		new QuickSort().quickSort(arr, 0, arr.length - 1);
		for (int i : arr) {
			System.out.print(i + "  ");
		}

	}

}
