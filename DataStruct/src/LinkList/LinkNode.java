package LinkList;

import java.util.LinkedList;

public class LinkNode {
    public Node head; //头结点
    public Node rear;//尾结点
    int size;
  /**
   * 结点类
   *
   */
	private class Node{
		private int data;
		private Node next;
		private Node pre;
	public Node() {
		pre=null;
		next=null; 
		data=0;
	}
	public Node(int data) {
		pre=null;
		next=null;
		this.data=data;
	}
	}
/**
 * 初始化结点
 */
	public LinkNode() {
		this.head=null;
		this.rear=null;
		size=0;
	}
/**
 * 增加结点  头插法
 */
	public void addNodeByHead(int data) {
		Node t=new Node(data);
		if(head==null) {head=t; size++;}
		else {
		t.next=this.head;//内部类的私有变量可以被外部类直接访问
		head.pre=t;
		this.head=t;
		size++;
		}
		
	}
/**
*  增加结点  
*/
	public void addNode(int d) {
		Node t=new Node(d);
		Node p=this.head;
		if(this.head==null)   {head=t;size++;}
		else{
		while(p.next!=null)  p=p.next;
		p.next=t;
		t.pre=p;
		size++;
		}
	}
/**
 * 在指定的位置添加
 */
	public void addNode(int index,int data) {
		Node p=head;
		Node t=new Node(data);
		if(index<0||index>size)
			throw new ArrayIndexOutOfBoundsException();
		for(int i=0;i<index-1;i++) p=p.next;
		if(p.pre==null) {
			p.pre=t;
			t.next=p;
			head=t;
			size++;
		}
		else{
			p.pre.next=t;
			t.pre=p.pre;
			t.next=p;
			p.pre=t;
			size++;
		}	
	}
	
/**
 * 输出
 */
	public void Show() {
		Node p=this.head;
		while(p!=null) {
			System.out.print(p.data+" ");
			p=p.next;
		}
	}
/**
*  删除结点
 * 
*/
	public void remove(int index){
		Node p=head;
		if(index<0||index>size)
			throw new ArrayIndexOutOfBoundsException();
		else if(p==null) 
			throw new NullPointerException();
		else {
		for(int i=0;i<index-1;i++) 
			p=p.next;
		if(p.pre==null) {
			head=p.next;
			size--;
		}
		else {
		p.pre.next=p.next;
		if(p.next==null);
		else p.next.pre=p.pre;
		p=null;
		size--;
		}	
		}
	}
/**
 * 返回长度
 */
	public int getLength() {
		return size;
	}
	
	
	
}
