package day01_String;

public class StringBufferDemo1 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.println(sb);
	}
	public static void show(int rows,int cols){
		StringBuffer sb = new StringBuffer();
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j < cols; j++) {
				sb.append("*");
			}
			sb.append("\r\n");
		}
		System.out.println(sb);
	}

}
