package day05_Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.ListIterator;

public class Works2 {

}

class MyArrayList<E>{
	Object[] ele;
	public int size = ele.length;	//���ϳ���
	public static final Object[] EMPTY_ELEMENTDATA = {};//����Ϊ��
	ArrayList list;
	MyArrayList(){}
	
	public boolean plus(E e){
		ele[size] = e;
		size++;
		return true;
	}
	
	public void deleteAt(int index){	//�����±�ɾ��
		for(int i = 0;i < ele.length;i++){
			if( i == index ){
				ele[index] = null;
			}
		}
		for(int i = index;i < ele.length;i++){
			ele[index] = ele[index+1];
		}
		size--;		
	}
	
	public void deleteAs(E e){	//����Ԫ��ɾ��
		int index = 0;
		for(int i = 0; i< ele.length; i++){
			if(ele[i] == e){
				ele[i] = null;
				index = i;
			}
		}
		for(int i = index;i < ele.length;i++){
			ele[index] = ele[index+1];
		}
		size--;
	}
	
	public void deleteAll(){
		this.ele = EMPTY_ELEMENTDATA;
	}
	
	public Object acquire(int index){
		Object e = null;
		for(int i = 0; i < ele.length; i++){
			if( i == index){
				e = ele[i];
			}
		}
		return e;
	}
	
	public void change(int index,Object newEle){
		ele[index] = newEle;
	}
	
//	public void sort(MyArrayList list){
//		for (int i = 0; i < ele.length; i++) {
//			for(int j = i+1 ; j< ele.length;j++){
//				if(ele[i] > ele[j]){	//��ν綨��С
//					Object index = ele[i];
//					ele[i] = ele[j];
//					ele[j] = index;
//				}								
//			}
//		}
//	}
	
	public void compare(){
		
	}
	
}