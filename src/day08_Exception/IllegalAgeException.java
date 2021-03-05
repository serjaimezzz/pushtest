package day08_Exception;
/**
 * 年龄不合法异常
 * 
 * 自定义异常，通常是用来描述某个业务逻辑上出现的问题。
 * 自定义异常的名字应当做到见名知意。
 * @author zhangchi
 *
 */
public class IllegalAgeException extends Exception{//Exception提供了很多构造方法:Source-Generate Constructors from SuperClass自动调用
	/**所有的异常都可以序列化
	 * 序列化:Serializable类中的版本控件
	 * 如果没有显式声明serialVersionUID，JVM将根据您的Serializable类的各个方面自动为您执行此操作
	 * 
	 * 默认的serialVersionUID计算对类详细信息非常敏感，可能因不同的JVM实现而异，并且在反序列化过程中会导致意外的InvalidClassExceptions。
	 * 
	 * - 客户端在Windows中使用SUN的JVM。
	 * - 服务器在Linux中使用JRockit。
	 * 
	 *	客户端通过套接字向服务器发送带有默认生成的serialVersionUID（例如123L）的可序列化类，服务器可以在反序列化过程中生成不同的serialVersionUID（例如124L），
	 *	并引发意外的InvalidClassExceptions。
	 */
	private static final long serialVersionUID = 1L;	//版本号	SUN强烈建议开发人员声明serialVersionUID以避免上面列出的不同JVM问题

	public IllegalAgeException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public IllegalAgeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public IllegalAgeException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public IllegalAgeException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public IllegalAgeException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	
}
