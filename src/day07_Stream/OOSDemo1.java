package day07_Stream;

import java.io.*;
/**
 * 序列化和反序列化
 * @author zhangchi
 *
 */
public class OOSDemo1 {
	public static void main(String[] args)throws IOException, ClassNotFoundException {
//		writeObj();
		readObj();
	}

	
	/*
	 * 把对象进行存储或通过网络传输:持久化,序列化
	 */
	public static void writeObj() throws IOException{
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("OOSDemo1.txt"));
		
		oos.writeObject(new Person("王五",20));
		System.out.println("写出完毕！");
		oos.close();
	}
	
	//把序列化的对象从文件中读出来:反序列化，依据Person.class
	public static void readObj()throws IOException, ClassNotFoundException{
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("OOSDemo1.txt"));
		Person p = (Person)ois.readObject();
		System.out.println(p.getName() + "," + p.getAge()); 
		ois.close();
	}
	
}

