package day03_Date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * �鿴��ǰϵͳʱ���16��5Сʱ23��40���Ժ������
 * ��ʾ�ĸ�ʽ:
 * yyyy-MM-dd HH:mm:ss
 * @author zhangchi
 *
 */
public class Test01 {

	public static void main(String[] args) {
		Date now=new Date();
		System.out.println(now);
		SimpleDateFormat sdf=new SimpleDateFormat(
				"yyyy-MM-dd HH:mm:ss");
		String str=sdf.format(now);
		System.out.println(str);
		
		long time=now.getTime();//��ȡnow��ά��ֵ
		System.out.println("getTime:"+time);
		time+=1000*16*24*60*60;  //+16days
		time+=1000*5*60*60;      //+5hours
		time+=1000*23*60;        //+23minus
		time+=1000*40;           //+40seconds
		now.setTime(time);       //����longֵ��time��ʾ���Ǹ�longֵ��ʱ��
		System.out.println(sdf.format(now));
		
		
		
	}
}
