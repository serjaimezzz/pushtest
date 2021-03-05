package day04_List;

import java.util.ArrayList;
import java.util.List;

/**
 * java.util.List
 * 可重复集，并且有序。(输入顺序和添加顺序相同)
 * 特点是可以根据下标操作元素。
 * 常用实现类:
 * ArrayList:使用数组实现，查询更快
 * LinkedList:使用链表实现，增删更快(首尾增删效果明显)
 * @author zhangchi
 *
 */
public class ListDemo1 {

	public static void main(String[] args) {
	
		List<String> list=new ArrayList<String>();
		list.add("one");		//0 <-下标
		list.add("two");		//1
		list.add("three");		//2
		list.add("four");		
		list.add(0,"zero");		//在0下标处添加"zero",原有元素往后移
		System.out.println(list);//[zero,one, two, three, four]		
		
		/**
		 * E remove(int index)	返回被删除的对象
		 */
		list.remove(4);
		System.out.println(list);////[zero,one, two, three]
		
		
		/**
		 * E set(int index,E e)
		 * 将给定元素设置到指定位置上，返回值为
		 * 原位置的元素。所以是替换元素操作
		 */
		String old=list.set(1, "1");//替换元素
		System.out.println(list);
		System.out.println("old:"+old);		
		//list.set(4,"five");  // 会出现下标越界,set只能用来替换
		
		
		/**
		 * E get(int index)
		 * 获取给定下标对应的元素
		 */
		//获取第三个元素
		String str=list.get(2);
		System.out.println("str:"+str);//two
		
		//传统循环遍历List集合
		for(int i=0;i<list.size();i++){
			str=list.get(i);
			System.out.println(str);
		}
		

		
	}
}
