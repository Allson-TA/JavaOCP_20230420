package day15;

public class Outer {
	
	int x =7;
	static int s = 9;

	//	一般內部類別
	class Inner{
		int x =77;
		void hello() {
			System.out.println("Hello Inner");
			System.out.println(Outer.this.x);
			System.out.println(Outer.s);
			System.out.println(Outer.SInner.s);
		}
	}
	
	
	//	靜態內部類別
	static class SInner{
		static int s =99;
		static void hello() {
			System.out.println("Hello Inner");
			System.out.println(SInner.s);
			System.out.println(Outer.s);
			
		}
		
	}

	public static void main(String[] args) {
		Outer.Inner in = new Outer().new Inner();
		in.hello();
		
		Outer.SInner sin = new Outer.SInner();
		sin.hello();
	}
	
}
