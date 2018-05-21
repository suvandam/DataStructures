package com.algo.search;

//Search a sorted array by repeatedly dividing the search interval in half. 
//Begin with an interval covering the whole array.
//If the value of the search key is less than the item in the middle of the interval, 
//narrow the interval to the lower half. Otherwise narrow it to the upper half. 
//Repeatedly check until the value is found or the interval is empty.
public class BinarySearch {

	public static int binarySearch(int arr[], int searchElement) {
		return binarySearchMain(arr, searchElement, 0, arr.length - 1);
	}

	private static int binarySearchMain(int arr[], int searchElement, int startIndex, int lastIndex) {
		int midIndex = (startIndex + lastIndex) / 2;
		if (arr[startIndex] == searchElement) {
			return startIndex;
		} else if (arr[lastIndex] == searchElement) {
			return lastIndex;
		} else if (arr[midIndex] == searchElement) {
			return midIndex;
		} else if (midIndex <= 2) {
			return -1;
		}
		if (searchElement < arr[midIndex]) {
			return binarySearchMain(arr, searchElement, startIndex, midIndex - 1);
		} else if (searchElement > arr[midIndex]) {
			return binarySearchMain(arr, searchElement, midIndex + 1, lastIndex);
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 50, 100, 110, 130, 170 };
		int loc = binarySearch(arr, 30);
		System.out.println(loc);
		int loc1 = binarySearch(arr, 9);
		System.out.println(loc1);
		int loc2 = binarySearch(arr, 110);
		System.out.println(loc2);
		int loc3 = binarySearch(arr, 170);
		System.out.println(loc3);
	}
}
