package day07_Stream;

import java.io.*;
/**
 * FileWriter���쳣����
 * @author zhangchi
 *
 */
public class FileWriterExcption {
	public static void main(String[] args) {
		FileWriter fw = null ;
		try{
			fw = new FileWriter("FileWriter.txt");	//FileNotFoundException
//			fw.write("hello");		//����ģʽ
			fw.write("HelloWorld");//ÿ������,д�붼�Ǵ��ļ���ͷ��ʼд��
			fw.write("\n");
			fw.write("thinking");
			fw.close();
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try {
				if(fw != null)
				fw.close();//.close()Ҳ�������쳣
							//���new FileWriter()ʱ�Ҳ���·��,fw = null;null.close();//��ָ���쳣
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
