package day08_Exception;

import java.awt.AWTException;
import java.io.*;

/**
 * ��д����һ������throws�쳣�׳������ķ���ʱ
 * ����÷�����throws����дԭ��:
 * @author zhangchi
 *
 */
public class ExceptionDemo5 {//����
	public void dosome() throws IOException,AWTException{//Abstract Window Toolkit���󴰿ڹ��߰�
		
	}
}

class Son extends ExceptionDemo5{//����
	//�����׳��κ��쳣
	public void dosome1(){
		
	}
	
	//�ɽ��׳����෽�����׳��Ĳ����쳣
	public void dosome2() throws IOException{
		
	}
	
	//�����׳����෽���׳��쳣���������쳣
	public void dosome3() throws FileNotFoundException{
		//IOE��--��EOF/FNF
	}
	
	//�������׳������쳣
//	public void dosome4() throws SQLException{
//		
//	}
	
	//�������׳������쳣
	public void dosome5() throws Exception{
		
	}
	
}