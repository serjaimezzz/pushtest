package day02_Integer;
/**
 * JDK1.5֮���Ƴ���һ���µ�����:  �Զ���װ��
 * @author zhangchi
 *
 */
public class IntegerDemo5 {

	public static void main(String[] args) {
		/**
		 * �ֶ���װ��
		 */
		Byte b1 = new Byte((byte)6);		//�ֶ�װ��	 ������������-->����
		Byte b2 = Byte.valueOf((byte)7);	//�ֶ�װ��
		
		byte b3 = b1.byteValue();	//�ֶ�����		����--->������������
		byte b4 = b2.byteValue();	//�ֶ�����
		prt("b3:"+b3+"  b4:"+b4);
		
		
		/**
		 * �Զ���װ���Ǳ������Ͽɣ�������������Ͽɡ�
		 * �������ڽ�Դ�������ʱ�Զ������������ɻ����������װ��֮���ת��
		 */
		Byte b5 = 7;		//�Զ�װ��
		prt("b5:"+b5);
		
		byte b6 = new Byte((byte)8);	
		b6 = (byte) (b6 + 5);			//�Ȳ��� :  b6.byteValueOf()	,�������װ��:b6 = new Byte((byte)13).byteB=Value; 
		prt("b6:"+b6);
		
		
		
		
		int i1=new Integer(1);         //�������ͽ�����������
		int i2=new Integer(1).intValue();//�������Զ���װ��: Integer.ValueOf(1).intValueOf;
		//Integer i3=123;
		Integer i3=Integer.valueOf(123);
		
	}
	public static void prt(String str){
		System.out.println(str);
	}

}
