package day02_Integer;
/**
 * ʹ�ø���������Object��ط�������д
 * �����ÿһ��ʵ����ʾֱ������ϵ�ϵ�һ����
 * @author zhangchi
 *
 */
public class Point {
	private int x;  //����˽�л�����Ϊ������
	private int y;
	public int getX() {  //�Ҽ�-source-generate Getters and Setters�Զ�����
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public Point(){
		
	}
	
	public Point(int x,int y){
		this.x=x;
		this.y=y;
		
	}
/**
 * ͨ������Ҫʹ��һ���Լ���������toString����ʱӦ����д�÷�����
 * Object �����toString�������ص��ǣ�����@��ַ������ַ�����ʵ������
 * ��д�÷����󣬷��ص��ַ���û���ϸ�ĸ�ʽҪ�󣬽������Ը������������
 * ��ɱԭ���ϸ��ַ�����Ӧ��������ǰ�����������Ϣ
 * ֻ�������Զ��������Ҫ��д�÷�����JAVA API�ṩ����ͨ�����Ѿ���д�˸÷�����
 */
	public String toString(){
		return "(" + x + "," + y + ")";
	}
	
/**
 * ͨ������������Ҫʹ��һ���Լ���������equals����ʱ����Ӧ����д����
 * equals�����������ǱȽϵ�ǰ������������������Ƿ�һ������������
 * Object�ṩ��equals�����ڲ�������"=="ʵ�ֵģ�����û������
 * equals�Ƚ�ʽ��һ��Ҫ����������ֵ��Ҫ��ͬ����Ҫ���ʵ�����������
 * ֻ���Լ����������Ҫ��д��JAVA API�ṩ��������϶��Ѿ���д��equals
 */
	public boolean equals(Object obj){  //��дequals
		
		if(obj==null){
			return false;
		}
		if(obj==this){
			return true;
		}
		if(obj instanceof Point){//�ж϶����Point�Ƿ�����ͬ����
			Point p=(Point)obj;
			return this.x==p.x && this.y==p.y;
		}
		return false;
	}
	
	
}
