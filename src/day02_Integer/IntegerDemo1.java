package day02_Integer;
/**
 * ��װ��
 * Java����8���������ͷֱ����˶�Ӧ�İ�װ�ࡣ
 * ����װ����ֵ�ԭ�����Ϊ�˽���������Ͳ��ܲ���������󿪷������⡣
 * @author zhangchi
 *
 */
public class IntegerDemo1 {

	public static void main(String[] args) {
		dosome("abc");
		dosome(new Point(1,2));
		/**
		 * Java��8���������ͣ�
		 * byte,short,int,long,float,double,char,boolean
		 * ����ֵ����ʽֱ�Ӵ��ڵģ��������ǲ�û����Զ������������ȻҲ���̳���Object��
		 * ���Բ���ʹ�ö�̬����Object�ĽǶ�ȥ���ܻ�������
		 */
		int i = 1;
		Integer ii = new Integer(i);
		dosome(ii);
		Integer.toString(i);
		
	}

	public static void dosome(Object obj){
		
	}


	
}
