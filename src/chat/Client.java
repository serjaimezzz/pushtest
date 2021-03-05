package chat;

import java.util.*;
import java.net.Socket;
import java.io.*;
/**
 * �����ҿͻ���:������������
 * @author zhangchi
 */
public class Client {
	/*
	 * java.net.Socket
	 * java�ײ��װ�õ�TCPЭ����net���µ�Socket��
	 * ʹ�����Ϳ��Ի���TCPЭ���������ͨѶ
	 * Socket(�׽���)�������ڿͻ��˵ġ�//�绰,����ͨѶ,ͨ���� 
	 */
 	private Socket socket;
 	/**���췽��:���ڳ�ʼ���ͻ���*/
 	public Client() throws Exception{
 		/*
 		 * public Socket(String host, int port)
 		 * 1.����˵�ַ:IP��ַ(�൱���ܻ�),ͨ��IP��ַ�����ҵ�����˵ļ����
 		 * 2.�˿ں�:(�ֻ�)0~65535,һ��д��λ��,	ps:��Ҫ��ǰ4000:�����е�Ӧ�ó���;ǰ2000:ϵͳ����
 		 * �˿ں�:���߼��ϵĸ���,��������ϵͳ�ҵ�ʹ������ĳ���
 		 * �˿ںŲ����ظ�
 		 */	
 		System.out.println("�������ӷ����...");
 		socket = new Socket("localhost",8088);//�����,����ϵͳ��8088�����ݸ���8088�˿ڵĳ���ʹ��
 		//������IP��ַ:localhost��127.0.0.1(�ض���)
 		
 		System.out.println("�������˽�������!");
 		//ʵ�����Ĺ��̾������ӵĹ���,��Զ�˼����û����Ӧ���׳��쳣
 	}
 	// �����ͻ��˵ķ���
	public void start(){
		try {
			Scanner scan = new Scanner(System.in);
			/*
			 * Socket�ṩ�ķ���:
			 * OutputStream getOutputStream()
			 * ��ȡһ���ֽ������,ͨ������д�������ݻᱻ������Զ�˷�����
			 */
			OutputStream out = socket.getOutputStream();// OS�ǳ�����,�ײ�ͨ��TCPЭ�鴫��Ĺ������������ע
			OutputStreamWriter osw = new OutputStreamWriter(out,"UTF-8");//PW����ָ���ַ���,ͨ��ת����ָ���ַ���
			PrintWriter pw = new PrintWriter(osw,true);//,true���Զ�flush,PW�ǻ�����
			InputStream in = socket.getInputStream();
			InputStreamReader isr = new InputStreamReader(in,"UTF-8");
			BufferedReader br = new BufferedReader(isr);
			/*
			 * ���ַ��������������
			 */
			while(true){
			pw.println(scan.nextLine());
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * ��������
	 */
	public static void main(String[] args) {
		try {
			Client c = new Client();
			c.start();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("�ͻ�������ʧ��!");
		}
	}
	
	
	
}









