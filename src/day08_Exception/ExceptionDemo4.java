package day08_Exception;
/**
 * �����쳣���׳�
 * @author zhangchi
 *
 */
public class ExceptionDemo4 {

	public static void main(String[] args) {
		Person p=new Person();
		/*
		 * ������һ������throws�����쳣�׳��ķ���ʱ��������Ҫ������쳣��
		 * �����ֶ�������:
		 * 1.ʹ��try-catch���񲢴���
		 * 2.�ڵ�ǰ�����ϼ���ʹ��throws�������쳣���׳���
		 */		
		try {
			p.setAge(200);
		} catch (IllegalAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			/*	���÷���:
			e.printStackTrace();//���ٶ�ջ��Ϣ	��ӡ���Ķ�ջ��־��ҵ�������־�ǽ�������һ��ģ�ͨ���Ų��쳣��־��̫���㡣
			
			e.getMessage();//�����쳣����ϸ��Ϣ����	��:FileNotFoundException�쳣����ʱ�����detailMessage�Ͱ�������Ҳ����ļ������֡�
			
			e.getLocalizedMessage();//�������д�˷���,�������ض������Ի�������Ϣ�����ڲ����Ǵ˷��������࣬Ĭ��ʵ�ַ�������ͬ�Ľ�� getMessage()��
			
			e.getCause();//���ؿ��׳�ʱ���ԭ��,���ԭ�򲻴��ڻ�δ֪,����null	
			*/
		}

		System.out.println("����Ϊ:"+p.getAge());
		
		
	}

}
