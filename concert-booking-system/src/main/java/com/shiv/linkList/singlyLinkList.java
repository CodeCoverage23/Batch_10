package com.shiv.linkList;

public class singlyLinkList {
	

public Node head=null;
public Node tail=null;

public void addNode(int d){
	Node newNode = new Node(d);
	
	if(head == null){
		head = newNode;
		tail = newNode;
	}else{
		tail.next = newNode;
		tail = newNode;
	}
}
public void display(){
	Node current = head;
	if(head == null){
		System.out.println("list is empty");
		return;
	}
while(current!=null){
		System.out.print(current.data+" ");
		current = current.next;
	}
System.out.println();
}

public Node roatedRight(int k){
	
	if(head==null || head.next==null || k==0){
		return head;
	}
	
	Node cur =head;
	int len =1;
	
	while(cur.next!=null){
		len++;
		cur=cur.next;
	}
	cur.next = head;
	k=k%len;
	k=len-k;
	
	while(k-- >0){
		cur = cur.next;
	}
	head= cur.next;
	cur.next = null;
	return head;
}

public void reverse(Node cur){
	
		if(cur.next==null){
			System.out.print(cur.data +" ");
			return;
			
		}
		
		reverse(cur.next); //recurcive function;
		System.out.print(cur.data +" ");
	
	
}
public static void main(String args[]){
	singlyLinkList list = new singlyLinkList();
	
	list.addNode(10);
	list.addNode(20);
	list.addNode(30);
	list.addNode(40);
	list.addNode(50);
	list.display();
	//list.roatedRight(2);
	list.reverse(list.head);
	//list.display();
}
}
class Node{
	int data;
	Node next;
	public Node(int data) {
		this.data = data;
		this.next = null;
	}
	
}
