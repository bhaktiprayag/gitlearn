package com.bk.java;

public class Broker {
	private String id;;
	private String name;
	
	private Address addr1;
	private Address addr2;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddr1() {
		return addr1;
	}

	public void setAddr1(Address addr1) {
		this.addr1 = addr1;
	}

	public Address getAddr2() {
		return addr2;
	}

	public void setAddr2(Address addr2) {
		this.addr2 = addr2;
	}

	
	public void display()
	{
		System.out.println(getId());
		System.out.println(getName());
		System.out.println(getAddr1().getOfficeAdr()+","+getAddr1().getPincode());
		System.out.println(getAddr2().getOfficeAdr()+","+getAddr2().getPincode());
		
	}

}
