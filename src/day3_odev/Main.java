package day3_odev;

public class Main {

	public static void main(String[] args) {
		
		Instructor engin = new Instructor();
		engin.firstName = "Engin";
		engin.instructorType = "Root";
		engin.instructorId = 1;
		
		Student ogulcan = new Student();
		ogulcan.firstName = "Ogulcan";
		ogulcan.location = "Ýstanbul";
		ogulcan.studentId = 2;
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(ogulcan);
		studentManager.startHomework(ogulcan);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(engin);
		instructorManager.addHomework(engin);
		
	}

}
