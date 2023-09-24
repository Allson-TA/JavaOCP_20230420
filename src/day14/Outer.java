package day14;

//一般類別(外部類別)
public class Outer {
	int x = 7; // Outer 的物件變數
	static int sx = 9; // Outer 的類別變數 
	// 一般內部類別
	public class Inner {
		int x = 77; // Inner 的物件變數
		//static int sx = 99; // Inner 不可以有類別成員
		public void hello() {
			int x = 777; // 區域變數
			System.out.println("Hello Inner Class");
			System.out.println("區域變數 x = " + x);
			System.out.println("Inner 的物件變數 x = " + this.x);
			System.out.println("Outer 的物件變數 x = " + Outer.this.x); // 內部類別才有的特殊寫法
			System.out.println("Outer 的類別變數 sx = " + Outer.sx);
		}
	}
		
	// 一般方法
	public void foo() {
		// 若方法的區域變數要給方法內部類別使用, 則該變數具備 final 的特性
		int money = 100;
		// 方法內部類別
		class Bar {
			void hello() {
				System.out.println("Hello Bar " + money);
			}
		}
		// 建立方法內部類別物件
		Bar bar = new Bar();
		bar.hello();
	}
	
	public static void main(String[] args) {
		Outer ou = new Outer();
		Outer.Inner in = ou.new Inner();
		in.hello();
		ou.foo();
	}
	
}