package day08;

import java.util.Arrays;
import java.util.Comparator;

public class PaperStore2 {

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
		
		Paper[] papers = {p1,p2,p3,p4};
		
		//	A4 與 B5 哪一種比較貴 ? (A4 的平均價與 B5 的平均價格那一個貴)
		
		// 假設你正在籌劃一場活動, 你需要100紙來製作傳單, 那你將如何選擇紙張顏色與尺寸,使你的預算最低 ?
				Paper lowerPaper = papers[0]; // 假設 papers[0] 是價格最低的紙
				for(int i=1;i<papers.length;i++) {
					if(papers[i].getPrice() < lowerPaper.getPrice()) {
						lowerPaper = papers[i]; // 替換最小 paper
					}
				}
				System.out.println("最便宜的紙 = " + lowerPaper);
				System.out.println("總預算費用 = " + (100 * lowerPaper.getPrice()));
				
				// 使用 java 8
				Paper cheapestPaper = Arrays.stream(papers)
											.min(Comparator.comparingInt(Paper::getPrice))
											.get();
				System.out.println("最便宜的紙 = " + cheapestPaper);
				System.out.println("總預算費用 = " + (100 * cheapestPaper.getPrice()));
				
				// 難題(不會沒關係)!
				// 如果你需要購買的紙張至少要有 3 種不同的顏色，並且你有 $60 的預算，那麼你應該如何選擇紙張？ 使紙的張數是最多 ?
	}

}
