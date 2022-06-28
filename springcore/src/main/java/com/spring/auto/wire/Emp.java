package com.spring.auto.wire;

public class Emp 
{

	private Address add;
    //getter /setter
	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}
	@Override
	public String toString() {
		return "Emp [add=" + add + "]";
	}
}
