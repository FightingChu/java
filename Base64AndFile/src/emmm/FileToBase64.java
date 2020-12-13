package emmm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import Utils.Convert_String;

public class FileToBase64 {
	public static void main(String[] args)  {
		toBase64File();
	}
//	文件转字符
	public static String toBase64(){
		//指定解析文件路径
		String str = "C://Users//chusi//Desktop//无聊看看天.txt";
		String s = Convert_String.FileToString(str);
		return s;
	}
//	文件转字符并写入指定文件
	public static void toBase64File(){
		String s = toBase64();
		System.out.println(s);
		//指定写入文件路径
		File file = new File("C://Users//chusi//Desktop//1.txt");
		//检查是否有此文件，如无，则创建
		if(!file.exists()){
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		//FileOutStream写入文件方法
		try {
			byte bytes[] = new byte[512];
			bytes = s.getBytes();
			FileOutputStream fos=new FileOutputStream(file);
			fos.write(bytes,0,s.length());
			fos.flush();
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		//BufferWriter写入文件方法
//		try {
//			BufferedWriter bw = new BufferedWriter(new FileWriter(file));
//			bw.write(s);
//			bw.flush();
//			bw.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	}		
}
