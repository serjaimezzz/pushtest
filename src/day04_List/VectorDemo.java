package day04_List;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Vectorʸ��,��һ�����ݽṹ��
 * �߳��ǰ�ȫ��,�ײ����ݽṹ������,�����ڴ���������,���Ա������ݵĲ���,���������ݵ���ɾ
 * @author zhangchi
 *
 */
public class VectorDemo {
	public static void main(String[] args) {
		
		Vector v = new Vector();
		v.add("aa");
		v.add("bb");
		v.add("cc");
		v.add("dd");
		
		Enumeration en = v.elements();
		
		
	}
}
