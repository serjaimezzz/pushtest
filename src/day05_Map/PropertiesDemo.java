package day05_Map;

import java.util.*;
/**
 * Map��һ������,��ʾһ��־õ�����,�����б��е�ÿ���������Ӧ��ֵ����һ���ַ���
 * ����ֵ�̶���String���͵�
 * ֻ�ܴ洢����ֵ�����ַ����ļ�ֵ��
 * @author zhangchi
 *
 */
public class PropertiesDemo {
	public static void main(String[] args) {
		Properties pro = System.getProperties();	//��õ�ǰϵͳ��������Ϣ
		System.out.println(pro);
		
		//�õ�����key�ļ���
		Set<String> keys = pro.stringPropertyNames();
//		for(String k : keys){
////			String value = pro.getProperty(k);	
//			System.out.println(k + ": " + pro.getProperty(k));
//		}
		
		//�޸Ļ����
		pro.setProperty("user.name", "zzz");	//�޸ĵ��Ǽ����е�,������ϵͳ�е�
		for(String k:keys){
			System.out.println(k + "," + pro.getProperty(k));
		}
	}
}
