package ie.atu.studentmanagerpackage;

/**
 * The Main class holds the main method.
 */
public class Main {
	
	// Main method containing print statement.
	public static void main(String[] args) {
		
		StudentManager stuManObj = new StudentManager();
		
		Student studentObject1 = new Student("G11111111");
		
		boolean addStatus = false;

		addStatus = stuManObj.addStudent(studentObject1);
		System.out.println(addStatus);
		addStatus = stuManObj.addStudent("G22222222");
		System.out.println(addStatus);
	
		System.out.println(stuManObj.findTotalStudents());

		System.out.println(stuManObj.getStudents().get(0).getStudentId());
		System.out.println(stuManObj.getStudents().get(1).getStudentId());
		
		boolean removeStatus = false;
		removeStatus = stuManObj.removeStudent(studentObject1);
		
		System.out.println(removeStatus);
		System.out.println(stuManObj.findTotalStudents());
		
		removeStatus = stuManObj.removeStudent("G22222222");
		
		System.out.println(removeStatus);
		System.out.println(stuManObj.findTotalStudents());

		stuManObj.findTotalStudents();
		
		System.out.println("The End");
		
	} // End main method
} // End Main class
