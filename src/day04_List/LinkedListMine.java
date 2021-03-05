package day04_List;

import day04_List.*;
/**
 * 模拟LinkedList
 * Linked:数据结构是链表进行数据结构存储,内存是不连续的,不便于查找,便于数据的增加和删除
 * List:可重复集
 * @author zhangchi
 *
 */
public class LinkedListMine {
	public static void main(String[] args) {
		MyLinkedList my = new MyLinkedList();
		my.add(2);
		my.add(3);
		my.add(4);
		System.out.println(my.get(1));	//获取所给下标的节点数据
//		my.remove(1);
//		System.out.println(my);
		Object obj = my.remove(1);
		System.out.println(obj+","+my.size());
	}	
}

class MyLinkedList{
	
	Node first;	//头节点
	Node last;	//尾节点
	int size;
	
	MyLinkedList(){}
	
	public int size(){
		return size;
	}
	
	//添加数据
	public void add(Object obj){
		if(first == null){	//假设添加的是头节点
			Node node = new Node();
			node.data = obj;
			node.previous = null;
			node.next = null;
			//将添加的节点定义为头节点
			this.first = node;
			this.last = this.first;
			size--;
			return;
		}else{
			Node node = new Node();
			node.data = obj;
			this.last.next = node;	
			node.previous = this.last;//节点的上一个节点是当前节点的头节点
			node.next = null;	//当前节点的下一个节点
			this.last = node;	//将当前节点作为尾节点		
		}
		size++;
	}
	
	//根据下标获取数据
	public Object get(int index){
		Node temp = null;
		if(first != null){	//链表不为空
			temp = this.first;
			for(int i = 0;i < index;i++){
				temp = temp.next;	
			}
			return temp.data;
		}
		return null;
	}
	
	
	//获取给定下标位置的节点数据
	public Node getNode(int index){
		Node temp = null;
		if(first != null){	//链表不为空
			temp = this.first;
			for(int i = 0;i < index;i++){
				temp = temp.next;	
			}
			return temp;	//返回节点
		}
		return null;
	}
	
	//删除节点
	public void removeNode(Node node){
		if(size == 1){	//整个链表只有一个节点
			this.first = null;
			this.last = null;
			size--;
			return;
		}else if(node == this.first){ //假设要删的是头节点
			//设置新的头节点
			this.first = this.first.next;
			first.previous.next = null;//新头节点之前的节点的下一个节点设为null,解除和下一个节点的联系
			first.previous = null;//新头节点之前的节点设为null,解除和上一个节点的联系
		}else if(node == this.last){ //假设删除的是尾节点
			this.last = this.last.previous;	//尾节点的上一个节点设为尾节点
			last.next.previous = null;//要删除节点的上一个节点设为null
			last.next = null;
		}else{
			node.previous.next = node.next;
			node.next.previous = node.previous;
			node.previous = null;
			node.next = null;
		}
		size--;
	}
	
	//根据下标删除节点,返回被删数据
	public Object remove(int index){
		Node node = getNode(index);
		removeNode(node);
		return node.data;
	}

}

class Node{
	Object data; //存放数据
	Node previous;	//前一个节点
	Node next;		//下一个节点
}