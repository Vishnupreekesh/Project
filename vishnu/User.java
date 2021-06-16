package com.vishnu;

import java.util.*;

import database.UserData;


public class User  {
	public static void main(String[] args) throws Exception  {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the userid");
		int num=sc.nextInt();
		
		UserData obj=new UserData();
		System.out.print("Name : "+obj.getName(num)+"\nEmail: "+obj.getEmail(num)+"\nPassword : "+obj.getPassword(num));
				
			
	}
				
}
