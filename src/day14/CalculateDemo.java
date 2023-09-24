package day14;

public class CalculateDemo {

	public static void main(String[] args) {
		Calculate calcAdd = new CalculateAdd();
		System.out.println(calcAdd.operation(10, 20));
		
		Calculate calcSub = new CalculateSub();
		System.out.println(calcSub.operation(10, 20));
		
		Calculate calcMulti = new Calculate() {
			
			public double operation(double x,double y) {
				return x*y;
			}
		};
		System.out.println(calcMulti.operation(10, 20));
		
		//	Calculate calcDiv = (double x,double y) -> x/y;
		
		Calculate calcDiv = (double x,double y) -> {
			return x/y;
		};	
		
		//	利用 Lambda語法(簡化寫法)
		Calculate calcDiv2 = (x,y) -> x/y;
		
		//	利用 Lambda語法(簡化寫法) - BMI計算
		Calculate calcBMI = (h,w) -> w/Math.pow(h/100, 2);
		
		//	利用 Lambda語法(簡化寫法) - x的y次方
		Calculate calcPOW1 = (x,y) -> Math.pow(x, y);
		Calculate calcPOW2 = Math::pow;
		
		//	利用 Lambda語法(簡化寫法) - x,y回傳最大值
		Calculate calcPOW3 = Math :: max;
		
		
		System.out.println(calcDiv.operation(10, 20));
		System.out.println(calcDiv2.operation(10, 20));
		System.out.println(calcBMI.operation(170, 60));
		System.out.println(calcPOW1.operation(1, 3));
		System.out.println(calcPOW2.operation(1, 3));
		System.out.println(calcPOW3.operation(1, 3));
	}

}