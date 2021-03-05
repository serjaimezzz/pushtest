package day07_Stream;

import java.io.Serializable;
import java.util.List;

/**
 * �������ڲ�����Ϊ������Object I/O Stream��д����ʹ��
 * ��һ������Ҫ����������д����ô�������ʵ��java.io.Serializable�ӿ�
 * @author zhangchi
 *
 */
/*
 * һ������Ҫ��־û�,����Ҫ����������ʵ��Serializable�ӿ�,��ǽӿ�
 * ʵ���ϱ���������.class�ļ�ʱ,������������һЩ����,���ڽ����е�����תΪ�ֽ�(ʹ���������ע,������ʵ��)
 */
public class Person implements Serializable{//ǩ���ӿڣ�֪ͨ�����������������ת�����ֽڵķ������ϡ�Ϊ�˹淶/Լ���������Ϊ��
	/**
	 * ��һ����ʵ����Serializable�ӿں�Ӧ�����һ������serialVersionUID��
	 * �ó���Ϊ��ǰ������л��汾�ţ���������ϵͳ����ݵ�ǰ��Ľṹ���ɣ�����ֻҪ��Ľṹ�����ı䣬�汾��Ҳ����Ӧ�����ı䡣
	 * 
	 * �汾��Ӱ���ŷ����л��Ľ������:
	 * ��OIS��һ��������з����л�ʱ������ö�������İ汾�Ƿ�һ�£�
	 * ��һ��:�����л��ɹ����������ö�������Ľṹ��һ��ʱ������ü���ģʽ���ܻ�ԭ�����Զ���ԭ��
	 * ����һ��:�����л�ֱ���׳��汾��һ���쳣
	 */
	/*
	 * ���������,ϵͳ���Զ�����һ��Ĭ�ϵ����к�  
	 * stream classdesc serialVersionUID = 1	���ݸ����кŲ�����Ҫ�õ����ֽ����ļ�
	 * local class serialVersionUID = 6301891087688367538 ---���δ�Զ���UID,�ļ�����֮������ɵ������к�
	 */
	private static final long serialVersionUID = 1L;//���л��汾�ţ���������Լ�����Ļ�����ݽṹ�ĸı���ı�
	public String name;
	private int age;
	private String gender;
	/*
	 * transient�ؼ��������������ԣ�Ĭ��ֵΪnull,������һЩ��ʱ�Ե�����
	 * �������κ󣬸���ʵ����ʹ��OOS���ж������л�ʱ��������ֵ�����ԣ��Ӷ��ﵽ����"����"��Ŀ��
	 */
	private transient List<String> otherInfo;	//������Ϊ˲̬transient�Ĳ��������л�
	
	public Person(){
		
	}
	public Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	public Person(String name, int age, String gender, List<String> otherInfo) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.otherInfo = otherInfo;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public List<String> getOtherInfo() {
		return otherInfo;
	}

	public void setOtherInfo(List<String> otherInfo) {
		this.otherInfo = otherInfo;
	}

	@Override
	public String toString(){
		return name+","+age+","+gender+","+otherInfo;
	}
	
}
