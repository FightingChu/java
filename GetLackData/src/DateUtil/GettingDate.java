package DateUtil;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class GettingDate {
	public static void main(String[] args) {		
		}			
//		获取本月的第一天
		public static String getFirstDay0fMonth(){
				Calendar calender = null;
		        String firstDay = null;
		        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		        calender = Calendar.getInstance();
		        calender.add(Calendar.MONTH, 0);
		        calender.set(Calendar.DAY_OF_MONTH, 1);
		        firstDay = format.format(calender.getTime());
//		        System.out.println(firstDay);
				return firstDay;
		}
//		获取本月的最后一天
		public static String getLastDayOfMonth(){
			Calendar calendar =  null;
			String lastDay = null;
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			calendar = calendar.getInstance();
			calendar.add(Calendar.MONTH, 1);
			calendar.set(Calendar.DAY_OF_MONTH, 0);
			lastDay = sdf.format(calendar.getTime());
//			System.out.println(lastDay);
			return lastDay;
		}
//		获取当前天数
		public static int getDayOfCurrent(){
			//获取当前年份，月份，日期
			Calendar calender = null;
			calender = calender.getInstance();
			int year = calender.get(Calendar.YEAR);
			int month = calender.get(Calendar.MONTH) +1;
			int day = calender.get(Calendar.DATE);
			int hour = calender.get(Calendar.HOUR_OF_DAY);
			int minute = calender.get(Calendar.MINUTE);
			int second = calender.get(Calendar.SECOND);
			int dow = calender.get(Calendar.DAY_OF_WEEK)-1;
				if(dow == 0){
					dow = 7;
				}
	        int dayOfMoth = calender.get(Calendar.DAY_OF_MONTH);
	        int dayOfYear = calender.get(Calendar.DAY_OF_YEAR);
			return dayOfYear;
		}
//		返回差值为yyyy-mm-dd的集合
		public static List<String> getBetweenDate(String beginTime, String endTime){
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			List<String> betweenList = new ArrayList<String>();
			try {
				Date startTime = sdf.parse(beginTime);
				Date endTimee = sdf.parse(endTime);
				
				Calendar startDay = Calendar.getInstance();
				startDay.setTime(startTime);
				startDay.add(Calendar.DAY_OF_MONTH, 1);
				
				Calendar endDay = Calendar.getInstance();
				endDay.setTime(endTimee);
				endDay.add(Calendar.DATE, 0);
				
				while(startDay.before(endDay)){
					betweenList.add(sdf.format(startDay.getTime()));
					startDay.add(Calendar.DAY_OF_MONTH, 1);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			return betweenList;
		}
}