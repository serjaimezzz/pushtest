package day08_Exception;

class Work2
{
	public static void main(String[] args){
		char[] arr = {'a'};
		char ch = '1';
	
		int index = seek(null,ch);
		System.out.println(index);
	
	}

	public static int seek(char[] arr,char ch){
		
		try {
			if (arr == null)
				throw new IllegalArgumentException();
				System.out.println("传入的数组为null");
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == ch)
					return i;
				else 
					return -1;
			}
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
		return -1;

	}
}
