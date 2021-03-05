package day01_String;
/**
 * from jdk1.0 线程安全的可变的字符序列。
 * 字符串缓冲区就像一个String,但可以修改,把StringBuffer理解成一个字符串的容器
 * @author zhangchi
 *
 */
public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer();
		//可以向容器中添加，修改，删除，只要是被放入容器的都被转换为字符串了
		
		/**
		 * 存储:append(Object o)
		 * 		每次添加的内容默认追加在容器的末尾,返回原容器,始终用的都是同一个容器对象
		 */
//		StringBuffer sb2 = sb1.append(false);
//		StringBuffer sb3 = sb1.append(666);
//		System.out.println("sb1:"+sb1);
//		System.out.println(sb1 == sb2 & sb1 == sb3);
		
		sb1.append(false).append(666);
		System.out.println("append:"+sb1);
		
		/**
		 * insert
		 */
		//向指定位置插入元素
		sb1.insert(5, 999);
		System.out.println("insert:"+sb1);
		
		/**
		 * delete
		 */
		//删除多个元素
		sb1.delete(5, 8);	//含头不含尾
		System.out.println("delete:"+sb1);
		//删除指定下标上的元素
		sb1.deleteCharAt(6);
		System.out.println("delete:"+sb1);
		
		/**
		 * replace
		 */
		//替换
		sb1.replace(0, 5, "true");	//含头不含尾
		System.out.println("sb1:"+sb1);
		
		//替换	下标处元素替换为字符
		sb1.setCharAt(4, '7');
		System.out.println("sb1:"+sb1);
		
		//翻转
		sb1.reverse();
		System.out.println("sb1:"+sb1);
		
		System.out.println(sb1.toString());
		
		
	}
}
