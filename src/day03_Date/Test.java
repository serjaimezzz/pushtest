package day03_Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * �����������
 * ����һ����������,һ�������ڵ�����,������Ϊ����Ʒ������ǰ���ܵ�����
 * @author zhangchi
 *
 */
public class Test {

	public static void main(String[] args) throws ParseException {
		Scanner scan =new Scanner(System.in);
		System.out.println("��������������:(yyyy-MM-dd)");
		String dateStr=scan.next();
		System.out.println("�����뱣���ڵ�����:");
		int days = Integer.parseInt(scan.next());     
		
		//String->Date
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		Date date=sdf.parse(dateStr);//��SDF��ʽ����date����
		System.out.println(date);
		
		//Date->Calendar
		Calendar calendar=Calendar.getInstance();
		calendar.setTime(date);//��������
		
		//���������
		calendar.add(Calendar.DAY_OF_YEAR, days);
		//��������յ�����ǰ
		calendar.add(Calendar.DAY_OF_YEAR, -14);
		//����Ϊ���ܵ�����
		calendar.add(Calendar.DAY_OF_WEEK, 4);
		
		//calendar->Date
		date=calendar.getTime();
		
		//Date->String
		dateStr=sdf.format(date);
		System.out.println("������Ϊ:"+dateStr);
		
	
		
		
	}
}
