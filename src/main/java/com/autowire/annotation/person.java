package com.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class person {
	@Autowired
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public person(Address address) {
		super();
		this.address = address;
	}

	@Override
	public String toString() {
		return "person [address=" + address + "]";
	}
	
	

}
