package com.example.ui;

import java.sql.*;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import com.example.bean.EmployeeBean;

import com.example.dao.AdministratorDao;

/*

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

 Class.forName("com.mysql.cj.jdbc.Driver");

 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ustglobal","root","pass@word1");

 System.out.println("Connected succesfully");

 //now java is connected to database



 PreparedStatement ps=con.prepareStatement("insert into employee values(?,?,?)");

 ps.setInt(1, 101);

 ps.setString(2, "Karthik");

 ps.setInt(3, 45000);

 

 int i=ps.executeUpdate();

 System.out.println(i+" record inserted successfully");

	}

}

*/

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		int id=Integer.parseInt(JOptionPane.showInputDialog("Enter Employee ID :"));
		 EmployeeBean e1 =AdministratorDao.selectEmployeeById(id);
		// JOptionPane.showMessageDialog(null,e1.getId()+" "+e1.getName()+"
		// "+e1.getSalary());

// String name =JOptionPane.showInputDialog("Enter Employee Name :");
//
		// int sal=Integer.parseInt(JOptionPane.showInputDialog("Enter Salary :"));
//
		EmployeeBean eb = new EmployeeBean();
//
		// eb.setId(id);
//
// eb.setName(name);
//
// eb.setSalary(sal);
// JOptionPane.showMessageDialog(null, AdministratorDao.addEmployee(eb)+" record inserted successfully...");
		ArrayList<EmployeeBean> all = AdministratorDao.selectAllEmployee();
		String str = "";

		for (EmployeeBean e : all)

		{

			str += e.getId() + " " + e.getName() + " " + e.getSalary() + "\n";

		}

		JOptionPane.showMessageDialog(null, str);
// JOptionPane.showMessageDialog(null, AdministratorDao.updateEmployee(eb)+" record updated successfully...");
		// JOptionPane.showMessageDialog(null, AdministratorDao.deleteEmployee(id)+"
		// record dltd successfully...");
		//JOptionPane.showMessageDialog(null, str);

	}
}