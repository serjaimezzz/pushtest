package day03_Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * �����Լ�������yyyy-MM-dd���������㣬������һ�����˶�����
 * �Լ�����10000�컹�ж�����
 * ����10000��ļ�������:yyyy-MM-dd
 * @author zhangchi
 *
 */
public class Test02 {
	public static void main(String[] args) throws ParseException {
		System.out.println("������������(��ʽΪyyyy-MM-dd):");
		Scanner scan=new Scanner(System.in);
		String birStr=scan.next();            //��ȡ��������
		SimpleDateFormat sdf=new SimpleDateFormat(
				"yyyy-MM-dd");
		Date birth=sdf.parse(birStr);        //��������תΪ�ַ���
		System.out.println(birth);    
		
		//������˶�����
		Date now=new Date();                    
		long time=now.getTime()-birth.getTime();
		System.out.println(time);               //��������
		time=time/1000/60/60/24;		
		System.out.println("�Ѵ������:"+time);
		//time=10000-time;
		long ttdays=10000-time;           //����һ���컹�ж�����
		System.out.println("������һ��������ջ���"+ttdays+"�죡");
		
		//10000�������
		ttdays=1000*ttdays*24*60*60;             //ʣ������
		now.setTime(now.getTime()+ttdays);
		System.out.println(sdf.format(now));   //����ָ����ʽת�����ַ���
		
		
		
		
	}
}
