package day17;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(100);
		stack.push(90);
		stack.push(80);
		
		System.out.println(stack);
		
		while(!stack.isEmpty()) {
			Integer data = stack.pop();
			System.out.println("得到: "+data);
		}
		System.out.println(stack);
		
	}

}
