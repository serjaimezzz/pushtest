package day01_String;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
//		String[] arr = {"1","2"};
//		String[] arr1 = arr;
//		System.out.println(arr);
//		System.out.println(Arrays.toString(arr1));
		
		MuArr arr = new MuArr();
		arr.add("hhh");
		System.out.println(arr);
		
	}
	
}

class MuArr{
	private String[] arr;
	MuArr(){
		arr = new String[0];
	}
	
	public String add(String str){
		String[] arr1 = Arrays.copyOf(arr, arr.length+1);
		arr1[arr1.length-1] = str;
		System.out.println(Arrays.toString(arr1));
		return Arrays.toString(arr1);
	}
	
}