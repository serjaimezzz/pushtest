package day09_Thread1;
/**
 * 多线程并发访问同一资源时,就会形成抢的现象.由于线程切换时机不确定,可能导致执行代码顺序的混乱
 * 严重时会导致系统瘫痪
 * @author zhangchi
 *
 */
public class SyncDemo1 {
	public static void main(String[] args) {
		final Table t = new Table();
		
		Thread t1 = new Thread(){
			public void run(){
				while(true){
					int bean = t.getBean();
					Thread.yield();
					System.out.println(getName()+":"+bean);
				}
			}
		};
				
		Thread t2 = new Thread(){
			public void run(){
				while(true){
					int bean = t.getBean();
					Thread.yield();
					System.out.println(getName()+":"+bean);
				}
			}
		};
		
		t1.start();
		t2.start();
		
	}
}

class Table{
	private int beans = 20;
	public synchronized int getBean(){
		if(beans == 0)
			throw new RuntimeException("没有豆子了");
		Thread.yield();
		return beans--;
	}
}