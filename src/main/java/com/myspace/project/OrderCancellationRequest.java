package com.myspace.project;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.xml.bind.annotation.XmlRootElement
public class OrderCancellationRequest implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String email;

	private java.lang.String id;

	public OrderCancellationRequest() {
	}

	public java.lang.String getEmail() {
		return this.email;
	}

	public void setEmail(java.lang.String email) {
		this.email = email;
	}

	public java.lang.String getId() {
		return this.id;
	}

	public void setId(java.lang.String id) {
		this.id = id;
	}

	public OrderCancellationRequest(java.lang.String email, java.lang.String id) {
		this.email = email;
		this.id = id;
	}

}