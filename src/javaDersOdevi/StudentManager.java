package javaDersOdevi;

public class StudentManager extends UserManager {
	public void learn(Student student){
		System.out.println(student.userName + " " + "isimli öðrencinin aldýðý kurslar:" + " " + student.takenCourse);
	}
	
	public void complete(Student student) {
		System.out.println(student.userName + " " + "isimli öðrencinin tamamladýðý ödevler:" + " " + student.completedAssignment);
	}
	@Override
	public void add(User user) {
		System.out.println(user.userName + " " + "isimli öðrenci sisteme eklendi.");
	}
	public void update(User user) {
		System.out.println(user.userName + " " + "isimli öðrencinin bilgileri güncellendi.");
	}
	public void delete(User user) {
		System.out.println(user.userName + " " + "isimli öðreni sistemden silindi.");
	}
}
