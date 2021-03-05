package day05_Map;
/**
 * ����������Ϊ���ϵ�Ԫ��
 * @author zhangchi
 *
 */
public class Point implements Comparable<Point>{	//ʵ��Comparable�ӿ�

	private int x;
	private int y;
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public int getX() {
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
	
	@Override
	public String toString(){
		return "("+x+","+y+")";
	}
	
	/**
	 * ��ʵ����Comparable�ӿں���Ҫ��д����ķ�����
	 * �÷����������Ƕ��嵱ǰ�����������������Ƚϴ�С�Ĺ���
	 * ����ֵΪһ��intֵ����ֵ��ʾ��С��ϵ��������ע�����ȡֵ�Ƕ��٣�����ע����ȡֵ��Χ
	 * ������ֵ>0ʱ:��ǰ����Ȳ��������
	 * ������ֵ<0ʱ:��ǰ����Ȳ�������С��
	 * ������ֵ=0ʱ:����������ȡ�
	 */
	@Override
	public int compareTo(Point o) {
		/*
		 * �ȽϹ���:�㵽ԭ��ľ��볤�Ĵ�
		 */
		int len = this.x * this.x + this.y * this.y;
		int olen = o.x * o.x + o.y * o.y;
		return len - olen;
	}
	
	
	
}
