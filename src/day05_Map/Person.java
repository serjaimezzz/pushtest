package day05_Map;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Person {
	String name;
	String birth;
	Gender gender;
	
	public Person(){}
	Person(String name,String birth,Gender gender){
		this.name = name;
		this.birth = birth;
		this.gender = gender;
	}

	
	public String toString(){
		try {
			return name +","+ parseDate(this.birth) +","+gender.getGend();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	private String parseDate(String birth) throws ParseException{
	
		Calendar calendar=Calendar.getInstance();
//		String str = birth;
		SimpleDateFormat sdf=new SimpleDateFormat(
				"yyyy-MM-dd");
		Date date=sdf.parse(birth);
		calendar.setTime(date);
		
		//��ʱ������໥����
		int year =calendar.get(Calendar.YEAR);
		int month=calendar.get(Calendar.MONTH)+1;		
		int day=calendar.get(Calendar.DATE);	
//		System.out.println(year+"��"+month+"��"+day+"��");	
		return year+"��"+month+"��"+day+"��";
	}
}


enum Gender{
	Male('��'),Female('Ů');
	private char gender;
	Gender(){}
	Gender(char gender){
		this.gender = gender;
	}
	
	char getGend(){
		return gender;
	}	
}

