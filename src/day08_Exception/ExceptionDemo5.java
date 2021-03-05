package day08_Exception;

import java.awt.AWTException;
import java.io.*;

/**
 * 重写父类一个含有throws异常抛出声明的方法时
 * 子类该方法的throws的重写原则:
 * @author zhangchi
 *
 */
public class ExceptionDemo5 {//父类
	public void dosome() throws IOException,AWTException{//Abstract Window Toolkit抽象窗口工具包
		
	}
}

class Son extends ExceptionDemo5{//子类
	//不再抛出任何异常
	public void dosome1(){
		
	}
	
	//可仅抛出父类方法中抛出的部分异常
	public void dosome2() throws IOException{
		
	}
	
	//允许抛出父类方法抛出异常的子类型异常
	public void dosome3() throws FileNotFoundException{
		//IOE父--子EOF/FNF
	}
	
	//不允许抛出额外异常
//	public void dosome4() throws SQLException{
//		
//	}
	
	//不允许抛出父类异常
	public void dosome5() throws Exception{
		
	}
	
}