package day05_Map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Work2 {
	public static void main(String[] args) {
		Random ran = new Random();
		List<Integer> li = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			li.add((ran.nextInt(31)+1));
		}		
	
		MyComparator mp = new MyComparator();
		Collections.sort(li,mp);
		System.out.println(li);
		for (int i = 0; i < 10; i++) {
			if(li.get(i)>=10) 
				System.out.print(li.get(i) + " ");
		}				
	}
}

class MyComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		return o2 - o1;
	}
	
}