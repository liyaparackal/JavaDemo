package com.example;

import java.util.ArrayList;

public class GDemo {
ArrayList<Emp> al;	
public ArrayList<Emp> addEmp()
{al=new ArrayList<Emp>();
al.add(new Emp(101,"li"));
al.add(new Emp(102,"hi"));
return al;
}
	
//EACH EMP VIEW
public Emp viewbyid(int empid)
{
	Emp eb=new Emp();
	for(Emp e:al)
	{
		if(e.getEmpid()==empid)
		{
			eb=e;
		}
		//if present pass local variable e to global eb
	}
	return eb;
}
	

	public static void main(String[] args) {
		GDemo gd=new GDemo();
		ArrayList<Emp> allemp=gd.addEmp();
		//this step is very important even if we are calling just one value everything shud be initialised
//		allemp.forEach(e->{System.out.println(e.getEmpid()+" "+e.getEmpname());});
		
		Emp emp=gd.viewbyid(102);
		System.out.println(emp.getEmpid()+" "+emp.getEmpname());
//		Emp e1=new Emp();
//		e1.setEmpid(101);
//		e1.setEmpname("li");
//		Emp e2=new Emp();
//		e2.setEmpid(102);
//		e2.setEmpname("ri");
//		ArrayList<Emp> al=new ArrayList<Emp>();
//		al.add(e1);
//		al.add(e2);
//		for(Emp e:al)
//		{
//			System.out.println(e.getEmpid()+" "+e.getEmpname());
//		}
		

	}

}
