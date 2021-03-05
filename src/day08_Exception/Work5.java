package day08_Exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Work5 {
	public static void main(String[] args) throws ParseException {
		
	
		String str1 = "2020-08-12";
		String str2 = "2020-08-20";
		
		SimpleDateFormat sdf = new SimpleDateFormat(
				"yyyy-MM-dd");
		
		Date date1 = sdf.parse(str1);
		Date date2 = sdf.parse(str2);
		long t1 = date1.getTime();
		long t2 = date2.getTime();
		if(t1 > t2){
			long t3 = t1;
			t1 = t2;
			t2 = t3;
		}
		long t = t2 -t1;
		t /= 1000;  // 1s
		t /= 60;	//m
		t /= 60;	//s
		t /= 24;	//d
		System.out.println(t);
			
		
	}
}
