package day08_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

class Work1
{
	//1.设计一个方法，计算从控制台输入的两个数字的和，并处理各种输入的时候的异常
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		try{
		System.out.println("请输入第一个数字:");
		int num1 = scan.nextInt();
		System.out.println("请输入第二个数字:");
		int num2 = scan.nextInt();
		
		int num = plus(num1,num2);
			System.out.println(num);
		}catch(InputMismatchException e){
			
			e.printStackTrace();
		}

	}

	public static int plus(int num1,int num2){			//2147483647
		return num1 + num2;
//		int num =0;
//		try{
//			 num = num1 + num2;
//			if( num1 > 0 && num2 > 0){
//				if(num < 0)
//					throw new OverflowException("结算结果溢出");	
//			}									
//		}catch(OverflowException o){
//			System.out.println("运算结果溢出了");
//			o.printStackTrace();
//		}
//		catch(Exception e){		
//			System.out.println(e.getMessage());
//		}
//		return num ;
	}


}

//class OverflowException extends Exception
//{
//	OverflowException(){}	//溢出异常
//	OverflowException(String message){	//详细信息
//		super(message);
//	}
//}

class MismatchException extends Exception{	//类型不匹配
	MismatchException(){}
	MismatchException(String message){
		super(message);
	}
}