package com.springcore;

public class Student {
	
	int stdentId;
	String stdName;
	String stdAddress;
	
	//getter &setters
	public int getStdentId()
	{
		return stdentId;
	}
	public void setStdentId(int stdentId)
   {
		 System.out.println("setting student Id");//spring container set value
		this.stdentId = stdentId;
	}
	public String getStdName()
	{
		return stdName;
	}
	public void setStdName(String stdName)
	{	
		 System.out.println("setting student name");
		this.stdName = stdName;
	}
	public String getStdAddress() 
	{
		return stdAddress;
	}
	public void setStdAddress(String stdAddress) 
	{
		 System.out.println("setting student Address");
		this.stdAddress = stdAddress;
	}
	public Student(int stdentId, String stdName, String stdAddress) 
	{
		super();
		this.stdentId = stdentId;
		this.stdName = stdName;
		this.stdAddress = stdAddress;
	}
	public Student() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Student [stdentId=" + stdentId + ", stdName=" + stdName + ", stdAddress=" + stdAddress + "]";
	}
	
	

}
