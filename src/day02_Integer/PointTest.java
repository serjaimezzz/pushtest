package day02_Integer;
/**
 * ����Point��дObject��ط���
 * @author zhangchi
 *
 */
public class PointTest {

	public static void main(String[] args) {
		Point p1=new Point(1,2);
		//String str=p1.toString();
		//System.out.println(str);
		/*
		 * System.out.println(Object obj)
		 * ������Ǹ�������toString���ص��ַ���
		 */
		System.out.println(p1);
		//�����������@����ĵ�ַ
		
		Point p2=new Point(1,2);//�½�Point����
		System.out.println(p1==p2);//�Ƚϵ��Ƕ��еĵ�ַ
		System.out.println(p1.equals(p2));//�Ƚϵ��Ƕ��������
	}

}
//�����ж���������������Ƿ���ͬ