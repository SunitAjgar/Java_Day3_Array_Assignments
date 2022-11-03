package com.blz.arraysDay3;

import java.util.Scanner;

public class EvenPosition {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the the size of the array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
		System.out.print("Enter the element at index " + i + " is" + " ");
		arr[i] = sc.nextInt();
		}
		System.out.print("The original array is : ");
		for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.print("The elements present at odd index position are : ");
		for (int i = 0; i < arr.length; i++) {
		if(i % 2 == 0) {
		System.out.print(arr[i] + " ");
		}
		}
	}
}
