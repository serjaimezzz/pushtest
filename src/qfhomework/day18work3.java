package qfhomework;
import java.io.*;
public class day18work3 {
	public static void main(String[] args) throws IOException{
		String str = "C:\\Users\\zhangchi\\Desktop";
		for(int i = 0;i < 10;i++){
			str += "\\"+i;
		}
		File file = new File(str);
		if(!file.exists())
			file.mkdirs();
		
	}
}
