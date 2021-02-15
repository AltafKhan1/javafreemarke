package net.viralpatel.struts2;

public class User {
	private String firstname;
	private String lastname;
	private boolean isSelected;

	public User() {
	}

	public User(String firstname, String lastname,boolean sel ) {
		this.setFirstname(firstname);
		this.setLastname(lastname);
		this.setisSelected(sel);

	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public boolean getisSelected() {
		return isSelected;
	}

	public void setisSelected(boolean selected) {
		this.isSelected = selected;
	}

	//Add Getter and Setter methods
}