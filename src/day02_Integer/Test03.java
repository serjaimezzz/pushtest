package day02_Integer;
/**
 * ��г����
 * @author zhangchi
 *
 */
public class Test03 {

	public static void main(String[] args) {
		String regex="(cnm|SB|NC|tmd)";
		String message="��cnm!�����SB!NC����tmd!";
		 message=message.replaceAll(regex, "**");
		 System.out.println(message);
	}

}
