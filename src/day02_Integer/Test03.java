package day02_Integer;
/**
 * 和谐用语
 * @author zhangchi
 *
 */
public class Test03 {

	public static void main(String[] args) {
		String regex="(cnm|SB|NC|tmd)";
		String message="我cnm!你这个SB!NC！！tmd!";
		 message=message.replaceAll(regex, "**");
		 System.out.println(message);
	}

}
