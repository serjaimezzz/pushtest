package day03_Date;

import java.util.Date;

/**
 * java.util.Date
 * Date��ÿһ��ʵ�����ڱ�ʾһ��ȷ�е�ʱ��㣬�ڲ�ά����һ��long�͵�ֵ����¼��
 * ��1970.1.1 00:00:00����ʾ��ʱ���ֱ���������ĺ���ֵ��
 * ������1970���Ժ�����ڣ�������1970����ǰ�����ڡ�
 * ����Date����ϴ���ȱ��(ʱ��,ǧ���)���������Ĵ󲿷ַ���������Ϊ"��ʱ��"�����ٽ���ʹ��
 * @author zhangchi
 *
 */
public class DateDemo {

	public static void main(String[] args) {
		/**
		 * ʹ��Ĭ�Ϲ��췽��������Date��ʾ��ǰ��ϵͳʱ��
		 */
		Date now=new Date();
		/**
		 * Date��д��toString�����ص��ַ�����ʾ�ľ��ǵ�ǰDate��ʾ��ʱ�䡣
		 */
		System.out.println(now);
		//Date�Ĵ󲿷ַ���������ʹ���ˡ�
		now.getDate();
		
		//��ȡDate�ڲ�ά����longֵ:
		long time=now.getTime();
		System.out.println("getTime:"+time);
		System.out.println(System.currentTimeMillis());
		
		 //������һ�̵ĺ���ֵ
		time+=1000*60*60*24;
		/**
		 * void setTime(long)
		 * ����һ��longֵ��ʹDate��ʾ��longֵ����ʾ��ʱ�䡣
		 */
		now.setTime(time);
		System.out.println(now);
		
		
		
	}

}
