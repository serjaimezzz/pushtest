package day04_List;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Vector矢量,是一种数据结构。
 * 线程是安全的,底层数据结构是数组,数组内存是连续的,所以便于数据的查找,不便于数据的增删
 * @author zhangchi
 *
 */
public class VectorDemo {
	public static void main(String[] args) {
		
		Vector v = new Vector();
		v.add("aa");
		v.add("bb");
		v.add("cc");
		v.add("dd");
		
		Enumeration en = v.elements();
		
		
	}
}
