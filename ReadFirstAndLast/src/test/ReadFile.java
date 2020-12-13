package test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener;

public class ReadFile {
	public static void main(String[] args) throws IOException {
		//第一行内容
		String firstLine = "";
		//最后一行内容
		String lastLine = "";
		//当前行内容
		String currentLine = "";
		File file = new File("C://Users//chusi//Desktop//断点使用.txt");
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			if((currentLine = br.readLine()) != null){
				firstLine = currentLine;
			}
			while((currentLine = br.readLine())!= null){
				lastLine = currentLine;
			}
			System.out.println(firstLine);
			System.out.println(lastLine);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
