package DateUtil;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TimeDValue {
	public static void main(String[] args) throws Exception {
		getDiffYMD();
	}
//	直接算出差多少天
	public static void getDiffDay() throws Exception{
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
		Date d1 = df.parse("2004-03-26 13:31:40"); 
		Date d2 = df.parse("2004-01-02 11:30:24"); 
		long diff = d1.getTime() - d2.getTime(); 
		long days = diff / (1000 * 60 * 60 * 24); 
//		System.out.println(days);
	}
//	以yyyy-mm-dd形式输出
	public static void getDiffYMD() throws Exception{
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
		java.util.Date now = df.parse("2004-03-26 13:31:40"); 
		java.util.Date date=df.parse("2004-01-02 11:30:24"); 
		long l=now.getTime()-date.getTime(); 
		long day=l/(24*60*60*1000); 
		long hour=(l/(60*60*1000)-day*24); 
		long min=((l/(60*1000))-day*24*60-hour*60); 
		long s=(l/1000-day*24*60*60-hour*60*60-min*60); 
//		System.out.println(""+day+"天"+hour+"小时"+min+"分"+s+"秒"); 
	}
//	比较两个时间的大小
	public static int getMixTime(String s1, String s2)	throws Exception{
		DateFormat df=new java.text.SimpleDateFormat("yyyy-MM-dd"); 
		Calendar c1=java.util.Calendar.getInstance(); 
		Calendar c2=java.util.Calendar.getInstance(); 
		try { 
		c1.setTime(df.parse(s1)); 
		c2.setTime(df.parse(s2)); 
		}catch(java.text.ParseException e){ 
		System.err.println("格式不正确"); 
		} 
		int result=c1.compareTo(c2);
		if(result==0){ 
//		System.out.println("c1相等c2"); 
		}else if(result<0){ 
//		System.out.println("c1小于c2"); 
		}else{ 
//		System.out.println("c1大于c2"); 
		}
		return result;
	}
}
