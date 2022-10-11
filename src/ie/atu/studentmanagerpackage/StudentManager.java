package ie.atu.studentmanagerpackage;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    
	// Declare a List called students to hold the student objects
	private List<Student> stuObjArrList;

	// Constructor
	public StudentManager() {
		// Instantiate a student ArrayList
		stuObjArrList = new ArrayList<Student>();
	}

	// Getters and Setters
	public List<Student> getStudents() {
		return stuObjArrList;
	}

	public void setStudents(List<Student> studentList) {
		this.stuObjArrList = studentList;
	}

	// Add Student by Student Object                  
	public boolean addStudent(Student studentObject) {
			return stuObjArrList.add(studentObject);
	}

	// Add Student by Student ID 
	public boolean addStudent(String studentId) {
		Student studentObject = new Student(studentId);
		return stuObjArrList.add(studentObject);
	}	
	
	// Remove Student by Object                  
	public boolean removeStudent(Student studentObject) {
		return stuObjArrList.remove(studentObject);
	}

	// Remove Student by Object                  
	public boolean removeStudent(String studentId) {
		for (Student studentObject : stuObjArrList ){
			if(studentObject.getStudentId().equals(studentId)) {
				return stuObjArrList.remove(studentObject);
			}
		}
		return false;
	}

	public int findTotalStudents() {
		// Returns the current number of Students in the ArrayList
		return stuObjArrList.size();
	}
	
}
