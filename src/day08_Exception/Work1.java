package day08_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

class Work1
{
	//1.���һ������������ӿ���̨������������ֵĺͣ���������������ʱ����쳣
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		try{
		System.out.println("�������һ������:");
		int num1 = scan.nextInt();
		System.out.println("������ڶ�������:");
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
//					throw new OverflowException("���������");	
//			}									
//		}catch(OverflowException o){
//			System.out.println("�����������");
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
//	OverflowException(){}	//����쳣
//	OverflowException(String message){	//��ϸ��Ϣ
//		super(message);
//	}
//}

class MismatchException extends Exception{	//���Ͳ�ƥ��
	MismatchException(){}
	MismatchException(String message){
		super(message);
	}
}