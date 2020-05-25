package com.myspace.project;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class OrderDeliveryDecision implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("Author of request")
	private java.lang.String requestAuthor;
	@org.kie.api.definition.type.Label("Priority")
	private int priority;
	@org.kie.api.definition.type.Label("Contact email")
	private java.lang.String email;

	@org.kie.api.definition.type.Label("Note about delivery")
	private java.lang.String note;

	@org.kie.api.definition.type.Label("Reviewer")
	private java.lang.String reviewer;

	@org.kie.api.definition.type.Label("Is order deliverable")
	private boolean deliverable;

	@org.kie.api.definition.type.Label(value = "Delivery Id")
	private java.lang.String deliveryId;

	public OrderDeliveryDecision() {
	}

	public java.lang.String getRequestAuthor() {
		return this.requestAuthor;
	}

	public void setRequestAuthor(java.lang.String requestAuthor) {
		this.requestAuthor = requestAuthor;
	}

	public int getPriority() {
		return this.priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public java.lang.String getEmail() {
		return this.email;
	}

	public void setEmail(java.lang.String email) {
		this.email = email;
	}

	public java.lang.String getNote() {
		return this.note;
	}

	public void setNote(java.lang.String note) {
		this.note = note;
	}

	public java.lang.String getReviewer() {
		return this.reviewer;
	}

	public void setReviewer(java.lang.String reviewer) {
		this.reviewer = reviewer;
	}

	public boolean isDeliverable() {
		return this.deliverable;
	}

	public void setDeliverable(boolean deliverable) {
		this.deliverable = deliverable;
	}

	public java.lang.String getDeliveryId() {
		return this.deliveryId;
	}

	public void setDeliveryId(java.lang.String deliveryId) {
		this.deliveryId = deliveryId;
	}

	public OrderDeliveryDecision(java.lang.String requestAuthor, int priority,
			java.lang.String email, java.lang.String note,
			java.lang.String reviewer, boolean deliverable,
			java.lang.String deliveryId) {
		this.requestAuthor = requestAuthor;
		this.priority = priority;
		this.email = email;
		this.note = note;
		this.reviewer = reviewer;
		this.deliverable = deliverable;
		this.deliveryId = deliveryId;
	}

}