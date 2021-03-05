package day04_List;

import day04_List.*;
/**
 * ģ��LinkedList
 * Linked:���ݽṹ������������ݽṹ�洢,�ڴ��ǲ�������,�����ڲ���,�������ݵ����Ӻ�ɾ��
 * List:���ظ���
 * @author zhangchi
 *
 */
public class LinkedListMine {
	public static void main(String[] args) {
		MyLinkedList my = new MyLinkedList();
		my.add(2);
		my.add(3);
		my.add(4);
		System.out.println(my.get(1));	//��ȡ�����±�Ľڵ�����
//		my.remove(1);
//		System.out.println(my);
		Object obj = my.remove(1);
		System.out.println(obj+","+my.size());
	}	
}

class MyLinkedList{
	
	Node first;	//ͷ�ڵ�
	Node last;	//β�ڵ�
	int size;
	
	MyLinkedList(){}
	
	public int size(){
		return size;
	}
	
	//�������
	public void add(Object obj){
		if(first == null){	//������ӵ���ͷ�ڵ�
			Node node = new Node();
			node.data = obj;
			node.previous = null;
			node.next = null;
			//����ӵĽڵ㶨��Ϊͷ�ڵ�
			this.first = node;
			this.last = this.first;
			size--;
			return;
		}else{
			Node node = new Node();
			node.data = obj;
			this.last.next = node;	
			node.previous = this.last;//�ڵ����һ���ڵ��ǵ�ǰ�ڵ��ͷ�ڵ�
			node.next = null;	//��ǰ�ڵ����һ���ڵ�
			this.last = node;	//����ǰ�ڵ���Ϊβ�ڵ�		
		}
		size++;
	}
	
	//�����±��ȡ����
	public Object get(int index){
		Node temp = null;
		if(first != null){	//����Ϊ��
			temp = this.first;
			for(int i = 0;i < index;i++){
				temp = temp.next;	
			}
			return temp.data;
		}
		return null;
	}
	
	
	//��ȡ�����±�λ�õĽڵ�����
	public Node getNode(int index){
		Node temp = null;
		if(first != null){	//����Ϊ��
			temp = this.first;
			for(int i = 0;i < index;i++){
				temp = temp.next;	
			}
			return temp;	//���ؽڵ�
		}
		return null;
	}
	
	//ɾ���ڵ�
	public void removeNode(Node node){
		if(size == 1){	//��������ֻ��һ���ڵ�
			this.first = null;
			this.last = null;
			size--;
			return;
		}else if(node == this.first){ //����Ҫɾ����ͷ�ڵ�
			//�����µ�ͷ�ڵ�
			this.first = this.first.next;
			first.previous.next = null;//��ͷ�ڵ�֮ǰ�Ľڵ����һ���ڵ���Ϊnull,�������һ���ڵ����ϵ
			first.previous = null;//��ͷ�ڵ�֮ǰ�Ľڵ���Ϊnull,�������һ���ڵ����ϵ
		}else if(node == this.last){ //����ɾ������β�ڵ�
			this.last = this.last.previous;	//β�ڵ����һ���ڵ���Ϊβ�ڵ�
			last.next.previous = null;//Ҫɾ���ڵ����һ���ڵ���Ϊnull
			last.next = null;
		}else{
			node.previous.next = node.next;
			node.next.previous = node.previous;
			node.previous = null;
			node.next = null;
		}
		size--;
	}
	
	//�����±�ɾ���ڵ�,���ر�ɾ����
	public Object remove(int index){
		Node node = getNode(index);
		removeNode(node);
		return node.data;
	}

}

class Node{
	Object data; //�������
	Node previous;	//ǰһ���ڵ�
	Node next;		//��һ���ڵ�
}