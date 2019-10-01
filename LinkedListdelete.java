package linkedlist;
public class LinkedList { 
	Node head; 
	static class Node { 
		int data; 
		Node next; 
		Node(int d) 
		{ 
			data = d; 
			next = null; 
		} 
	} 
	public static LinkedList insert(LinkedList list, int data) 
	{ 
		Node new_node = new Node(data); 
		new_node.next = null; 
		if (list.head == null) { 
			list.head = new_node; 
		} 
		else { 
			Node last = list.head; 
			while (last.next != null) { 
				last = last.next; 
			} 
			last.next = new_node; 
		} 
		return list; 
	} 
	public static void display(LinkedList list) 
	{ 
		Node currNode = list.head; 
		System.out.println("LinkedList: "); 
		while (currNode != null) { 
			System.out.println(currNode.data + " "); 
			currNode = currNode.next; 
		} 
	}
        public static LinkedList delete(LinkedList list,int a){
                Node currnode=list.head,b=null;
                if(currnode!=null&&currnode.data==a){
                    list.head=currnode.next;
                    System.out.println(a+" Found and deleted.");
                    return list;
                }
                while(currnode!=null&&currnode.data!=a){
                    b=currnode;
                    currnode=currnode.next;
                }
                if(currnode!=null){
                    b.next=currnode.next;
                    System.out.println(a+" Found and deleted.");
                }
                if(currnode==null)
                    System.out.println(a+" Not Found.");
                return list;
        }
	public static void main(String[] args) 
	{ 
                LinkedList list = new LinkedList(); 
		list = insert(list, 1); 
		list = insert(list, 2); 
		list = insert(list, 3); 
		list = insert(list, 4); 
		list = insert(list, 5);  
		display(list);
                delete(list,3);
                display(list);
	} 
} 
