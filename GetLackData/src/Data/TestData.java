package Data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class TestData {
	public static void main(String[] args) {
	}
	//机构号数据
	public static List<String> getOrdList(){
		ArrayList<String> list = new ArrayList<String>();
		list.add("1");
//		迭代器循环list中元素
//		Iterator<String> it = list.iterator();
//		while(it.hasNext()){
//			System.out.println(it.next());
//		}
		
//		加强for，循环其中元素
//		for (String string : list) {
//			System.out.println(string);
//		}
		return list;
	}
	//差异数据
	public static List<String> getCountList(String ord){
		ArrayList list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		return list;
	}
}
