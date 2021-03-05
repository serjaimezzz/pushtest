package day07_Stream;

import java.util.*;
import java.io.*;

/**
 * 对象流
 * 对象流是一对高级流，作用是方便读写java中的对象。
 * java.io.ObjectOutputStream
 * 对象输出流，可以将给定的对象转换为一组字节后写出。
 * 读:OIS--Person p =(Person)ois.readObject();
 * @author zhangchi
 *
 */
public class OOSDemo {

	public static void main(String[] args) throws IOException {
		/*
		 * Person对象转成一组字节写出,Person所属的类必须实现Serializable接口
		 * 否则NotSerializableException 
		 */
		Person p=new Person();	
		p.setName("苍老师");
		p.setAge(40);
		p.setGender("女");
		
		List<String> list = new ArrayList<String>();//transient修饰后,不参与序列化过程
		list.add("是一名演员");
		list.add("爱好是写大字");
		list.add("促进中日文化交流");
		list.add("广大男性同胞的启蒙老师");
		p.setOtherInfo(list);
		
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("OOSDemo.txt"));
		/*
		 * OOS的writeObject()方法可以将给定对象转换为一组字节后写出。
		 * 这些字节比该对象实际内容要大，因为除了数据外还有结构等描述信息
		 */
		/**
		 * 下面的代码实际上经历了两个操作:
		 * 1.OOS将Person对象转换为一组字节
		 *   将一个对象转换一组字节的过程称为： 对象序列化
		 * 2.再通过fos将这组字节写入到硬盘
		 *   将该对象转换的字节写入硬盘做长久保存的过程称为:对象持久化
		 */
		oos.writeObject(p);
		System.out.println("写出对象完毕！");
		oos.close();
	}
}
