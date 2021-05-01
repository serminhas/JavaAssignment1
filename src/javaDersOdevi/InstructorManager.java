package javaDersOdevi;

public class InstructorManager extends UserManager {
	public void assign(Instructor instructor) {
		System.out.println(instructor.userName + " " + "adlý kullanýcýya" + " " + instructor.instructorId + " " + "olarak eðitmen numarasý atandý.");
	}
	public void teach(Instructor instructor) {
		System.out.println(instructor.instructorId + " " + "numaralý eðitmenin verdiði kurs:" + " " + instructor.taughtCourse);
	}; 
	
	@Override
	public void add(User user) {
		System.out.println(user.userName + " " + "isimli eðitmen sisteme eklendi");
	}
	public void update(User user) {
		System.out.println(user.userName + " " + "isimli eðitmenin bilgileri güncellendi.");
	}
	public void delete(User user) {
		System.out.println(user.userName + " " + "isimli eðitmen sistemden silindi.");
	}
}
