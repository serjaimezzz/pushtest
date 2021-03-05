package day07_Stream;

import java.util.*;
import java.io.*;

/**
 * ������
 * ��������һ�Ը߼����������Ƿ����дjava�еĶ���
 * java.io.ObjectOutputStream
 * ��������������Խ������Ķ���ת��Ϊһ���ֽں�д����
 * ��:OIS--Person p =(Person)ois.readObject();
 * @author zhangchi
 *
 */
public class OOSDemo {

	public static void main(String[] args) throws IOException {
		/*
		 * Person����ת��һ���ֽ�д��,Person�����������ʵ��Serializable�ӿ�
		 * ����NotSerializableException 
		 */
		Person p=new Person();	
		p.setName("����ʦ");
		p.setAge(40);
		p.setGender("Ů");
		
		List<String> list = new ArrayList<String>();//transient���κ�,���������л�����
		list.add("��һ����Ա");
		list.add("������д����");
		list.add("�ٽ������Ļ�����");
		list.add("�������ͬ����������ʦ");
		p.setOtherInfo(list);
		
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("OOSDemo.txt"));
		/*
		 * OOS��writeObject()�������Խ���������ת��Ϊһ���ֽں�д����
		 * ��Щ�ֽڱȸö���ʵ������Ҫ����Ϊ���������⻹�нṹ��������Ϣ
		 */
		/**
		 * ����Ĵ���ʵ���Ͼ�������������:
		 * 1.OOS��Person����ת��Ϊһ���ֽ�
		 *   ��һ������ת��һ���ֽڵĹ��̳�Ϊ�� �������л�
		 * 2.��ͨ��fos�������ֽ�д�뵽Ӳ��
		 *   ���ö���ת�����ֽ�д��Ӳ�������ñ���Ĺ��̳�Ϊ:����־û�
		 */
		oos.writeObject(p);
		System.out.println("д��������ϣ�");
		oos.close();
	}
}
