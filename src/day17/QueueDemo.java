package day17;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(100);
		queue.offer(90);
		queue.offer(80);
		queue.offer(70);
		queue.offer(60);
		System.out.println(queue);
		while(!queue.isEmpty()) {
			Integer data = queue.poll();	//	將元素自Queue中取出
			System.out.println("取出: " + data);
			
		}
		System.out.println(queue);
		
	}
}
