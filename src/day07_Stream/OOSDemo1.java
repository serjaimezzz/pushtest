package day07_Stream;

import java.io.*;
/**
 * ���л��ͷ����л�
 * @author zhangchi
 *
 */
public class OOSDemo1 {
	public static void main(String[] args)throws IOException, ClassNotFoundException {
//		writeObj();
		readObj();
	}

	
	/*
	 * �Ѷ�����д洢��ͨ�����紫��:�־û�,���л�
	 */
	public static void writeObj() throws IOException{
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("OOSDemo1.txt"));
		
		oos.writeObject(new Person("����",20));
		System.out.println("д����ϣ�");
		oos.close();
	}
	
	//�����л��Ķ�����ļ��ж�����:�����л�������Person.class
	public static void readObj()throws IOException, ClassNotFoundException{
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("OOSDemo1.txt"));
		Person p = (Person)ois.readObject();
		System.out.println(p.getName() + "," + p.getAge()); 
		ois.close();
	}
	
}

