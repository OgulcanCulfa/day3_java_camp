package day3_odev;

public class StudentManager extends UserManager {

	
	public void add(Student student) {
		System.out.println(student.firstName +" sisteme eklendi.");
		
	}
	
	public void startHomework(Student student) {
		System.out.println(student.firstName + " ödeve başladı.");
	}
}
	