package com.blz.arraysDay3;

import java.util.Scanner;

public class largestElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
		System.out.println("Enter the elements");
                arr[i] = sc.nextInt();
		}
		int max = arr[0];
		for(int i = 1; i < arr.length; i++) {
		if(arr[i]>max) {
		max = arr[i];
		}
		}
		System.out.println("The largest element in the array is : " +max);
	}
}
