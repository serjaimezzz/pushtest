package day01_String;

import java.util.Arrays;

public class StringDemo2 {
	public static void main(String[] args) {
		String str = "substring";
		String str1 = myTrim(str);
		
		System.out.println(str1.length());
		System.out.println(str1);
		str1 = caseExc(str1);
		System.out.println(str1);
		String str2 = caseExc(str1);
		System.out.println(str2);
		
		String str3 = myTrim(str,'s');
		System.out.println(str3);
		
		System.out.println(orderArr(str));
		
	}
	public static String myTrim(String str){
		int start = 0,end = str.length()-1;
		while(str.charAt(start) == ' ' && start< end )
			start++;
		while(str.charAt(end) == ' ' && end > start )
			end--;
		return str.substring(start, end+1);
	}
	
	public static String orderArr(String str){	//排序
		char[] arr = str.toCharArray();
		
		for(int i = 0;i < arr.length ; i++){
			for(int j = i+1; j < arr.length; j++){
				if(arr[i] > arr[j]){
				char index = arr[i];
				arr[i] = arr[j];
				arr[j] = index;
				}
			}
		}
		//return new String(arr);	
		return Arrays.toString(arr);
	}
	
	
	public static String caseExc(String str){
		char[] ch = str.toCharArray();
		for(int i=0;i<str.length();i++){
			if(ch[i]>= 65 && ch[i]<= 90)	//大写转小写
				ch[i] += 32;
			else if(ch[i]>= 97 && ch[i]<= 122)	//小写转大写
				ch[i] -= 32;
		}
		return new String(ch);
	}
	
	public static String myTrim(String str,char c){
		int start = 0,end = str.length()-1;
		int end1 = str.indexOf(c);	//首次出现的下标	截取0-end1 没有返回-1
		
		if(end1 != -1){
		int start1 = end1+1;
		String str1 = str.substring(start,end1);
		String str2 = str.substring(start1,end);
		return str1+str2;		
		}else
			return str;			
	}
	
}
