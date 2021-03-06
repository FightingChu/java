package ThreadTest;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import ThreadTest.InterfaceA.call_Back;

public class Process {
	
	//设置一个回调字符,通知结果。
	static String msg = "还没完";
	
	public static void main(String[] args) {
		Muti_Thread_test();
	}
//	线程池模式
	public static String Pool_Thread_test(){
		Timestamp tt = new Timestamp();
		//future函数接受多线程结果
		Future<String> result = null;
		//开启线程池
		ExecutorService service = Executors.newFixedThreadPool(3);
		//启动countdownlatch方法
		CountDownLatch cdl = new CountDownLatch(10);
		//设置回调函数
		call_Back callBack = new call_Back(){
			@Override
			public void over(String status) {
				msg = status;
			}
		};
		
			Pool_Thread pt = null;
			for(int i = 0; i < 10; i++){
				pt = new Pool_Thread(i, tt, callBack, cdl);
				service.submit(pt);
	//			result = service.submit(pt);
			}
			try {
			cdl.await();
		} catch (Exception e) {
			e.printStackTrace();
		}
		service.shutdown();
		System.out.println(msg);
		return msg;
	}
		
//	多线程模式
	public static String Muti_Thread_test(){
		
		Timestamp tt = new Timestamp();
//		开启回调函数
		call_Back callBack = new call_Back(){
			@Override
			public void over(String status) {
				msg = status;
			}
		};
		ArrayList<Thread> list = new ArrayList<>();
		//for循环提交线程
		for(int i = 0; i < 10; i++){
			Thread thread = new Thread(new Muti_Thread(i, callBack));
			thread.start();
			list.add(thread);
		}
		for (Thread thread : list) {
			try {
				thread.join();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println(msg);
		return msg;
	}
}
