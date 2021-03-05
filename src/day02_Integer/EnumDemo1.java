package day02_Integer;

import java.util.Random;
import java.util.Scanner;

public class EnumDemo1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入选择:1.剪刀 2.石头 3.布");
		int num = scan.nextInt();
		
		Random ran = new Random();
		int n = ran.nextInt(3)+1;	//[1,3]
		System.out.println("n:"+n);
//		switch(n){
//			case 1:
//				Guess sci = Guess.SCI;
//				break;
//			case 2:
//				Guess rock = Guess.ROCK;
//				break;
//			case 3:
//				Guess paper = Guess.PAPER;
//				break;
//		}
		if(num == n){
			System.out.println("平局");
		}else if(num - n == 1 || num - n == -2  ){
			System.out.println("你赢了");
		}else 
			System.out.println("你输了");
		
		
	}
}

enum Guess{
	SCI(1),ROCK(2),PAPER(3);
	private int num;
	Guess(){}
	Guess(int num){
		this.num = num;
	}
	
	int getNum(){		//获取属性num
		System.out.println("num:"+num);
		return num;
	}
	
	
}