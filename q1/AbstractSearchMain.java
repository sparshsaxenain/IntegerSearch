package com.prodapt.q1;

import java.util.Scanner;

public class AbstractSearchMain {
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter length-: ");
		int size = sc.nextInt();
		ObjList[] obj_list = new ObjList[size];
		for(int i=0;i<size;i++)
		{
			obj_list[i] = new ObjList();
			System.out.println("Enter Number-: ");
			int j= sc.nextInt();
			obj_list[i].number = j;
		}
		System.out.println("Enter number to search-: ");
		int searchInt = sc.nextInt();
		ObjList objSearch = new ObjList();
		objSearch.number = searchInt;
		IntegerSearch intsearchfn = new IntegerSearch();
		
		System.out.println(intsearchfn.search(obj_list, objSearch));
		
		sc.close();
	}
}
