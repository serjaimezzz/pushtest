package day01_String;
/**
 * 将一个字符串进行翻转。将字符串中指定部分进行位置交换
 * 1.把字符串转换为字符数组	char[] arr = str.toCharArray()
 * 2.翻转: a.全部翻转	b.部分翻转	
 * 3.交换位置
 * @author zhangchi
 *
 */
public class StringDemo1 {
	public static void main(String[] args) {
		String str = "abcde";
		String str1 = reverse(str);
		System.out.println(str1);

	}
	
	public static String reverse(String str){	//全部翻转
		return reverse(str,0,str.length());
	}
	public static String reverse(String str,int start,int end){//指定部分进行翻转
		char[] arr = str.toCharArray();
		ooOrder(arr,start,end);
		return new String(arr);
	}
	
	private static void ooOrder(char[] arr,int start, int end){//倒序
		/**
		 * 倒序排列
		 */
		for (int i = start,j = end - 1; i < j ; i++,j--) 
			exchange(arr,i,j);
		
	}
	
	private static void exchange(char[] arr ,int i,int j){//指定元素进行位置交换
		char ch = arr[i];
		arr[i] = arr[j];
		arr[j] = ch;
	}
}
