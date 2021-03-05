package day01_String;
/**
 * ��һ���ַ������з�ת�����ַ�����ָ�����ֽ���λ�ý���
 * 1.���ַ���ת��Ϊ�ַ�����	char[] arr = str.toCharArray()
 * 2.��ת: a.ȫ����ת	b.���ַ�ת	
 * 3.����λ��
 * @author zhangchi
 *
 */
public class StringDemo1 {
	public static void main(String[] args) {
		String str = "abcde";
		String str1 = reverse(str);
		System.out.println(str1);

	}
	
	public static String reverse(String str){	//ȫ����ת
		return reverse(str,0,str.length());
	}
	public static String reverse(String str,int start,int end){//ָ�����ֽ��з�ת
		char[] arr = str.toCharArray();
		ooOrder(arr,start,end);
		return new String(arr);
	}
	
	private static void ooOrder(char[] arr,int start, int end){//����
		/**
		 * ��������
		 */
		for (int i = start,j = end - 1; i < j ; i++,j--) 
			exchange(arr,i,j);
		
	}
	
	private static void exchange(char[] arr ,int i,int j){//ָ��Ԫ�ؽ���λ�ý���
		char ch = arr[i];
		arr[i] = arr[j];
		arr[j] = ch;
	}
}
