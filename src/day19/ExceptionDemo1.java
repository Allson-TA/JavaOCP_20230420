package day19;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		try {
			String[] data = {"123", "一二三"};
			int number = Integer.parseInt(data[1	]);
			System.out.println("資料轉換成功");
			System.out.println("number = " + number);
		} catch (NullPointerException e) {
			System.out.println("data 必須要有資料");
		} catch (NumberFormatException e) {
			//System.out.println("錯誤資訊:" + e);
			System.out.println("錯誤原因:" + e.getMessage());
			System.out.println("錯誤原因:" + e.getLocalizedMessage());
			//e.printStackTrace(System.err); // 印出詳細錯誤
			System.out.println("資料轉換錯誤, 請重新輸入正確資料!");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("陣列維度超過最大值");
		}
		
		System.out.println("程式正常結束 !");
		
	}

}