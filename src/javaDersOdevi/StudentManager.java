package javaDersOdevi;

public class StudentManager extends UserManager {
	public void learn(Student student){
		System.out.println(student.userName + " " + "isimli ��rencinin ald��� kurslar:" + " " + student.takenCourse);
	}
	
	public void complete(Student student) {
		System.out.println(student.userName + " " + "isimli ��rencinin tamamlad��� �devler:" + " " + student.completedAssignment);
	}
	@Override
	public void add(User user) {
		System.out.println(user.userName + " " + "isimli ��renci sisteme eklendi.");
	}
	public void update(User user) {
		System.out.println(user.userName + " " + "isimli ��rencinin bilgileri g�ncellendi.");
	}
	public void delete(User user) {
		System.out.println(user.userName + " " + "isimli ��reni sistemden silindi.");
	}
}
