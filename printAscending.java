package com.blz.arraysDay3;

import java.util.Scanner;

public class printAscending {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array : ");
		int size = sc.nextInt();
		int[] arr = new int[size];

		for (int i = 0; i < arr.length; i++) {
		System.out.print("Enter the element at index " + i + " " + "is : ");
		arr[i] = sc.nextInt();

		}
		System.out.print("The original array is : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		int hold = 0;
		for (int i = 0; i < arr.length; i++) {
		for (int j = i+1; j < arr.length; j++) {
		if (arr[i] > arr[j]) {
	        hold = arr[i];
		arr[i] = arr[j];
	        arr[j] = hold;
				}
			}
		}
		System.out.println();
		System.out.print("The array after sorting is ascending order is : ");
		for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i] + " ");
		}
	}
}
