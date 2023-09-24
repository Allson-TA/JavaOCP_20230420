package day20;

import java.util.Base64;
import java.util.LinkedHashMap;
import java.util.Map;

public class User {
	
	// 所有 user 的登入帳號
	public static Map<String, String> users = new LinkedHashMap<>();
	
	static {
		users.put("John", Base64.getEncoder().encodeToString("1234".getBytes())); // 將 1234 進行 Base64 編碼
		users.put("Mary", Base64.getEncoder().encodeToString("5678".getBytes())); // 將 5678 進行 Base64 編碼
		users.put("Rose", Base64.getEncoder().encodeToString("abcd".getBytes())); // 將 abcd 進行 Base64 編碼
	}
	
	// 登入
	public static boolean loginCheck(String inputUsername, String inputPassword) throws LoginException {
		// 1. 先確認是否有此帳號 ? 若有帳號就可以得到 password
		String encodePassword = users.get(inputUsername);
		if(encodePassword == null) { // 無此帳號
			LoginException loginException = new LoginException("無此帳號");
			throw loginException; // 取代 return false;
		}
		// 2. 比對 password, 因為傳進來的 password 是明文所以必須轉 base64 進行比對
		String inputPasswordEncode = Base64.getEncoder().encodeToString(inputPassword.getBytes());
		if(encodePassword.equals(inputPasswordEncode)) {
			return true;
		} else {
			LoginException loginException = new LoginException("密碼錯誤");
			throw loginException; // 取代 return false;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(User.users);
		try {
			System.out.println(User.loginCheck("John", "1234"));
		} catch (LoginException e) {
			System.out.println(e.getMessage());
			e.howToDo();
		}
	}
	
}