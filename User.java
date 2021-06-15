package com.vishnu;

import java.io.FileWriter;
import java.sql.*;
import java.util.*;


public class User  {
	public static void main(String[] args) throws Exception  {
			String str,str1,str2;
			FileWriter fw=new FileWriter("Details.txt");    
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/userdatabase","root","Vishnu21@");   
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select * from usertable"); 
			
			fw.write("USERTABLE\n");
			while(rs.next()) {
				str=String.valueOf(rs.getInt(1))+" "+rs.getString(2)+" "+rs.getString(3)+" "+String.valueOf(rs.getInt(4))
				+" "+String.valueOf(rs.getTimestamp(5))+" "+String.valueOf(rs.getTimestamp(6));  
				fw.write(str+"\n");
			}
			ResultSet rs1=stmt.executeQuery("select * from emailtable");
			fw.write("\nEMAILTABLE\n");
			while(rs1.next()) {
				str1=String.valueOf(rs1.getInt(1))+" "+rs1.getString(2)+" "+String.valueOf(rs1.getInt(3))+" "+String.valueOf(rs1.getInt(4))
				+" "+String.valueOf(rs1.getTimestamp(5))+" "+String.valueOf(rs1.getTimestamp(6));
				fw.write(str1+"\n");
			}
			
			ResultSet rs2=stmt.executeQuery("select * from pwdtable");
			fw.write("\nPWDTABLE\n");
			while(rs2.next()) {
				str2=String.valueOf(rs2.getInt(1))+" "+rs2.getString(2)+" "+String.valueOf(rs2.getTimestamp(3));
				fw.write(str2+"\n");
			}
			fw.close();
			stmt.close();
			con.close();  
			
			
	}
			
}
