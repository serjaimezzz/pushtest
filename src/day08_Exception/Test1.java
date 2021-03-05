package day08_Exception;

public class Test1 {
	public static void main(String[] args) {
		int num = 1;
		int n = back(num);
		System.out.println(n);
	}
	public static int back(int num){
		try{
		return num;
		}
		finally{
			++num;
		}
	}
}
