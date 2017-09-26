package com.mine.DS_ALGO;

public class InsertionSort {

	public void insertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int value = arr[i];
			int pos = i;

			while (pos > 0 && arr[pos - 1] > value) {
				arr[pos] = arr[pos - 1];
				pos--;
			}

			arr[pos] = value;

		}

	}

	public static void main(String[] args) {
		int[] arr = { 5, 7, 6, 8, 1, 3, 9, 2, 4 };

		for (int i : arr) {
			System.out.print(i + "  ");
		}
		System.out.println("\n-------------------------");
		new InsertionSort().insertionSort(arr);
		for (int i : arr) {
			System.out.print(i + "  ");
		}

	}

}
