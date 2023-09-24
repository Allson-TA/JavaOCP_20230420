package day23;

public class MyExecutorDemo {

	public static void main(String[] args) {
		MyExecutor exec = new MyExecutor();
		Runnable job1 = () -> System.out.println("寫程式");
		Runnable job2 = () -> System.out.println("開會");
		Runnable job3 = () -> System.out.println("洽公");
		
		exec.execute(job1);
		exec.execute(job2);
		exec.execute(job3);

	}

}
