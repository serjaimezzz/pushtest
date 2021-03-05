package day08_Exception;
/**
 * Exception常用方法
 * @author zhangchi
 *
 */
public class ExceptionDemo6 {

	public static void main(String[] args) {
		System.out.println("result:" + Test());
	}	
	private static int Test(){
		int t = 1;
		try{
			System.out.println("execute try,t:" + t);//执行try:1
			return ++t;//return 2
		}catch(Exception e){
			System.out.println("execute catch,t:" + t);//发生异常,1
			return ++t;//2
		}finally{
			System.out.println("execute finally,t:" + t);//1
			++t;//2
		}
	}
	/*
	 * 1.finally是在return后面的表达式运算完后再执行的。
	 * （此时并没有返回运算后的值，而是先把要返回的值保存起来，若finally中无return，则不管finally中的代码怎么样，
	 * 	返回的值都不会改变，仍然是之前保存的值），该情况下函数返回值是在finally执行前确定的)
	 * 2.finally部分就不要return了，要不然，就回不去try或者catch的return了。
	 */
}
