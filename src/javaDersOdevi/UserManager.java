package javaDersOdevi;

public class UserManager {
	
	//Add metodu
	public void add(User user) {
		System.out.println(user.userName + " " + "isimli kullan�c� sisteme eklendi.");
	}
	
	public void addMultiple(User[] users) {
		for (User user : users) {
			add(user);
		}
	}
	
	//Update metodu
	public void update(User user) {
		System.out.println(user.userName + " " + "isimli kullan�c�n�n bilgileri g�ncellendi.");
	}
	
	public void updateMultiple(User[] users) {
		for (User user : users) {
			update(user);
		}
	};
	
	//Delete metodu
	public void delete(User user) {
		System.out.println(user.userName + " " + "isimli kullan�c� sistemden silindi.");
	}
	public void multipleDelete(User[] users) {
		for (User user : users) {
			delete(user);
		}
	}
}
