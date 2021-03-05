package day08_Exception;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class Work4
{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("ÇëÊäÈë×Ö·û´®³¤¶È:");
		int length = scan.nextInt();

		String[] arr = new String[length];
		Random ran = new Random();
		for(int i = 0; i < arr.length;i++){
			
		int a = ran.nextInt(10);
		char ch1 = (char) (ran.nextInt(26)+65);	//´óĞ´×ÖÄ¸
		char ch2 = (char) (ran.nextInt(26)+97);
		String[] str = new String[4];
		
		
			str[0] = Integer.toString(a);
			str[1] = Character.toString(ch1);
			str[2] = Character.toString(ch2);
			str[3] = "_";

			arr[i] = str[ran.nextInt(4)];
			System.out.print(arr[i]);
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
