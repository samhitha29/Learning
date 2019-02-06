package com.practice.coding;

public class Sorting {

	public static int[] selectionSort(int[] arr, int n) {
		System.out.println("Selection Sort");
		for (int i = 0; i < n - 1; i++) {
			int imin = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[imin]) {
					imin = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[imin];
			arr[imin] = temp;
		}
		return arr;
	}

	public static int[] bubbleSort(int[] arr, int n) {
		System.out.println("Bubble Sort");
		for (int pass = 0; pass < n; pass++) {
			boolean isSwapped = false;
			for (int j = 0; j < (n - pass - 1); j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					isSwapped = true;
				}
			}
			if (!isSwapped)
				break;
		}
		return arr;
	}

	public static int[] insertionSort(int[] arr, int n) {
		System.out.println("Insertion Sort");
		for (int i = 1; i < n; i++) {
			int value = arr[i];
			int hole = i;
			while (hole > 0 && arr[hole - 1] > value) {
				arr[hole] = arr[hole - 1];
				hole = hole - 1;
			}
			arr[hole] = value;
		}
		return arr;
	}

	public static int[] mergeSort(int[] arr, int n) {
		if (n < 2)
			return arr;
		int mid = n / 2;
		int[] left = new int[mid];
		int[] right = new int[n - mid];
		for (int i = 0; i < mid; i++)
			left[i] = arr[i];
		for (int i = mid; i < n; i++)
			right[i - mid] = arr[i];
		left = mergeSort(left, left.length);
		right = mergeSort(right, right.length);
		merge(left, right, arr);
		return arr;
	}

	private static void merge(int[] left, int[] right, int[] arr) {

		int l = left.length;
		int r = right.length;
		int i = 0, j = 0, k = 0;
		while (i < l && j < r) {
			if (left[i] < right[j]) {
				arr[k] = left[i];
				i++;
			} else {
				arr[k] = right[j];
				j++;
			}
			k++;
		}
		while (i < l) {
			arr[k] = left[i];
			i++;
			k++;
		}
		while (j < r) {
			arr[k] = right[j];
			j++;
			k++;
		}

	}

	public static int[] quick(int[] arr, int n) {
		int start = 0;
		int end = n - 1;
		quickSort(arr, start, end);
		return arr;
	}

	public static void quickSort(int[] arr, int start, int end) {

		if (start < end) {
			int pIndex = partition(arr, start, end);
			quickSort(arr, start, pIndex - 1);
			quickSort(arr, pIndex + 1, end);
		}

	}

	private static int partition(int[] arr, int start, int end) {

		int pivot = arr[end];
		int pIndex = start;
		for (int i = start; i < end; i++) {
			if (arr[i] < pivot) {
				int temp = arr[i];
				arr[i] = arr[pIndex];
				arr[pIndex] = temp;
				pIndex++;
			}
		}
		int temp = arr[pIndex];
		arr[pIndex] = arr[end];
		arr[end] = temp;
		return pIndex;
	}

}
