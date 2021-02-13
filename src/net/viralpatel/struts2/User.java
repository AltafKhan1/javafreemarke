package net.viralpatel.struts2;

public class User {
	private String firstname;
	private String lastname;
	private boolean selected;

	public User() {
	}

	public User(String firstname, String lastname,boolean sel ) {
		this.setFirstname(firstname);
		this.setLastname(lastname);
		this.setSelected(sel);

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

	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}

	//Add Getter and Setter methods
}