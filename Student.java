//import java.io.*;
package Student;
public class Student {
	
	String studentNumber;
	String studentName;
	int markForMaths;
	int markForEnglish;
	int markForScience;
	
	public Student(String number, String name){
		studentNumber = number;
		studentName = name;
	};
	
	public Student(){
		studentNumber = "999";
		studentName = "";
	};
	
	public String getNumber(){
		return studentNumber;
	};
	
	public String getName(){
		return studentName;
	};
	
	public void enterMarks(int markForMaths, int markForEnglish, int markForScience){
		this.markForMaths   = markForMaths;
		this.markForEnglish = markForEnglish;
		this.markForScience = markForScience;
	};
	
	public int getMathMark(){
		return markForMaths;
	};

	public int getEnglishMark(){
		return markForEnglish;
	};

	public int getScienceMark(){
		return markForScience;
	};
	
	public double calculateAverage(){
		double average = ( markForMaths + markForEnglish + markForScience ) / 3.0;
		return average;
	};
	
	public String toString(){
		String ToS;
		double average = calculateAverage();
		
		ToS = "StudentNumber:\t" + studentNumber + "\n"  + "StudentName:\t" + studentName + "\n" 
				+ "MarkForMaths:\t" + markForMaths + "\n" + "MarkForEnglish:\t" + markForEnglish + "\n"
				+ "MarkForScience:\t" + markForScience + "\n" + "Average:\t" + average + "\n";
		
		return ToS;
};
}
