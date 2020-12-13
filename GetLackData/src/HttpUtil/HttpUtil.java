package HttpUtil;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class HttpUtil {
	
	public static String doPost(String url, String param){
		PrintWriter out = null;
		BufferedReader in = null;
		String result = "";
			URL readlUrl;
			try {
				readlUrl = new URL(url);
//				打开和url之间的连接
				URLConnection connection;
				connection = readlUrl.openConnection();
				connection.setRequestProperty("Content-Type", "application/json; charset=utf-8");
				connection.setRequestProperty("Charsert", "UTF-8");
				connection.setRequestProperty("accept", "*/*");
				connection.setRequestProperty("connection", "keep-Alive");
				connection.setRequestProperty("user-agent", "Mozilla/4.0(compatiable; MSIE 6.0; Windows NT 5.1; SV1)");
				connection.setDoOutput(true);
				connection.setDoInput(true);
				//获得URLConnection相对应的输出流
				out = new PrintWriter(connection.getOutputStream());
				//发送请求参数
				out.print(param);
				//flush输出流的缓存
				out.flush();
				//定义bufferreader输入流来读取URL的响应
				in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
				String line;
				while((line = in.readLine()) != null){
					result += line;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				try{
					if(out !=null){
						out.close();
					}
					if(in != null){
						in.close();
					}
				}catch (Exception e) {
					e.printStackTrace();
				}
			}
			return result;
	}
}
