package com.spring.standalone.collection;

import java.util.List;

public class student {
	private List<String>friends;

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	@Override
	public String toString() {
		return "student [friends=" + friends + "]";
	}
	
	

}
