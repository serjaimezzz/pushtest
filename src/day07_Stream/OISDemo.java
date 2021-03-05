package day07_Stream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/** 
 * java.io.ObjectInputStream 	��ȡOOSд��������
 * �����������������ǿ��Խ��ж������л�����ȡһ���ֽڲ���ԭΪ����
 * OIS��ȡ���ֽڱ�������OOS���������л��õ����ֽڣ�������׳��쳣
 * 
 * @author zhangchi
 *
 */
public class OISDemo {

	public static void main(String[] args) throws IOException, Exception {
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("OOSDemo.txt"));
		//����Person.class
		Person p=(Person)ois.readObject();	
		System.out.println(p);
		ois.close();
		
	}
}
