package day23;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import day23.LottoScheduledDemo.ServiceStoper;

public class Lotto implements Runnable {
	private SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
	private ServiceStoper serviceStoper;
	
	public Lotto(ServiceStoper serviceStoper) {
		this.serviceStoper = serviceStoper;
	}
	
	@Override
	public void run() {
		System.out.print("工作開始時間:" + sdf.format(new Date()));
		try {
			Thread.sleep(new Random().nextInt(2500));
		} catch (Exception e) {
		}
		int lottoNumber = new Random().nextInt(10);
		System.out.print(" 樂透數字 " + lottoNumber + " ");
		System.out.println("工作結束時間:" + sdf.format(new Date()));
		// 是否要停止服務
		if(lottoNumber == 0) {
			serviceStoper.stop();
		}
	}
	
}