package com.myspace.project;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class RegistrationInformation implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String name;
	private int age;
	private java.lang.String email;
	private java.lang.String phone;

	public RegistrationInformation() {
	}

	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public java.lang.String getEmail() {
		return this.email;
	}

	public void setEmail(java.lang.String email) {
		this.email = email;
	}

	public java.lang.String getPhone() {
		return this.phone;
	}

	public void setPhone(java.lang.String phone) {
		this.phone = phone;
	}

	public RegistrationInformation(java.lang.String name, int age,
			java.lang.String email, java.lang.String phone) {
		this.name = name;
		this.age = age;
		this.email = email;
		this.phone = phone;
	}

}