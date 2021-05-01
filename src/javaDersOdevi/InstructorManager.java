package javaDersOdevi;

public class InstructorManager extends UserManager {
	public void assign(Instructor instructor) {
		System.out.println(instructor.userName + " " + "adl� kullan�c�ya" + " " + instructor.instructorId + " " + "olarak e�itmen numaras� atand�.");
	}
	public void teach(Instructor instructor) {
		System.out.println(instructor.instructorId + " " + "numaral� e�itmenin verdi�i kurs:" + " " + instructor.taughtCourse);
	}; 
	
	@Override
	public void add(User user) {
		System.out.println(user.userName + " " + "isimli e�itmen sisteme eklendi");
	}
	public void update(User user) {
		System.out.println(user.userName + " " + "isimli e�itmenin bilgileri g�ncellendi.");
	}
	public void delete(User user) {
		System.out.println(user.userName + " " + "isimli e�itmen sistemden silindi.");
	}
}
