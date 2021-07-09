package javaBasicOOPTest;

import com.sun.org.apache.xpath.internal.operations.Equals;

public class ClassRoom {
	private int classNumber;
	private Student[] students = new Student[5];
	private Teacher teacher;
	private int totalStudent;
	
	public ClassRoom(int classNumber, Teacher teacher) {
	}
	
	public int getClassNumber() {
		return classNumber;
	}
	
	public boolean addStudent(Student student) {
		try {
			
			
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("해당 강의실에는 더 이상 학생을 추가할 수 없습니다.");
		}
		return false;
		
	
	}
	
	public void showClassInfo() {
	}
	
	public void showStudentInfo(Human human, int index) {
		try {
			if (condition) {
				
			} else {Map
				
			}
					
						
			
		}catch (NotTeacherException e) {
			System.out.println(e.toString());
			
		}catch (NotConfirmException e) {
			System.out.println(e.toString());
			
			
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("존재하지 않는 학생 index입니다.");
			
		}
	}
}
