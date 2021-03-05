package day04_List;
/**
 * ���ͣ�Ҳ�в��������ͣ��ǽ���ǰ������Ե����ͣ����������������Լ���������ֵ�����͵Ķ���Ȩ
 * ����ʹ���ߡ�ʹ�����ڴ�����ǰ���ͬʱ�����͵�ʵ�����ʹ���
 * 
 * @author zhangchi
 *
 * @param <T>
 */
public class Point<T> {	//���ֲ����ڵ�һλ��
	private T x;
	private T y;
	//�Ҽ�source-Generator Constructor using Fields...�Զ����ɹ��췽��
	public Point(T x, T y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	//�Ҽ�-source-generate Getters and Setters�Զ����ɽ�����
	
	public T getX() {
		return x;
	}
	public void setX(T x) {
		this.x = x;
	}
	public T getY() {
		return y;
	}
	public void setY(T y) {
		this.y = y;
	}
	
	public String toString(){
		return "("+x+","+y+")";
	}
	
}
