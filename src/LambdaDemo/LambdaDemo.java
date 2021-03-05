package LambdaDemo;
/**
 * Lambda���ʽ �� �����ڲ���ıȽ�
 * @author zhangchi
 *
 */
public class LambdaDemo {
	public static void main(String[] args) {
		Lamb l = new Lamb();	//����
		int sum = l.add(5, 1);	//���ù����ڵķ���
		System.out.println("lamb:"+sum);
		
		//�����ڲ���,�����������
		inter in = new inter(){		//ʵ����inter�ӿ�,����һ���������,��д�˽ӿڵķ���
			public int add(int a,int b){
				return a + b ;	
			}
		};
		sum = in.add(5, 7);	//�����˽ӿ�inter�б���д֮��ķ���
		System.out.println("in:" + in);
		System.out.println(sum);
		
		/**
		 * lambda���ʽ	: ��������
		 * ǰ������: �����ǽӿ�,�ӿ�������ֻ��һ�����뱻��д�ĳ��󷽷�
		 * inter in = () -> { };
		 * ����ʹ��lambda���ʽ�Ľӿڳ�Ϊ����ʽ�ӿ�
		 */
		inter tt = (a,b) -> {return a * b;};	//ʵ����,ʵ�ֵ���return ����ı��ʽ
		System.out.println(tt); //����ӡtt�ĵ�ַ��Ϣ
		System.out.println("tt:"+tt.add(2, 8));
		
		/**
		 *  ��̬��������:�ӿ��еĲ����ͷ���ֵ��ĳ��  ���еľ�̬�����Ĳ����ͷ���ֵ��ȫһ��
		 * 	�ӿ��� ���ñ�����  = ����::������
		 * 	�Ǿ�̬��������:�ӿ��еĲ����ͷ���ֵ��ĳ��  ���еķǾ�̬�����Ĳ����ͷ���ֵ��ȫһ��
		 *	�ӿ��� ���ñ�����  = new ����()::������
		 */
		
		inter in1 = Calculate :: calculates;	//��̬��������
		System.out.println(in1.add(3, 5));//8
		
		inter in2 = new Calculate()::calculate;//�Ǿ�̬��������
		System.out.println(in2.add(3, 5));//15
		
		
	}
}

@FunctionalInterface//��֤interface�ǲ��Ǻ���ʽ�ӿ�
interface inter{	//�Ǻ���ʽ�ӿ�,��ʹ��lambda���ʽ
	int add(int a,int b);	//����ֻ����һ�����뱻��д�ĳ��󷽷�	//����Ĭ�ϱ����γ�Ϊpublic abstract����
//	int mul(int a,int b);	
}

//Invalid '@FunctionalInterface' annotation; inter1 is not a functional interface
//@FunctionalInterface	
//interface inter1 extends inter{	//�̳��˸����еķ���,������Ϊ����ʽ�ӿ�
//	int plus(int a, int b);
//}

@FunctionalInterface
interface inter2 extends inter{
	static void print(){}
	default void prt(){}
	String toString();
}

class Lamb implements inter{
	public int add(int a,int b){
		return a + b;
	}
	public int mul(int a,int b){
		return a * b;
	}
}

class Calculate{
	public static int calculates(int a, int b){
		return a + b;
	}
	
	public int calculate(int a,int b){
		return a * b;
	}
}