package day01_String;

import java.util.Arrays;

public class HomeWork {
	public static void main(String[] args) {
        // 1. ʵ����һ����������
        MutableArray array = new MutableArray();
        	      
        // 2. ���Ԫ��
        array.add("hello");		// �� hello ��ӵ�������
        array.add("world");		// �� world ��ӵ�������
  
        // 3. ����Ԫ��
        array.add(0, "lily"); 	// �� lily ���뵽�±�Ϊ1��λ��
        // 4. ɾ��Ԫ��
        array.remove("lily");	// ɾ�������еĴ�ǰ�����һ�� lily
//        // 5. ɾ��Ԫ��
//        array.remove(1);		// ɾ���±�Ϊ 1 ��Ԫ��
//        // 6. ɾ��Ԫ��
//        array.clear();			// �������
//        // 7. �޸�Ԫ��
//        array.set(1, "lucy");	 // ����1λ��Ԫ���޸�Ϊ lucy
//        // 8. ��ȡԪ��
//        String ele = array.get(1);// ��ȡ�����еĵ� 1 λ��Ԫ�� 
        // ��������е�����Ԫ�أ���ʽ�磺 
        // [lily, lucy, hello, world]
        System.out.println(array);	
    }
}

class MutableArray{
	private String[] arr;
	
	MutableArray(){
		arr = new String[0];
	}
	MutableArray(String[] arr){
		this.arr = arr;
	}
	
	public void setArr(String[] arr){
		this.arr = arr;
	}
	public String[] getArr(){
//		System.out.println(Arrays.toString(arr));
		return arr;
	}
	
	public void add(String str){	// ��str��ӵ�������
		String[] array = Arrays.copyOf(this.arr,arr.length+1);
		array[array.length-1] = str;
		this.arr = array;
 	} 
	
	public void add(int index,String str){	// �� str���뵽�±�Ϊindex��λ��
		String[] array = Arrays.copyOf(this.arr, arr.length+1);
		int n = 2;
		for(int i = index ; i < array.length ; i++){
			array[arr.length-n] = array[array.length-n+1];
			n++;
		}
			
		array[index] = str;
		this.arr = array;
		
	}
	
	public void remove(String str){		// ɾ�������еĴ�ǰ�����һ�� str
		int index = -1;
		for(int i = 0 ; i < arr.length ; i++){
			if(arr[i].equals(str)){
				index = i;	//�����±�
				break;
			}
		}
		if(index == -1)
			return;			//û��ֱ�ӷ���ԭ����
		
		
		
	}
	
	public void remove(int index){		// ɾ���±�Ϊ index ��Ԫ��
		
	}
	
	public void clear(){		// �������
		
	}
	
	public void set(int index,String str){
		
	}
	
	public String get(int index){		// ��ȡ�����еĵ� index λ��Ԫ�� 
		return null;
	}
	
	
	@Override	//***************	��д��д��д	toString()	**************************							
	public String toString(){
		return Arrays.toString(arr);		//�´�һ��**********************************
		//****************************************************************************
	}
}

