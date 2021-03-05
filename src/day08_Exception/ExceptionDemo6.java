package day08_Exception;
/**
 * Exception���÷���
 * @author zhangchi
 *
 */
public class ExceptionDemo6 {

	public static void main(String[] args) {
		System.out.println("result:" + Test());
	}	
	private static int Test(){
		int t = 1;
		try{
			System.out.println("execute try,t:" + t);//ִ��try:1
			return ++t;//return 2
		}catch(Exception e){
			System.out.println("execute catch,t:" + t);//�����쳣,1
			return ++t;//2
		}finally{
			System.out.println("execute finally,t:" + t);//1
			++t;//2
		}
	}
	/*
	 * 1.finally����return����ı��ʽ���������ִ�еġ�
	 * ����ʱ��û�з���������ֵ�������Ȱ�Ҫ���ص�ֵ������������finally����return���򲻹�finally�еĴ�����ô����
	 * 	���ص�ֵ������ı䣬��Ȼ��֮ǰ�����ֵ����������º�������ֵ����finallyִ��ǰȷ����)
	 * 2.finally���־Ͳ�Ҫreturn�ˣ�Ҫ��Ȼ���ͻز�ȥtry����catch��return�ˡ�
	 */
}
