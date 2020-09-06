package emmm;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import Utils.Convert_String;
import Utils.StringUtils;

public class Base64ToFile {
	public static void main(String[] args) throws Exception {
		existFileToFile();
	}
	public static void existStringToFile() throws Exception{
		String s = FileToBase64.toBase64();
		//生成文件地址
		String path = "C://Users//chusi//Desktop//lr1.txt";
		File file = new File(path);
		try {
			file = Convert_String.base64ToFile(s, file);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void existFileToFile() throws Exception{
//		读取文件地址
		File file = new File("C://Users//chusi//Desktop//1.txt");
		StringBuffer sbf = new StringBuffer();
		 try {		 
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String s = "";
			while((s = reader.readLine()) != null){
				sbf.append(s);
			}
			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		 String str = sbf.toString();
//		 生成文件地址
		 File file1 = new File("C://Users//chusi//Desktop//2.jpg");
		 file1 = Convert_String.base64ToFile(str, file1);
	}
}
