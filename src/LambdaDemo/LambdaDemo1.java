package LambdaDemo;
/**
 * �ӿ���   =  lambda���ʽ	: ��������
 * 		 (�ӿ��з����Ĳ����б�) -> {��д�ӿڵķ���}
 * ��,��������ʱ��������⡣
 */
public class LambdaDemo1 {
	public static void main(String[] args) {
		Face1 f1 = () -> {System.out.println("f1_test");};	
		f1.test();
		Face2 f2 = a -> System.out.println("a:" + a);
		f2.test(2);
		Face3 f3 = (a,b) -> {System.out.println("a:" + a + ",b:" + b);};
		f3.test(1,2);
		
		Face4 f4 = () -> {return 4;};			//�޲��з���ֵ
		System.out.println("f4:" + f4.test());
		
		Face5 f5 = (a) -> {return a;};
		System.out.println("f5:" + f5.test(5));
		
		Face6 f6 = (a,b) -> {return a+b;};
		System.out.println("f6:" + f6.test(3, 3));
		
		//�������Ϳ���ʡ��
		//���ֻ��һ������,()Ҳ����ʡ��;���{}��ֻ��һ�����,{}Ҳ����ʡ��
		Face2 f7 = a -> System.out.println("a:"+a);
		f7.test(7);
		
		//���{}��ֻ��һ��return���,��return ����ʡ��
		Face5 f8 = a -> a;
		System.out.println("f8:"+f8.test(8));
	
	}
}

interface Face1{
	void test();
}

interface Face2{
	void test(int a);
}

interface Face3{
	void test(int a,int b);
}

interface Face4{
	int test();
}

interface Face5{
	int test(int a);
}

interface Face6{
	int test(int a,int b);
}