package day05_Map;

//import java.util.HashMap.Node;
//import java.util.HashMap.TreeNode;
/**
 * HashMap��put����
 * @author zhangchi
 *
 */
public class MapSrcDemo {

			//bucket Ͱ:�����п�����Map�������һ�����ٵ�λ��/����/�������
			//table ����:Node<K,V> next;�ڲ���
			//TreeNode<K,V>:�����	������ڽڵ��ϵ����ݶ�,�ᵼ�²�ѯ��

	/**
     * The default initial capacity - MUST be a power of two.
     * HashMap����ĳ�����2����������
     */
		static final int DEFAULT_INITIAL_CAPACITY = 1 << 4; //��ʼ���� aka 16	bin:10000:λ��Ч�ʸ�
		//�������������ƶ���λ��,ֻ������λ�ÿ���,���Ч��
		
		//�����鼮:�㷨����.ɢ���㷨��Ϊ:��Ҫȡ2����������
		/*
		 * ��ʼ������ȡֵ:
		 * 1.��hash�㷨�й�
		 * 2.�������й�
		 */
		static final int MAXIMUM_CAPACITY = 1 << 30;//�������
		
		static final float DEFAULT_LOAD_FACTOR = 0.75f;	//��������,����Ƿ�12��Ԫ��,��Ҫ��ǰ����,���Ч�ʺͿռ�
		
		static final int TREEIFY_THRESHOLD = 8;//������ֵ--����
				
		static final int MIN_TREEIFY_CAPACITY = 64;//������С�������ﵽ64ʱ,����ĳ�����8ʱ,����
		
		/*
		 * hash�㷨
		 * (n - 1) & hash = ������±�
		 */
		
		/**
			public boolean add(E e) {
		        return map.put(e, PRESENT)==null;
		    }

			public V put(K key, V value) {	//V��key�ظ�ʱ���ص�ԭvalueֵ
		        return putVal(hash(key), key, value, false, true);
		    }	
		 
		  static final int hash(Object key) {
	        	int h;
	        	return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);	//��ɢ�и��Ӿ���
	    		}				//Ԫ�ش�ŵ�λ��ȡ����hashCode,ɢ���㷨���hashCode,��ֱֵ��Ӱ����ɢ�б�Ĳ�ѯ����
		 /*
		  //�ȼ���
		   	int(key == null)
		   		return 0;
		   	int h = 
		  */
		 /**
		
		 final V putVal(int hash, K key, V value, boolean onlyIfAbsent,
                   boolean evict) {
        Node<K,V>[] tab; //����
        Node<K,V> p; 	//���������ϵ��Ǹ��ڵ�
        int n, i;	//nΪ���鳤��,i��put�����λ��
        
        if ((tab = table) == null || (n = tab.length) == 0)//�ж������Ƿ�Ϊ�ջ��߳���Ϊ0
            n = (tab = resize()).length;	//��������ĳ�ʼ��/����
            
        if ((p = tab[i = (n - 1) & hash]) == null)	//���ݴ����hashֵ&(n-1)���Ԫ�ش��λ��i;nullʱ���Դ��
            tab[i] = newNode(hash, key, value, null);//tab[i] =nullʱ����Ԫ��
        else {		//1.����put��ͬ��keyֵ	2.hashֵ��һ�����Ǽ������Ҫ�����λ����ͬ			
        
            Node<K,V> e; 
            K k;
            if (p.hash == hash &&	
                ((k = p.key) == key || (key != null && key.equals(k))))	//kֵ�ظ�����  
                e = p;
            else if (p instanceof TreeNode)		//�ڵ����ǲ�����,�����Ͱ�Ԫ����ӵ�����
                e = ((TreeNode<K,V>)p).putTreeVal(this, tab, hash, key, value);
            else {	//�ڵ��ϲ�����-->������
            	
                for (int binCount = 0; ; ++binCount) {
                	                	
                	//e������������,�ж���һ���ڵ��Ƿ�Ϊnull
                    if ((e = p.next) == null) {		//�������β�����
                        p.next = newNode(hash, key, value, null);	//����һ������
                        if (binCount >= TREEIFY_THRESHOLD - 1) // -1 for 1st	��û�б����
                            treeifyBin(tab, hash);
                        break;
                    }
                    
                    if (e.hash == hash &&	//�ж��Ƿ�����ͬ��kֵ������ͬ��hashֵ
                        ((k = e.key) == key || (key != null && key.equals(k))))
                        break;//	���e=p.next
                    p = e;
                }
            }
            
            
            if (e != null) { // existing mapping for key
                V oldValue = e.value;
                if (!onlyIfAbsent || oldValue == null)	//����putValue��booleanֵȡ��Ϊtrue
                    e.value = value;	//e=p; �ǲ��������ϵ��Ǹ��ڵ�
                afterNodeAccess(e);
                return oldValue;
            }
        }
        ++modCount;
        if (++size > threshold)	//size������ֵ,����
            resize();				//������ָ����concurrentHashMap���ݵĸ߲����Լ�Ч������,��Map���̰߳�ȫ��,������ȫ
        afterNodeInsertion(evict);
        return null;	
    	}
              	
		*/
	
}