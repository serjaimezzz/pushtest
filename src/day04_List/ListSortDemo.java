package day04_List;

import java.util.*;


/**
 * 排序集合元素。只能排序List集合。Set集合大部分是无序集合。
 * 排序集合使用的是集合的工具类Collections的静态方法sort
 * 
 * @author zhangchi
 *
 */
public class ListSortDemo {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		MyComparators mc = new MyComparators();
		Random random=new Random();
		for(int i=0;i<10;i++){
			list.add(random.nextInt(100));
		}
		System.out.println(list);
		
		/**对集合进行自然排序，从小到大*/
		Collections.sort(list);
		System.out.println(list);
		
		Collections.sort(list,mc);
		System.out.println(list);
			
	}
}

class MyComparators implements Comparator<Integer>{
	public int compare(Integer a,Integer b){	//集合中只能用引用类型
		return b - a;	
	}
}