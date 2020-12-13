package ThreadTest;

import java.util.concurrent.Callable;

import ThreadTest.InterfaceA.call_Back;

public class Muti_Thread implements Runnable {
	int i;
	call_Back callBack;
	

	public Muti_Thread() {
		super();
	}


	public Muti_Thread(int i, call_Back callBack) {
		super();
		this.i = i;
		this.callBack = callBack;
	}


	@Override
	public void run() {
		Timestamp tt = new Timestamp();
		String s = tt.timeStamp(i, callBack);
		System.out.println(s);
	}
	
}
