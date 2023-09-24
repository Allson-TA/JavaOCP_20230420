package day20;

import java.util.Base64;

public class Base64Demo {

	public static void main(String[] args) {
		String clearText = "1234";	//	明文
		System.out.println("明文"+clearText);
		//	編碼
		String encodeText = Base64.getEncoder().encodeToString(clearText.getBytes());
		System.out.println("編碼:" + encodeText);
		//	解碼
		byte[] decodeBytes = Base64.getDecoder().decode(encodeText);
		String decodeText = new String(decodeBytes);
		System.out.println("解碼:" + decodeText);
		
	}

}
