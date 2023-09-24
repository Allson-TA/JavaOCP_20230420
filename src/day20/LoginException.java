package day20;

// 自行定義一個登入例外
public class LoginException extends Exception {
	public LoginException(String errorMessage) {
		super(errorMessage);
	}
	
	public void howToDo() {
		System.out.println("請重新登入");
	}
}