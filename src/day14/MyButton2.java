package day14;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

// 外部類別
public class MyButton2 extends JFrame {
	
	private JButton button;
	
	public MyButton2() {
		button = new JButton("Click Me");
		// 設定 button 監聽器(按一下要做的事情) - 請用 Lambda 語法實現
		//ActionListener actionListener = (ActionEvent e) -> System.out.println("Button clicked !");
		//ActionListener actionListener = e -> System.out.println("Button clicked !");
		//button.addActionListener(actionListener);
		
		// Lambda 可以直接當參數使用
		button.addActionListener(e -> System.out.println("Button clicked !"));
		
		// 配置 button 元件到 JFrame 中
		super.getContentPane().add(button);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 關閉視窗連同程序也一起關閉
		super.pack();
		super.setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new MyButton2();
	}

}