package day07_Stream;

import java.io.*;

public class Demo13 {
	public static void main(String[] args)throws IOException {
		//读取键盘输入,System.in和键盘设备关联的标准输入流对象
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	//in是InputStream的子类
		
		//输出到控制台,System.out和控制台设备关联的标准输出流对象
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		//从文件读
		BufferedReader br1 = new BufferedReader(new InputStreamReader(new FileInputStream(" ")));
		
		//输出到文件
		BufferedWriter bw1 = new BufferedWriter(new BufferedWriter(new OutputStreamWriter(new FileOutputStream(" "))));
		
		
		String line = null;
		while((line = br.readLine())!= null){
			if("over".equals(line))
				break;
			
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		br.close();
		bw.close();
	}
}
