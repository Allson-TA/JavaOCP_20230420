package day17;

import java.util.Scanner;
import java.util.Stack;

public class StackDemo2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("請輸入字串: ");
		String str = scanner.next();
		
		Stack<Character> stack = new Stack<>();
		for(char c : str.toCharArray()) {  // "Java" -> {'J', 'a', 'v', 'a'}
			stack.push(c);
		}
		
		while (!stack.isEmpty()) {
			System.out.print(stack.pop());
		}
		
		System.out.println();

	}

}