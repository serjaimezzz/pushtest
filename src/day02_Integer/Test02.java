package day02_Integer;
/**
 * ͼƬ������ ���ݵ�ǰʱ�� ���� .split������
 * @author zhangchi
 *
 */
public class Test02 {

	public static void main(String[] args) {
		String imgName="1.jpg";
		String names[]=imgName.split("\\.");
		imgName=System.currentTimeMillis()+"."+names[1];
		System.out.println(imgName);
		
		imgName=imgName.replaceAll(".+\\.", System.currentTimeMillis()+".");
		//�滻��.jpgǰ�������ַ�
		System.out.println(imgName);
	}

}
