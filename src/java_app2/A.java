package java_app2;

import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		//int max=0; 
	//	int j=0;
		int temp;
		int []arr= {10,20,32,21,12,0};
		//int x[]=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
			
		}
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
	System.out.println("second largest number");
	System.out.println(arr[arr.length-2]);
		
	}
}
