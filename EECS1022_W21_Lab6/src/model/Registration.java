package model;

public class Registration {
	private String Cname = "";
	
	private String Cname2 = "";
	private String[] report = {"","",""};
	private String letter = "F";
	private String description = "Failing";
	private String email;
	private int id;
	private String name;
	private int marks;
	Instructor i = new Instructor(name, id, email);
	String Iname2 = i.getName();
	
	
	
	Instructor instructor;
	
	public Registration (String name, int mark, Instructor I) {
		this.Cname = name;
		this.marks = mark;
		this.instructor = I;
		
		
	}
	public Registration (String name, int mark) {
		this.name = Cname;
		this.marks = mark;
		
	}
	public Registration (String name) {
		Cname = name;
		letter = "";
		description = "";
		
		
	}
	public Registration (String name2, Instructor I) {
		this.Cname = name2;
		this.instructor = I;
	}
	public String getTitle() {
		String result = Cname; /* 0 is the default value of the return type int */
		return result;
		}
	public int getMarks() {
		
		return this.marks;
		
		}
	
	public String[] getGradeReport() {
		
		String[] g = new String[2];
		
		if (marks >= 0 && marks <= 49) {
			g[0] = "F";
			g[1] = "Failing";
		}
		else if (marks >= 50 && marks <= 59) {
			g[0] = "D";
			g[1] = "Passing";
		}
		else if (marks >= 60 && marks <= 69) {
			g[0] = "C";
			g[1] = "Competent";
		}
		else if (marks >= 70 && marks <= 79) {
			g[0] = "B";
			g[1] = "Good";
		}
		else if (marks >= 80 && marks <= 89) {
			g[0] = "A";
			g[1] = "Excellent";
		}
		else if (marks >= 90 && marks <= 100) {
			g[0] = "A+";
			g[1] = "Exceptional";
			}
		
		return g;
		}
	public String getInformation() {
		String info = "";
		if(this.getInstructor() == null) {
		info = Cname + " has not yet been assigned an instructor"; 
		}
		else if (this.getInstructor() != null) {
			info = Cname + ", taught by " + this.getInstructor().getName() + ", is completed with raw marks " + getMarks() + " (" + getGradeReport()[0] + " ; " + getGradeReport()[1] + ")"; 
			}
		return info;
		}
	public Instructor getInstructor() {
		return this.instructor;
		}
	public void setInstructor(Instructor I ) {
			this.instructor = I;
		}
	public void setMarks(int marks2) {
			this.marks = marks2;
			}
		
	}



