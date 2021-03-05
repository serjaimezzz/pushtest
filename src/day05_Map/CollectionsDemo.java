package day05_Map;

import java.util.*;

/**
 * 
 * 集合的工具类:Collections
 * Collections工具类:	是集合常用方法的具体实现的class
 * @author zhangchi
 *
 */
public class CollectionsDemo {
	public static void main(String[] args) {
		// <T> boolean addAll(Collection<? super T> c, T... elements)
		List<Integer> list = new ArrayList<>();
		Collections.addAll(list, 1,2,4,12,99);	//添加的整数会自动装箱
		System.out.println(list);
		
		/*
		 * static <T extends Object & Comparable<? super T>> T max(Collection<? extends T> coll)
		 * 集合中的对象所属的类实现了comparable接口
		 */
		Integer max = Collections.max(list);
		System.out.println("max:"+max);//99
		
		/*
		 * static <T> T max(Collection<? extends T> coll, Comparator<? super T> comp)
		 * 需要提供自定义的比较方式,重写Comparator的compare方法
		 */
		max = Collections.max(list,(t1,t2) -> t2-t1);//返回值是正数就认为谁大t2>t1,t2是调用方
		System.out.println("max:"+max);//1
		
		/*
		 * static <T> Comparator<T> reverseOrder() 
		 */
		max = Collections.max(list,Collections.reverseOrder((t1,t2) -> t2-t1));
		System.out.println("max:"+max);
		
		
		List<String> list2 = new ArrayList<>();
		Collections.addAll(list2,"aa","aaa","b","cccc","d");
		String smax = Collections.max(list2);
		System.out.println("smax:"+smax);	//d
		
		/*
		 * static <T> Comparator<T> reverseOrder()
		 * 返回和默认的方式相反的比较方式
		 */
		smax = Collections.max(list2,Collections.reverseOrder());
		System.out.println("smax:"+smax);//aa
		
		//翻转
		Collections.reverse(list2);
		System.out.println("reverse:"+list2);
		
		//交换下标1,2的元素
		Collections.swap(list2, 1, 2);
		System.out.println("swap:"+list2);
		
		//随机排列
		Collections.shuffle(list2);
		System.out.println("shuffle:"+list2);
		
		/*
		 * static <T extends Comparable<? super T>> void sort(List<T> list)
		 * 只能接收List集合
		 */
		Collections.sort(list2);
		System.out.println("sort:"+list2);
		
		//和默认比较方式相反的排序方式
		Collections.sort(list2, Collections.reverseOrder());
		
		/*
		 * 集合之间的copy
		 * 只负责copy,不负责开辟内存,IndexOutOfBoundsException:Source does not fit in dest
		 */
		List<String> list3 = new ArrayList<>();
		Collections.addAll(list3,"","","","","");//""是为了开辟内存
		Collections.copy(list3, list2);//把list2的元素copy到list3
		System.out.println("list3:"+list3);
		
	}
}
