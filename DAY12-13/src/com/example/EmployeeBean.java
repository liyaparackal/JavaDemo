package com.example;

import java.io.Serializable;

public class EmployeeBean implements Serializable{
	private transient int eid;
	//to prevent serialsn make as TRANSIENT or STATIC(ONLY IF METHOD IS STATIC)
	private String ename;
	private int esal;
	public int getEid() {
		return eid;
	}
	
	public String getEname() {
		return ename;
	}
	
	public int getEsal() {
		return esal;
	}
	
	public EmployeeBean(int eid, String ename, int esal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
	}
	

}
