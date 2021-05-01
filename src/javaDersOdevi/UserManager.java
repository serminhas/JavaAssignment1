package javaDersOdevi;

public class UserManager {
	
	//Add metodu
	public void add(User user) {
		System.out.println(user.userName + " " + "isimli kullanýcý sisteme eklendi.");
	}
	
	public void addMultiple(User[] users) {
		for (User user : users) {
			add(user);
		}
	}
	
	//Update metodu
	public void update(User user) {
		System.out.println(user.userName + " " + "isimli kullanýcýnýn bilgileri güncellendi.");
	}
	
	public void updateMultiple(User[] users) {
		for (User user : users) {
			update(user);
		}
	};
	
	//Delete metodu
	public void delete(User user) {
		System.out.println(user.userName + " " + "isimli kullanýcý sistemden silindi.");
	}
	public void multipleDelete(User[] users) {
		for (User user : users) {
			delete(user);
		}
	}
}
