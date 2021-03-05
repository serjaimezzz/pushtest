package day07_Stream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/** 
 * java.io.ObjectInputStream 	读取OOS写出的内容
 * 对象输入流，作用是可以进行对象反序列化，读取一组字节并还原为对象
 * OIS读取的字节必须是由OOS将对象序列化得到的字节，否则会抛出异常
 * 
 * @author zhangchi
 *
 */
public class OISDemo {

	public static void main(String[] args) throws IOException, Exception {
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("OOSDemo.txt"));
		//依据Person.class
		Person p=(Person)ois.readObject();	
		System.out.println(p);
		ois.close();
		
	}
}
