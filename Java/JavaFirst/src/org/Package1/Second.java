package org.Package1;

import java.util.Scanner;

public class Second {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[5];
		System.out.println("Enter no's:");
		for(int i=0;i<5;i++)
			arr[i]=sc.nextInt();
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
				System.out.println(arr[i]+" is even no");
			else
				System.out.println(arr[i]+" is odd no");
		}
			
	}

}
