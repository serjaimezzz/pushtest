package day09_Thread;
/**
 * �ػ��̣߳��ֳƺ�̨�߳�
 * ��һ�������е�����ǰ̨�̶߳�����ʱ�����̾�Ҫ�����������к�̨�߳����У���ô��̨�̻߳ᱻǿ�ƽ�����
 * @author zhangchi
 *
 */
public class ThreadDemo8 {

	public static void main(String[] args) {  //mainҲ��ǰ̨�߳�
		//ǰ̨�߳�
		Thread rose=new Thread(){
			public void run(){
				for(int i=0;i<10;i++){
					System.out.println("rose:let me go!");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}
				}
				System.out.println("����������aaaa!!!");
				System.out.println("��Ч:��ͨ��ͨ...");
			}
		};
		
		Thread jack=new Thread(){
			public void run(){
				while(true){
					System.out.println("jack:u jump!I jump!!");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}
				}
			}
		};
		
		//����Ϊ��̨�̣߳�����Ҫ��startǰ����
		jack.setDaemon(true);
		
		rose.start();
		jack.start();
		
	//	while(true);//main�������߳�û��������̨�߳�jack����ҵ�
		
	}
}
