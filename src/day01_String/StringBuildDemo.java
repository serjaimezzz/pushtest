package day01_String;
/**
 * from jdk1.5 һ���ɱ���ַ����У�������֤ͬ��(�̲߳���ȫ)
 * 
 * StringBuilder�ṩ�������޸��ַ������ݵ���ط���
 * ���ڲ�ά������һ���ɱ���ַ����飬�����޸Ķ����ڵ�ǰ�����ڲ���ɵ�
 * ��Ƶ���޸��ַ�������ʱӦ��ʹ�õ�ǰ�������
 * @author zhangchi
 *
 */
public class StringBuildDemo {

	public static void main(String[] args) {
		String str="ѧϰJava";
		/*
		 * ��Stringת��ΪStringBuilder
		 * ����ʹ���вεĹ��췽��
		 * StringBuilderҲ���޲ι��췽����Ĭ�ϱ�ʾ���ַ���
		 */
		
		StringBuilder builder=new StringBuilder(str);
		/*
		 * ��StringBuilder ת��Ϊ String
		 * ʹ��.toString��������
		 */
		str=builder.toString();
		/**
		 * StringBuilder append(String str)
		 * ��ǰ�ַ���ĩβ׷��ָ������
		 * ���ط�������׷���������ݣ���ת��Ϊ�ַ�����׷�ӣ�
		 */
		//0 1234567
		//ѧϰJava��Ϊ���ҹ���
		builder.append("��Ϊ���ҹ���");
		System.out.println(builder.toString());
		
		builder.replace(7, 12,"����Ϊ�˸ı�����"); //�滻����ͷ����β
		System.out.println(builder.toString());
		
		builder.delete(0,7);                     //ɾ��
		System.out.println(builder.toString());
		
		builder.insert(0, "���ţ�");               //����
		System.out.println(builder.toString());
		
		StringBuilder builder1=new StringBuilder("a");//a 
		for(int i=0;i<10;i++){
			builder1.append("c").append("b");
		}
		System.out.println(builder1);
	}

}
