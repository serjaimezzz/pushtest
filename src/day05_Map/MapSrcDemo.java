package day05_Map;

//import java.util.HashMap.Node;
//import java.util.HashMap.TreeNode;
/**
 * HashMap的put过程
 * @author zhangchi
 *
 */
public class MapSrcDemo {

			//bucket 桶:代表有可能是Map中数组的一个开辟的位置/链表/红黑树。
			//table 数组:Node<K,V> next;内部类
			//TreeNode<K,V>:红黑树	如果挂在节点上的数据多,会导致查询慢

	/**
     * The default initial capacity - MUST be a power of two.
     * HashMap数组的长度是2的整数次幂
     */
		static final int DEFAULT_INITIAL_CAPACITY = 1 << 4; //初始容量 aka 16	bin:10000:位移效率高
		//减少数组扩容移动的位置,只有两个位置可用,提高效率
		
		//经典书籍:算法导论.散列算法认为:不要取2的整数次幂
		/*
		 * 初始容量的取值:
		 * 1.跟hash算法有关
		 * 2.跟扩容有关
		 */
		static final int MAXIMUM_CAPACITY = 1 << 30;//最大容量
		
		static final float DEFAULT_LOAD_FACTOR = 0.75f;	//加载因子,如果是放12个元素,需要提前扩容,提高效率和空间
		
		static final int TREEIFY_THRESHOLD = 8;//树化阈值--链表
				
		static final int MIN_TREEIFY_CAPACITY = 64;//数组最小的容量达到64时,链表的长度是8时,树化
		
		/*
		 * hash算法
		 * (n - 1) & hash = 数组的下标
		 */
		
		/**
			public boolean add(E e) {
		        return map.put(e, PRESENT)==null;
		    }

			public V put(K key, V value) {	//V是key重复时返回的原value值
		        return putVal(hash(key), key, value, false, true);
		    }	
		 
		  static final int hash(Object key) {
	        	int h;
	        	return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);	//让散列更加均匀
	    		}				//元素存放的位置取决于hashCode,散列算法求出hashCode,该值直接影响着散列表的查询性能
		 /*
		  //等价于
		   	int(key == null)
		   		return 0;
		   	int h = 
		  */
		 /**
		
		 final V putVal(int hash, K key, V value, boolean onlyIfAbsent,
                   boolean evict) {
        Node<K,V>[] tab; //数组
        Node<K,V> p; 	//插入数组上的那个节点
        int n, i;	//n为数组长度,i是put放入的位置
        
        if ((tab = table) == null || (n = tab.length) == 0)//判断数组是否为空或者长度为0
            n = (tab = resize()).length;	//进行数组的初始化/扩容
            
        if ((p = tab[i = (n - 1) & hash]) == null)	//根据传入的hash值&(n-1)算出元素存放位置i;null时可以存放
            tab[i] = newNode(hash, key, value, null);//tab[i] =null时插入元素
        else {		//1.重新put相同的key值	2.hash值不一样但是计算出来要放入的位置相同			
        
            Node<K,V> e; 
            K k;
            if (p.hash == hash &&	
                ((k = p.key) == key || (key != null && key.equals(k))))	//k值重复插入  
                e = p;
            else if (p instanceof TreeNode)		//节点上是不是树,是树就把元素添加到树上
                e = ((TreeNode<K,V>)p).putTreeVal(this, tab, hash, key, value);
            else {	//节点上不是树-->是链表
            	
                for (int binCount = 0; ; ++binCount) {
                	                	
                	//e用来遍历链表,判断下一个节点是否为null
                    if ((e = p.next) == null) {		//在链表的尾部添加
                        p.next = newNode(hash, key, value, null);	//构建一个链表
                        if (binCount >= TREEIFY_THRESHOLD - 1) // -1 for 1st	有没有变成树
                            treeifyBin(tab, hash);
                        break;
                    }
                    
                    if (e.hash == hash &&	//判断是否有相同的k值或者相同的hash值
                        ((k = e.key) == key || (key != null && key.equals(k))))
                        break;//	打断e=p.next
                    p = e;
                }
            }
            
            
            if (e != null) { // existing mapping for key
                V oldValue = e.value;
                if (!onlyIfAbsent || oldValue == null)	//送入putValue的boolean值取反为true
                    e.value = value;	//e=p; 是插入数组上的那个节点
                afterNodeAccess(e);
                return oldValue;
            }
        }
        ++modCount;
        if (++size > threshold)	//size大于阈值,扩容
            resize();				//用两对指针解决concurrentHashMap扩容的高并发以及效率问题,该Map是线程安全的,并发安全
        afterNodeInsertion(evict);
        return null;	
    	}
              	
		*/
	
}