package day06_File;

import java.io.File;
import java.io.IOException;

/**
 * ����һ����Ŀ¼
 * @author zhangchi
 *
 */
public class FileDemo3 {

	public static void main(String[] args) throws IOException {
		/*
		 * �ڵ�ǰĿ¼�´���һ��Ŀ¼
		 */
		File dir=new File("directory.txt");
		if(!dir.exists()){			
			dir.mkdir();
			dir.createNewFile();	//Ϊʲôֻ����һ������������������������
			System.out.println("������ϣ�");
		}else{
			System.out.println("�Ѵ��ڣ�");
		}
		
		
		/**
		 * �ڵ�ǰĿ¼�´����༶Ŀ¼
		 */
		String str = "";
		for(int i = 1;i <= 3;i++){			//�����༶Ŀ¼
			str = str  +  i +File.separator ;	//	""1\\""2\\""3
		}
		File dirs = new File(str);
//		File dir=new File(
//				"a"+File.separator+
//				"b"+File.separator+
//				"c"+File.separator+
//				"d"+File.separator+
//				"e"+File.separator+
//				"f"
//		);
		
//		if(!dirs.exists()){
//			/*
//			 *  �ڴ�����ǰĿ¼��ͬʱ�����в����ڵĸ�Ŀ¼һ�𴴽�����
//			 */
//			dirs.mkdirs();
//			System.out.println("������ϣ�");
//		}else{
//			System.out.println("Ŀ¼�Ѵ��ڣ�");
//		}
		
		
	}
}
