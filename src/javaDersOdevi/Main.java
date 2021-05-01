package javaDersOdevi;

public class Main {

	public static void main(String[] args) {
		Instructor instructor1 = new Instructor();
		instructor1.userName = "Engin Demiroğ" ;
		instructor1.instructorId=1;
		instructor1.taughtCourse="Java";
		
		Student student1 = new Student();
		student1.userName = "Sermin Has";
		student1.takenCourse="Java, C#";
		student1.completedAssignment="Java dersi ödevleri";
		
		UserManager userManager = new UserManager();
		//userManager.add(student1);
		//userManager.add(instructor1);
		//User[] users= {instructor1, student1};
		//userManager.addMultiple(users);
		
		InstructorManager instructorManager=new InstructorManager();
		instructorManager.add(instructor1);
		instructorManager.assign(instructor1);
		instructorManager.teach(instructor1);
		instructorManager.update(instructor1);
		instructorManager.delete(instructor1);
		
		StudentManager studentManager=new StudentManager();
		studentManager.add(student1);
		studentManager.learn(student1);
		studentManager.complete(student1);
		studentManager.update(student1);
		studentManager.delete(student1);
	}
}
