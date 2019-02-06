package com.practice.coding;

public class MainClass {

	public static void main(String[] args) {

		int[] arr = { 4, 5, 6, 7, 8, 9, 1, 2, 3 };
		int n = arr.length;
		// arr = Sorting.selectionSort(arr,n);
		// arr = Sorting.bubbleSort(arr,n);
		// arr = Sorting.insertionSort(arr,n);
		// System.out.println("Merge Sort");
		// arr = Sorting.mergeSort(arr, n);
		System.out.println("Quick Sort");
		arr = Sorting.quick(arr, n);
		printArray(arr, n);

	}

	private static void printArray(int[] arr, int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
