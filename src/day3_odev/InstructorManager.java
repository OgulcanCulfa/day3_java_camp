package day3_odev;

public class InstructorManager extends UserManager {
	
	public void add(Instructor instructor) {
		System.out.println(instructor.firstName + " sisteme eklendi," + " tip: " + instructor.instructorType);
	}
	public void addHomework(Instructor instructor) {
		System.out.println("Ödev sisteme eklendi." + " Ödevi ekleyen: " + instructor.firstName);
	}
}
