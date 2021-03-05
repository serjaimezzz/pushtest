package day04_List;

import java.util.ArrayList;
import java.util.List;

/**
 * List subList(int start,int end)
 * 获取当前集合中指定范围内的子集。含头不含尾
 * @author zhangchi
 *
 */
public class ListDemo3 {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		
		for (int i = 10; i > 0; i--) {
			list.add(i);
		}
		System.out.println(list);
		//[10, 9, 8, 7, 6, 5, 4, 3, 2, 1]
		
		/**
		 * 取子集: subList
		 */
		List<Integer> sub=list.subList(3, 8); //截取3-7,含头不含尾	
		System.out.println(sub);
					
		/**
		 *	int indexOf(Object o)	获取当前元素的下标
		 *	int lastIndexOf(Object o)
		 */
		int index = list.indexOf(3);
		System.out.println("index:"+index);
		index = list.lastIndexOf(10);
		System.out.println(index);
		
		
		//将子集中每个元素扩大10倍
		for(int i=0;i<sub.size();i++){
			//int n=subList.get(i);
			//n=n*10;
			//subList.set(i, n);
			sub.set(i,sub.get(i)*10);//从下往上等量代换
		}
		System.out.println(sub);
		//对子集的任何修改，会修改原集合的相应内容
		System.out.println(list);
		
		/**
		 * 删除集合中2-8的元素
		 */
		list.subList(2, 9).clear();
		System.out.println(list);
		
		
		
	}
}
