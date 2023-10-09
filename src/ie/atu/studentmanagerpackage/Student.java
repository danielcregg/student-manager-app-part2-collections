package ie.atu.studentmanagerpackage;

public class Student {
	
	// Instance Variables
	private String studentId;
	
	// Constructor
	public Student(String studentId) {
		this.studentId = studentId;
	}
	
	// Getters
	public String getStudentId() {
		return studentId;
	}

	// Setters
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	// Search for a student by studentId
	public static Student searchStudent(Student[] students, String studentId) {
		for (Student student : students) {
			if (student.getStudentId().equals(studentId)) {
				return student;
			}
		}
		return null;
	}

	// Sort students by studentId
	public static void sortStudents(Student[] students) {
		for (int i = 0; i < students.length; i++) {
			for (int j = 0; j < students.length - 1; j++) {
				if (students[j].getStudentId().compareTo(students[j + 1].getStudentId()) > 0) {
					Student temp = students[j];
					students[j] = students[j + 1];
					students[j + 1] = temp;
				}
			}
		}
	}

}
