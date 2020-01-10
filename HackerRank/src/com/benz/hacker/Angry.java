package com.benz.hacker;

import java.util.Scanner;

public class Angry {
	Scanner sc=null;
	
	public Angry()
	{
		sc=new Scanner(System.in);
	}

	public String angryProfessor(int k,int[] a)
	{
		int count=0;
		for(int i:a)
		{
			if(i>=0)
				count+=1;
		}
		
		if(k>=count)
			return "YES";
		else
			return "NO";
	}
	public static void main(String[] args) {
		
		Angry angry =new Angry();
		
		String[] nk= angry.sc.nextLine().split(" ");
		
		int n = Integer.parseInt(nk[0]);
		
		int k=Integer.parseInt(nk[1]);
		
		
		
		int[] arr = new int[n];
		
		String[] items= angry.sc.nextLine().split(" ");
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=Integer.parseInt(items[i]);
		}
		
		String result = angry.angryProfessor(k,arr);

		System.out.println(result);
		
		
		
		

	}

}
