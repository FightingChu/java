package ThreadTest;

import java.util.Date;
import java.util.Random;

import ThreadTest.InterfaceA.call_Back;

public class Timestamp {
	public static String timeStamp(int i, call_Back callBack){
		
		Random random = new Random();
		int rannum = (int) (random.nextDouble() * (99999 - 10000 + 1)) + 10000;
		String timeStamp = String.valueOf(new Date().getTime()) + String.valueOf(rannum);
		try {
//			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		callBack.over("生成随机数完成");
		return timeStamp;
	}
}
