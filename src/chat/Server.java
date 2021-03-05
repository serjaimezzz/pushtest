package chat;

import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.*;
/**
 * �����ҷ�����
 * @author zhangchi
 */
public class Server {
	/*
	 * �����ڷ���˵�ServerSocket��Ҫ����:
	 * 1.��ϵͳ�������˿�
	 * 	�ͻ��˾���ͨ������˿���֮���ӵ�
	 * 2.��������ķ���˿�,��һ���ͻ���ͨ���ö˿ڳ��Խ�������ʱ,ServerSocket��
	 * 	�ڷ�����ٵ�������һ��Socket��ͻ��˽������ӡ�
	 */
	private ServerSocket s;
	//���췽��:������ʼ�������
	public Server()throws Exception{
		//��ʼ����ͬʱ�������˿�
		s = new ServerSocket(8088);//Ҫ�����ķ���˿�,����ö˿ڱ�ռ��,�ᱨ��
	}
	
	public static void main(String[] args) {
		try {
			Server s = new Server();
			s.start();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("���������ʧ��!");
		}
	}
	//����˿�ʼ�����ķ���
	public void start(){
		try {
			/*
			 * ��������˿�,ֱ��һ���ͻ������Ӳ�����һ��Socket,
			 * ʹ�ø�Socket����������ӵĿͻ��˽��н���
			 */
			while(true){
			System.out.println("�ȴ��ͻ�������");
			Socket socket = s.accept();//��������,ִ�е��˴��� ��ס��,����˾Ϳ�ʼ����8088�˿�,ֱ���ͻ��˽�������
			//ÿ�θ�֪һ���ͻ��˵����Ӷ���Ҫ����һ��accept()
			System.out.println("һ���ͻ���������");
			/*
			 * ����һ���߳�,�������ÿͻ��˵Ľ���
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
	 * ���̸߳�����һ���ͻ��˵Ľ���
	 */
	class ClientHandler implements Runnable{//�ڲ��ഴ���߳�
		//���̸߳�����ͻ��˵�Socket
		private Socket socket;
		
		//��¼�ͻ��˵�IP��ַ��Ϣ
		private String host;
		
		public ClientHandler(Socket socket){
			this.socket = socket;
			/*
			 * ͨ��Socket���Ի�ȡԶ�˿ͻ��˵ĵ�ַ��Ϣ
			 * InetAddress getInetAddress()
			 */
			InetAddress addr = socket.getInetAddress();
			host = addr.getHostAddress();//��ȡ�ͻ��˵�IP��ַ��Ϣ
		}
		public void run(){
			try {
				System.out.println(host + "������!");
				/*
				 * Socket�ṩ�ķ���
				 * InputStream getInputStream()
				 * �÷������Ի�ȡһ��������,�Ӹ�����ȡ�����ݾ��Ǵ�Զ�˿ͻ��˷��͹�����
				 */
				InputStream in = socket.getInputStream();
				InputStreamReader isr = new InputStreamReader(in,"UTF-8");
				BufferedReader br = new BufferedReader(isr);
				/*
				 * ͨ��Socket������������ڽ���Ϣ���͸��ͻ���
				 */
				OutputStream out = socket.getOutputStream();
				OutputStreamWriter osw = new OutputStreamWriter(out,"UTF-8");
				PrintWriter pw = new PrintWriter(osw,true);
				//String message = br.readLine();//һ�ζ�ȡһ��
				String message = null;
				/*
				 * br.readLine()�ڶ�ȡ�ͻ��˷��͹�������Ϣʱ,���ڿͻ��˶���,�������ϵͳ�Ĳ�ͬ,
				 * ��ȡ���Ľ����ͬ:
				 * 1.windows�Ŀͻ��˶Ͽ�ʱ: �׳��쳣
				 * 2.Linux�Ŀͻ��˶Ͽ�ʱ:br.readLine()�᷵��NULL
				 */
				while((message = br.readLine()) != null){
//					System.out.println(host + "˵:" + message);
					pw.println(host+"˵:"+message);
				}				
			} catch (Exception e) {
				e.printStackTrace();
			}finally{
				/*
				 * ����ǰ�ͻ��˶Ͽ�����߼�
				 */
				System.out.println(host+"������!");
				try {
					socket.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
}


