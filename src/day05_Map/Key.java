package day05_Map;
/**
 * ��һ�����ʵ����ΪHashMap��keyʱ������equals������hashcode��������д
 * ֱ��Ӱ����ɢ�б�(HashMap)�Ĳ�ѯ���ܡ�
 * ��API�ĵ���Object����������������д����˵��:
 * ��������дһ�����equals����ʱ,��Ӧ����ͬ��дhashcode������
 * 
 * ��������д����Ӧ��ѭ:
 * 1.һ���ԡ�����������equals�Ƚ�Ϊtrueʱ��hashcode�������ص����ֱ�����ȡ�
 *   ��������Ȼ���Ǳ���ģ���ҲӦ����ѭ��������HashMap�л��γ�����Ӱ���ѯ���ܡ�
 *   ������������hashcodeֵ��ͬ��equals�Ƚ�ҲӦ��Ϊtrue��
 *   
 * 2.�ȶ��ԡ�hashcode������ε��ú󷵻ص�����Ӧ����ͬ����Ӧ��һ���仯��ֵ��
 *   ���ǲ���equals�Ƚϵ�����ֵ�����˸ı䡣  
 * @author zhangchi
 *
 */
public class Key {
	private int x;
	private int y;
	public Key(int x, int y) {
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
	
	//�Ҽ�-source-Generate hashcode() and equals()
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Key other = (Key) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
	
	
}
