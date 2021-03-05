package day08_Exception;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * finally对于流的处理
 * @author zhangchi
 *
 */
public class ExceptionDemo3 {

	public static void main(String[] args) {
		BufferedReader br=null;
		try{
			br=new BufferedReader(	//BR
					new InputStreamReader(	//ISR	字符编码格式设置
							new FileInputStream(  //FIS
									"OSWDemo.txt"),"UTF-8"));
			
			String line=null;			
			while((line=br.readLine())!=null){
				System.out.println(line);
			}			
		}catch(Exception e){
			System.out.println("出现位置错误");
		}finally{
			if(br!=null){
				try{
					br.close();
				}catch(Exception e){					
				}
			}			
		}						
	}
}
