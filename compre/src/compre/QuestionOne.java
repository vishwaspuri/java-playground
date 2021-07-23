package compre;

import java.util.Scanner;
import java.util.*;

class Student{
	public int studentID;
	public int marks;
	Student(int id, int marks){
		this.studentID = id;
		this.marks = marks;
	}
}

public class QuestionOne {
	public static Student studentDetails(Scanner sc) {
		System.out.print("\nEnter Student ID: ");
		int id = sc.nextInt();
		System.out.print("\nEnter marks: ");
		int marks = sc.nextInt();
		return new Student(id, marks);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		Student []v = new Student[5];
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<5; i++) {
			Student temp = studentDetails(sc);
			v[i] = temp;
		}
		for(int i=0; i<5; i++) {
			hm.put(v[i].studentID, v[i].marks);
		}
		
		int maxStudentID = v[0].studentID;
		int maxMarks = v[0].marks;
		
		for(Map.Entry<Integer, Integer> e:hm.entrySet()) {
			if(e.getValue() > maxMarks) {
				maxStudentID = e.getKey();
				maxMarks = e.getValue();
			}
		}
		System.out.println("Topper: \nStudent Id: "+maxStudentID+"\nMarks: "+maxMarks);
	}
}
