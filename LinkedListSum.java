package linkedlistsum;
public class LinkedListSum { 
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
	public static LinkedListSum insert(LinkedListSum list, int data) 
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
	public static void display(LinkedListSum list) 
	{ 
		Node currNode = list.head; 
		System.out.println("LinkedList: "); 
		while (currNode != null) { 
			System.out.println(currNode.data + " "); 
			currNode = currNode.next; 
		} 
	}
        public static int Sum(LinkedListSum list)
        {
            Node currnode=list.head;
            int sum=0;
            while(currnode!=null){
                sum=sum+currnode.data;
                currnode=currnode.next;
            }
            return sum;
        }
	public static void main(String[] args) 
	{ 
                LinkedListSum list = new LinkedListSum(); 
		list = insert(list, 1); 
		list = insert(list, 2); 
		list = insert(list, 3); 
		list = insert(list, 4); 
		list = insert(list, 5);  
		display(list);
                System.out.println("Sum="+Sum(list));
	} 
} 