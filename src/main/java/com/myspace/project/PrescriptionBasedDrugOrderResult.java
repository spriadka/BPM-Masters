package com.myspace.project;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class PrescriptionBasedDrugOrderResult implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("Name")
	private java.lang.String name;
	@org.kie.api.definition.type.Label("Contact email")
	private java.lang.String email;
	@org.kie.api.definition.type.Label("Drug")
	private java.lang.String drug;
	@org.kie.api.definition.type.Label("Amount")
	private int amount;
	@org.kie.api.definition.type.Label("Valid order")
	private boolean valid;
	@org.kie.api.definition.type.Label("Available")
	private boolean available;

	@org.kie.api.definition.type.Label(value = "Personal Identification Number")
	private java.lang.String personalIdentificationNumber;

	public PrescriptionBasedDrugOrderResult() {
	}

	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public java.lang.String getEmail() {
		return this.email;
	}

	public void setEmail(java.lang.String email) {
		this.email = email;
	}

	public java.lang.String getDrug() {
		return this.drug;
	}

	public void setDrug(java.lang.String drug) {
		this.drug = drug;
	}

	public int getAmount() {
		return this.amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public boolean isValid() {
		return this.valid;
	}

	public void setValid(boolean valid) {
		this.valid = valid;
	}

	public boolean isAvailable() {
		return this.available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public java.lang.String getPersonalIdentificationNumber() {
		return this.personalIdentificationNumber;
	}

	public void setPersonalIdentificationNumber(
			java.lang.String personalIdentificationNumber) {
		this.personalIdentificationNumber = personalIdentificationNumber;
	}

	public PrescriptionBasedDrugOrderResult(java.lang.String name,
			java.lang.String email, java.lang.String drug, int amount,
			boolean valid, boolean available,
			java.lang.String personalIdentificationNumber) {
		this.name = name;
		this.email = email;
		this.drug = drug;
		this.amount = amount;
		this.valid = valid;
		this.available = available;
		this.personalIdentificationNumber = personalIdentificationNumber;
	}

}