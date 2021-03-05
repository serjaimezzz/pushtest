package day04_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import day05_Map.Point;

/**
 * �����Զ�������Ԫ�صļ���
 * @author zhangchi
 *
 */
public class ListSortDemo1 {

	public static void main(String[] args) {
		List<Point> list=new ArrayList<Point>();
		list.add(new Point(4,2));	//��ҪPoint��ʵ��Comparable�ӿڲ���дcompareTo()����
		list.add(new Point(2,3));	//�ĸ���ʵ������ӿ�,<>�����ĸ���
		list.add(new Point(1,4));
		list.add(new Point(6,7));
		list.add(new Point(9,3));
		list.add(new Point(8,1));
		System.out.println(list);
		
		/**
		 * sort����Ҫ�󼯺�Ԫ�ر���ʵ��Comparable�ӿڣ�
		 * �ýӿ����ڹ涨ʵ�����ǿ��ԱȽϵġ�
		 * ����һ�����󷽷�����������Ƚϴ�С�Ĺ���
		 * 
		 * ������ʹ��sort�������򼯺ϣ����Ǹ÷���Ҫ�����ǵļ���Ԫ�ر���ʵ��Comparable�ӿ�
		 * ���Ҷ���ȽϹ�������������ʹ��ĳ�����ܣ�����Ҫ�������޸ĳ���������Ϊ"������"��
		 * �޸ĵĴ���Խ�࣬������Խǿ��Խ���ʺϳ������չ��
		 */
		Collections.sort(list);
		System.out.println(list);
	
		
	}
}
