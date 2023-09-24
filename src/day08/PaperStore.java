package day08;

import java.util.Arrays;

public class PaperStore {

	public static void main(String[] args) {
		
		Color red = new Color();
		red.setColorName("Red");
				
		Color white = new Color();
		red.setColorName("white");
		
		Color yellow = new Color();
		red.setColorName("yellow");
		
		Size a4 = new Size();
		a4.setSizeName("A4");
		
		Size b4 = new Size();
		a4.setSizeName("B4");
		
		Size b5 = new Size();
		a4.setSizeName("B5");
		
		//	組合
		
		Paper p1 = new Paper();
		p1.setColor(yellow);p1.setSize(a4);p1.setPrice(10);
		
		Paper p2 = new Paper();
		p2.setColor(white);p2.setSize(b4);p2.setPrice(8);
		
		Paper p3 = new Paper();
		p3.setColor(yellow);p3.setSize(b5);p3.setPrice(12);
		
		Paper p4 = new Paper();
		p4.setColor(white);p4.setSize(a4);p4.setPrice(15);
		
		System.out.println(p1);	// 	同於p1..toString()
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		
		Paper[] papers = {p1,p2,p3,p4};
		
		Arrays.stream(papers).forEach(paper->System.out.println(paper));
		
		Arrays.stream(papers).forEach(System.out::println);
		
		Arrays.stream(papers).forEach(Paper::print);
	}

}
