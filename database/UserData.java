package database;

import java.sql.*;

public class UserData {
	
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
			
	}

	public String getName(int id) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/userdatabase","root","Vishnu21@");  
		Statement stmt=con.createStatement(); 
		ResultSet rs=stmt.executeQuery("select * from usertable where userid='"+id+"' "); 
		String str="";
		rs.next() ;
		str=rs.getString(2)+" "+rs.getString(3);
		
		return str;
	}

	public String getPassword(int id) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/userdatabase","root","Vishnu21@");  
		Statement stmt=con.createStatement(); 
		ResultSet rs=stmt.executeQuery("select * from pwdtable where userid='"+id+"' "); 
		String str="";
		rs.next() ;
		str=rs.getString(2);
		
		return str;
		
	}

	public String getEmail(int id) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/userdatabase","root","Vishnu21@");  
		Statement stmt=con.createStatement(); 
		ResultSet rs=stmt.executeQuery("select * from emailtable where userid='"+id+"' "); 
		String str="";
		int i=0;
		while(rs.next()) {
			if(i==0) {
				str=rs.getString(2);
				i=1;
			}
			else {
				str+=" , "+rs.getString(2);
			}
		}
		return str;
		
	}

}
