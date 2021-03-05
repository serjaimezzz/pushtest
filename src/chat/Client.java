package chat;

import java.util.*;
import java.net.Socket;
import java.io.*;
/**
 * 聊天室客户端:主动发起连接
 * @author zhangchi
 */
public class Client {
	/*
	 * java.net.Socket
	 * java底层封装好的TCP协议在net包下的Socket类
	 * 使用它就可以基于TCP协议进行网络通讯
	 * Socket(套接字)是运行在客户端的。//电话,建立通讯,通话。 
	 */
 	private Socket socket;
 	/**构造方法:用于初始化客户端*/
 	public Client() throws Exception{
 		/*
 		 * public Socket(String host, int port)
 		 * 1.服务端地址:IP地址(相当于总机),通过IP地址可以找到服务端的计算机
 		 * 2.端口号:(分机)0~65535,一般写四位数,	ps:不要用前4000:绑定流行的应用程序;前2000:系统服务
 		 * 端口号:是逻辑上的概念,帮助操作系统找到使用网络的程序
 		 * 端口号不能重复
 		 */	
 		System.out.println("正在连接服务端...");
 		socket = new Socket("localhost",8088);//服务端,操作系统把8088的数据给到8088端口的程序使用
 		//本机的IP地址:localhost或127.0.0.1(特定的)
 		
 		System.out.println("已与服务端建立连接!");
 		//实例化的过程就是连接的过程,若远端计算机没有相应会抛出异常
 	}
 	// 启动客户端的方法
	public void start(){
		try {
			Scanner scan = new Scanner(System.in);
			/*
			 * Socket提供的方法:
			 * OutputStream getOutputStream()
			 * 获取一个字节输出流,通过该流写出的数据会被发送至远端服务器
			 */
			OutputStream out = socket.getOutputStream();// OS是抽象类,底层通过TCP协议传输的过程我们无需关注
			OutputStreamWriter osw = new OutputStreamWriter(out,"UTF-8");//PW不能指定字符集,通过转换流指定字符集
			PrintWriter pw = new PrintWriter(osw,true);//,true可自动flush,PW是缓冲流
			InputStream in = socket.getInputStream();
			InputStreamReader isr = new InputStreamReader(in,"UTF-8");
			BufferedReader br = new BufferedReader(isr);
			/*
			 * 将字符串发送至服务端
			 */
			while(true){
			pw.println(scan.nextLine());
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * 程序的入口
	 */
	public static void main(String[] args) {
		try {
			Client c = new Client();
			c.start();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("客户端启动失败!");
		}
	}
	
	
	
}









