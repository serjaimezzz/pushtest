package day04_List;
/**
 * ���͵�ԭ����Object
 * �����˷���ֻ�Ǳ���������һЩ��֤������
 * �����ǶԷ�����������ֵʱ�������Ƿ���������Ҫ��
 * �����ǻ�ȡһ���������͵�ֵʱ�����Զ���������ת����
 * @author zhangchi
 *
 */
public class PointTest2 {

	public static void main(String[] args) {
		/*
		 * ����ָ�����͵�ʵ��������Integer
		 * ��ʵ����,������Point������,x,y������Object����,
		 * ����ֻ��Ӧ����������Integer����
		 */
		Point<Integer> p1=new Point<Integer>(1,2);  //ָ����е�Object x,Object y
		/* ���ڲ�����T,�������֤ʵ���Ƿ�ΪInteger,
		 * ������,�����ʧ�ܣ�
		 * ���Դ����������,��Ϊ�����Զ�װ��.
		 */
		
		p1.setX(1);
		/*
		 * ��ȡʱ,Ҳ���Զ��������͡�����������ʾ��
		 * ��������ת����
		 */		
		//int x1=((Integer)p1.getX()).intValue();
		int x1=p1.getX();
		
		Point p2=p1;
		p2.setX("һ");
		String x2=(String)p2.getX();
		System.out.println("x2:"+x2);
		
		x1=p1.getX();                        //�������쳣����
		System.out.println("x1:"+x1);
		
		
		
		
		
		
	}
}
