package com.contructionsInjection;

public class person {
	private String PersonName;
	private String PersonId;
	private Certi certi;
	public person(String personName, String personId, Certi certi) {
		super();
		PersonName = personName;
		PersonId = personId;
		this.certi = certi;
	}
	@Override
	public String toString() {
		return "person [PersonName=" + PersonName + ", PersonId=" + PersonId + ", certi=" + certi + "]";
	}
	

}
