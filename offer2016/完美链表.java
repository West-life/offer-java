package offer2016;
import java.util.Scanner;
public class Main {
	static MyLinkedList head=null;
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(cin.hasNextInt()){
			int addTotal=cin.nextInt();
			try {
				while(addTotal-->0){
					head=add(head,cin.nextInt());
				}
				System.out.println(getRes(head));
				int insertIndex=cin.nextInt();
				int insertVal=cin.nextInt();
				head=insert(head,insertVal,insertIndex);
				System.out.println(getRes(head));
				int deleteIndex=cin.nextInt();
				head=delete(head,deleteIndex);
				System.out.println(getRes(head));
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
			}
		}
	}
	public static String getRes(MyLinkedList head){
		String res="";
		MyLinkedList node=head;
		while(node!=null){
			res +=node.val+" ";
			node=node.next;
		}
		return res.trim();
	}
	
	public static MyLinkedList add(MyLinkedList head,int val)throws Exception{
		if(head==null){
			head=new MyLinkedList(val);
			return head;
		}
		MyLinkedList node=head;
		while(node.next!=null){
			node=node.next;
		}
		MyLinkedList newNode=new MyLinkedList(val);
		node.next=newNode;
		return head;
	}
	public static MyLinkedList insert(MyLinkedList head,int val,int index)throws Exception{
		if(head==null||index<0){
			throw new Exception("error");
		}
		MyLinkedList node=head;
		MyLinkedList preNode=new MyLinkedList(0);
		preNode.next=head;
		MyLinkedList newNode=new MyLinkedList(val);
		if(index==0){
			newNode.next=head;
			return newNode;
		}
		int count=0;
		while(node.next!=null&&count<index){
			preNode=preNode.next;
			node=node.next;
			count++;
		}
		if(node.next==null&&count<index){
			throw new Exception("error");
		}
		
		preNode.next=newNode;
		newNode.next=node;
		return head;
	}
	public static MyLinkedList delete(MyLinkedList head,int index)throws Exception{
		if(head==null||index<0){
			throw new Exception("error");
		}
		MyLinkedList node=head;
		MyLinkedList preNode=new MyLinkedList(0);
		preNode.next=node;
		if(index==0){
			return head.next;
		}
		int count=0;
		while(node.next!=null&&count<index){
			preNode=preNode.next;
			node=node.next;
			count++;
		}
		if(node.next==null&&count<index){
			throw new Exception("error");
		}
		preNode.next=node.next;
		return head;
	}
	
}

class MyLinkedList{
	int val;
	MyLinkedList  next=null;
	public MyLinkedList(int val){
		this.val=val;
	}
}
