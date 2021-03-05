package day02_Integer;
/**
 * 图片重命名 根据当前时间 进行 .split的运用
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
		//替换掉.jpg前的任意字符
		System.out.println(imgName);
	}

}
