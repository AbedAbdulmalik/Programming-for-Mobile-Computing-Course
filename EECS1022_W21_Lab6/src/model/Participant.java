package model;

public class Participant {
	private String name;
	Registration registration;
	Registration[] registrations;
	private Instructor I;
	private String name2;
	private String marks;
	private int registrationNums;
	private int sum;
	private double avg = 0.0;
	private int grade = 0;
	private String gradeDesc;
	Registration r1 = new Registration(name2, I);
	int mark = r1.getMarks();
	int test = r1.getMarks();
	private String Rname;
	Registration[] temp;
	
	public Participant (String name) {
		this.name = name;
		this.registrationNums = 0;
		this.registrations = new Registration[this.registrationNums];
		
	}
	public Registration[] getRegistrations() {
		return registrations;
		}
	
	public String getGPAReport() {
		String result = ""; 
		String report = "";
		if(this.getRegistrations().length == 0) {
			result =  "No GPA available yet for " + name;
		}
		if (this.getRegistrations().length != 0) {
			result += name + "'s GPA of {";
			for(int i = 0;i<getRegistrations().length;i++) {
				if (getRegistrations()[i].getMarks() > 49) {
					grade = getRegistrations()[i].getMarks()/10;
					gradeDesc = getRegistrations()[i].getGradeReport()[0] ;
					sum = sum + grade;
					if(i<getRegistrations().length-1) {
						result += grade + " (" + gradeDesc + "), ";
					}else {
						result += grade + " (" + gradeDesc + ")";
					}
				}
				if (getRegistrations()[i].getMarks() <= 49) {
					grade = 0;
					gradeDesc = "F";
					if(i<getRegistrations().length-1) {
						result += grade + " (" + gradeDesc + "), ";
					}else {
						result += grade + " (" + gradeDesc + ")";
					}
					
				}
				
			
				
				
			}
			
			avg = (double)sum / (double)getRegistrations().length;
			if (avg > 9) {
				avg = 9.0;
			}
			String avgs = String.format("%.1f", avg);
			result += "}: " + avgs;
			
		
		
		}
		return result;
		}
	public int marksOf(String string) {
		int result = -1;
		int i = 0;
		boolean flag = false;
		while (i < getRegistrations().length && flag == false) {
			if (getRegistrations()[i].getTitle().equals(string)) {
				flag = true;
				if (string != null) {
					result = getRegistrations()[i].getMarks();
					
				}else {
					result = 0;
				}
			}else {
				result = -1;
			}
			 i++;}
		return result;
	}
	public void addRegistration(Registration value) {
		r1 = value;
		
		temp = new Registration [getRegistrations().length + 1];
		if (getRegistrations().length < 5) {
			for (int i = 0; i < getRegistrations().length; i++){
			      temp[i] = getRegistrations()[i];
			   }
			temp[temp.length-1] = value;
			   registrations = temp;
		}

		   
		   
	}
	public void addRegistration(String name) {
		
		temp = new Registration [getRegistrations().length + 1];

		   for (int i = 0; i < getRegistrations().length; i++){
		      temp[i] = getRegistrations()[i];
		   }
		   temp[temp.length-1] = new Registration(name);
		   registrations = temp;
	}
	public void updateMarks(String name, int number) {
		int result = -1;
		int i = 0;
		boolean flag = false;
		while (i < getRegistrations().length && flag == false) {
			if (getRegistrations()[i].getTitle().equals(name)) {
				
				flag = true;
				if (this.name != null) {
					getRegistrations()[i].setMarks(number);
					
				}
			}
			 i++;}
	}
	public void clearRegistrations() {
		registrations = new Registration[0];
	}
	public Registration getRegistration() {
		return this.registration;
		}
	

}
