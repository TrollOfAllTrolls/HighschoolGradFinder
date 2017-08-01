
public class Student {
	String fName;
	String lName;
	int monthStarted;
	int yearStarted;
	int grade;
	public Student(String LName, String FName, int mStart, int yStart, int Grade){
		fName = FName;
		lName = LName;
		monthStarted = mStart;
		yearStarted = yStart;
		grade = Grade;
	}
	public String getFName(){
		return fName;
	}
	public String getLName(){
		return lName;
	}
	public int getMStart() {
		return monthStarted;
	}
	public int getYStart() {
		return yearStarted;
	}
	public int getGrade() {
		return grade;
	}
}
