package chat;

import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.*;
/**
 * 聊天室服务器
 * @author zhangchi
 */
public class Server {
	/*
	 * 运行在服务端的ServerSocket主要负责:
	 * 1.向系统申请服务端口
	 * 	客户端就是通过这个端口与之连接的
	 * 2.监听申请的服务端口,当一个客户端通过该端口尝试建立连接时,ServerSocket会
	 * 	在服务端再单独创建一个Socket与客户端建立连接。
	 */
	private ServerSocket s;
	//构造方法:用来初始化服务端
	public Server()throws Exception{
		//初始化的同时申请服务端口
		s = new ServerSocket(8088);//要开启的服务端口,如果该端口被占用,会报错
	}
	
	public static void main(String[] args) {
		try {
			Server s = new Server();
			s.start();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("服务端启动失败!");
		}
	}
	//服务端开始工作的方法
	public void start(){
		try {
			/*
			 * 监听服务端口,直到一个客户端连接并创建一个Socket,
			 * 使用该Socket即可与刚连接的客户端进行交互
			 */
			while(true){
			System.out.println("等待客户端连接");
			Socket socket = s.accept();//阻塞方法,执行到此处就 卡住了,服务端就开始监听8088端口,直到客户端建立连接
			//每次感知一个客户端的连接都需要调用一次accept()
			System.out.println("一个客户端连接了");
			/*
			 * 启动一个线程,来完成与该客户端的交互
			 */ 
			ClientHandler handler = new ClientHandler(socket);
			Thread t = new Thread(handler);
			t.start();
			}			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * 该线程负责处理一个客户端的交互
	 */
	class ClientHandler implements Runnable{//内部类创建线程
		//该线程负责处理客户端的Socket
		private Socket socket;
		
		//记录客户端的IP地址信息
		private String host;
		
		public ClientHandler(Socket socket){
			this.socket = socket;
			/*
			 * 通过Socket可以获取远端客户端的地址信息
			 * InetAddress getInetAddress()
			 */
			InetAddress addr = socket.getInetAddress();
			host = addr.getHostAddress();//获取客户端的IP地址信息
		}
		public void run(){
			try {
				System.out.println(host + "上线了!");
				/*
				 * Socket提供的方法
				 * InputStream getInputStream()
				 * 该方法可以获取一个输入流,从该流读取的数据就是从远端客户端发送过来的
				 */
				InputStream in = socket.getInputStream();
				InputStreamReader isr = new InputStreamReader(in,"UTF-8");
				BufferedReader br = new BufferedReader(isr);
				/*
				 * 通过Socket创建输出流用于将消息发送给客户端
				 */
				OutputStream out = socket.getOutputStream();
				OutputStreamWriter osw = new OutputStreamWriter(out,"UTF-8");
				PrintWriter pw = new PrintWriter(osw,true);
				//String message = br.readLine();//一次读取一行
				String message = null;
				/*
				 * br.readLine()在读取客户端发送过来的消息时,由于客户端断线,而其操作系统的不同,
				 * 读取到的结果不同:
				 * 1.windows的客户端断开时: 抛出异常
				 * 2.Linux的客户端断开时:br.readLine()会返回NULL
				 */
				while((message = br.readLine()) != null){
//					System.out.println(host + "说:" + message);
					pw.println(host+"说:"+message);
				}				
			} catch (Exception e) {
				e.printStackTrace();
			}finally{
				/*
				 * 处理当前客户端断开后的逻辑
				 */
				System.out.println(host+"下线了!");
				try {
					socket.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
}


