package ie.gmit.studentmanagerpackage;

/**
 * The Main class holds the main method.
 */
public class Main {
	
	// Main method containing print statement.
	public static void main(String[] args) {
		
		StudentManager stuManObj = new StudentManager();
		
		Student studentObject1 = new Student("G00123456");
		
		boolean addStatus = stuManObj.addStudent(studentObject1);
		
		System.out.println(addStatus);

		stuManObj.findTotalStudents();
		
		boolean removeStatus = stuManObj.removeStudent(studentObject1);
		
		System.out.println(removeStatus);

		stuManObj.findTotalStudents();
		
		System.out.println("The End");
		
	} // End main method
	
} // End Main Class
