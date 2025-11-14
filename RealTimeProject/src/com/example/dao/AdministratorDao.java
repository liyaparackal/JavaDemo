package com.example.dao;



import java.sql.*;
import java.util.ArrayList;

import com.example.bean.EmployeeBean;





public class AdministratorDao {

	public static Connection con = getCon();

	public static PreparedStatement ps;

	public static ResultSet rs;

	public static Connection getCon() {

 try {

 Class.forName("com.mysql.cj.jdbc.Driver");

 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ustglobal","root","pass@word1");	

 }

 catch(ClassNotFoundException cnf) {

 System.out.println(cnf);

 }

 catch(SQLException sql) {

 System.out.println(sql);

 }

 return con;

	}

	

	public static int addEmployee(EmployeeBean eb) {

 int i=0;

 try {

 ps = con.prepareStatement("insert into emp values(?,?,?)");

 ps.setInt(1, eb.getId());

 ps.setString(2, eb.getName());

 ps.setInt(3, eb.getSalary());

 i=ps.executeUpdate();

 }

 catch (SQLException sql) {

 System.out.println(sql);

 }

 return i;

	}
	
	public static int updateEmployee(EmployeeBean eb) {

		 int i=0;

		 try {

		 ps = con.prepareStatement("update Emp set name=?,sal=? where id=?");

		 ps.setString(1, eb.getName());
		 ps.setInt(2, eb.getSalary());
		 ps.setInt(3, eb.getId());

		 i=ps.executeUpdate();

		 }

		 catch (SQLException sql) {

		 System.out.println(sql);

		 }

		 return i;

			}	
	
	public static int deleteEmployee(int id) {

		 int i=0;

		 try {

		 ps = con.prepareStatement("delete from Emp where id=?");

		 
		 ps.setInt(1,id);
		//only pass id not whole 

		 i=ps.executeUpdate();

		 }

		 catch (SQLException sql) {

		 System.out.println(sql);

		 }

		 return i;

			}	
	public static EmployeeBean selectEmployeeById(int id) {	
		EmployeeBean e=new EmployeeBean();
	try
	{
		 ps = con.prepareStatement("select * from Emp where id=?");	
		 ps.setInt(1, id);
		 rs=ps.executeQuery();
		 //for this we need to pull ip into resultset
		 //then traverse it using next 
		 if(rs.next())
		 {
			 e.setId(rs.getInt("id"));
			 e.setName(rs.getString(2));
			 // we can put name or index of column ex)e.setName(rs.getString("name"))
			 e.setSalary(rs.getInt("sal"));
		 }
		 //e is a temp variable where we store results fetched frm DB just to display
	}
	catch (SQLException sql) {

		 System.out.println(sql);

		 }
	return e;
	}
	public static ArrayList<EmployeeBean> selectAllEmployee()

	{

	ArrayList<EmployeeBean> all=new ArrayList<EmployeeBean>();

	try

		{

	 ps=con.prepareStatement("select * from emp");

	rs=ps.executeQuery();

	while(rs.next())

	{

	EmployeeBean eb=new EmployeeBean();

	eb.setId(rs.getInt(1));

	eb.setName(rs.getString(2));

	eb.setSalary(rs.getInt(3));

	all.add(eb);
	//we fetched multiple records tgt so store in an arraylist 1st

	}

	}

	catch(SQLException sql)

	{

	System.out.println(sql);

	}

	return all;

	}
	
}