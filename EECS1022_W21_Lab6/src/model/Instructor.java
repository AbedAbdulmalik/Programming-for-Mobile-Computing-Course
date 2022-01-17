package model;

public class Instructor {
	String Iname;
	private String Iemail;
	private int ext = 0;
	
	public Instructor (String name, int id, String email ) {
		Iname = name;
		ext = id;
		Iemail = email;
	}
	
	public String getName() {
		String result = Iname; /* 0 is the default value of the return type int */
		return result;
		}
	public int getPhoneExtension() {
		int result = ext; /* 0 is the default value of the return type int */
		return result;
		}
	public String getEmail() {
		String result = Iemail; /* 0 is the default value of the return type int */
		return result;
		}
	public String getInformation() {
		String result = "Instructor " + Iname + " has campus phone extension " + ext + " and contact email " + Iemail; 
		return result;
		}
	public void setName(String name) {
		this.Iname = name;
	}
	public void setPhoneExtension(int id) {
		ext = id;
	}
	public void setEmail(String email) {
		Iemail = email;
	}
	
	
}


