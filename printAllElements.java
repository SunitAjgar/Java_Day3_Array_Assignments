package com.blz.arraysDay3;

import java.util.Scanner;

public class printAllElements {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int arr[] = new int[10];
	for (int i = 0; i < arr.length; i++) {
	System.out.println("Enter the element");
        arr[i] = sc.nextInt();
        }
	System.out.print("The array is ");
	for (int i = 0; i < arr.length; i++) {
	System.out.print(arr[i] + " ");
		}
	}
}
