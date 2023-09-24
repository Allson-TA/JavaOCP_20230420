package day14;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

// 外部類別
public class MyButton extends JFrame {
	
	private JButton button;
	
	public MyButton() {
		button = new JButton("Click Me");
		// 設定 button 監聽器(按一下要做的事情)
		ButtonOnClickListener buttonOnClickListener = new ButtonOnClickListener();
		button.addActionListener(buttonOnClickListener);
		
		// 配置 button 元件到 JFrame 中
		super.getContentPane().add(button); super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//	關閉視窗連同程式關閉 
		super.pack();
		super.setVisible(true);
	}
	
	// 建立一個 Button 監聽器(內部類別)
	private class ButtonOnClickListener implements ActionListener {
		// 按一下要做的事情
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Button clicked !");
		}
	}
	
	
	public static void main(String[] args) {
		new MyButton();
	}

}