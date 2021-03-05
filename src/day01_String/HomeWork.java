package day01_String;

import java.util.Arrays;

public class HomeWork {
	public static void main(String[] args) {
        // 1. 实例化一个容器对象
        MutableArray array = new MutableArray();
        	      
        // 2. 添加元素
        array.add("hello");		// 将 hello 添加到容器里
        array.add("world");		// 将 world 添加到容器里
  
        // 3. 插入元素
        array.add(0, "lily"); 	// 将 lily 插入到下标为1的位置
        // 4. 删除元素
        array.remove("lily");	// 删除容器中的从前往后第一个 lily
//        // 5. 删除元素
//        array.remove(1);		// 删除下标为 1 的元素
//        // 6. 删除元素
//        array.clear();			// 清空所有
//        // 7. 修改元素
//        array.set(1, "lucy");	 // 将第1位的元素修改为 lucy
//        // 8. 获取元素
//        String ele = array.get(1);// 获取容器中的第 1 位的元素 
        // 输出容器中的所有元素，格式如： 
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
	
	public void add(String str){	// 将str添加到容器里
		String[] array = Arrays.copyOf(this.arr,arr.length+1);
		array[array.length-1] = str;
		this.arr = array;
 	} 
	
	public void add(int index,String str){	// 将 str插入到下标为index的位置
		String[] array = Arrays.copyOf(this.arr, arr.length+1);
		int n = 2;
		for(int i = index ; i < array.length ; i++){
			array[arr.length-n] = array[array.length-n+1];
			n++;
		}
			
		array[index] = str;
		this.arr = array;
		
	}
	
	public void remove(String str){		// 删除容器中的从前往后第一个 str
		int index = -1;
		for(int i = 0 ; i < arr.length ; i++){
			if(arr[i].equals(str)){
				index = i;	//记下下标
				break;
			}
		}
		if(index == -1)
			return;			//没有直接返回原数组
		
		
		
	}
	
	public void remove(int index){		// 删除下标为 index 的元素
		
	}
	
	public void clear(){		// 清空所有
		
	}
	
	public void set(int index,String str){
		
	}
	
	public String get(int index){		// 获取容器中的第 index 位的元素 
		return null;
	}
	
	
	@Override	//***************	重写重写重写	toString()	**************************							
	public String toString(){
		return Arrays.toString(arr);		//下次一定**********************************
		//****************************************************************************
	}
}

