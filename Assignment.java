package assignment;
import java.util.*;
public class Assignment{
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
	public static Assignment insert(Assignment list, int data){ 
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
	public static void printList(Assignment list){ 
		Node currNode = list.head; 
		System.out.println("LinkedList: "); 
		while (currNode != null) { 
			System.out.println(currNode.data + " "); 
			currNode = currNode.next; 
		} 
	}
        void Deletefirst(int key){
            Node temp=head,prev=null;
            while(temp!=null&&temp.data!=key){
                prev=temp;
                temp=temp.next;
            }
            prev.next=temp.next;
            temp=prev.next;
            
        }
        void Deletelast(int key){
            Node current=head;
            Node prev=null;
            Node temp=null;
            while(current!=null){
            if(current.next!=null && current.next.data==key){
               prev=current;
               temp=current.next;
        }
            current=current.next;
    }
            prev.next=temp.next;
}
 
        void deleteall(int key){    
        Node temp = head, prev = null;  
        while (temp != null && temp.data == key){  
            head = temp.next;  
            temp = head;   
        }   
        while (temp != null){  
        while (temp != null && temp.data != key){  
                prev = temp;  
                temp = temp.next;  
            }  
            if (temp == null) return;  
 
            prev.next = temp.next;    
            temp = prev.next;  
        }  
    }  
	public static void main(String[] args){ 
		Assignment list = new Assignment(); 
		Scanner scan=new Scanner(System.in);
                int i,a,n,ch,x;
                System.out.println("Enter the Amount of Numbers you wish to enter:");
                a=scan.nextInt();
                System.out.println("Enter Numbers:");
                while(a>0){
                    n=scan.nextInt();
                    list=insert(list,n);
                    a--;
                }
                System.out.println("Enter:");
                System.out.println("1.Delete the first occurrence of a given Number.");
                System.out.println("2.Delete the last occurrence of a given Number.");
                System.out.println("3.Delete all the occurrences of a given Number.");
                ch=scan.nextInt();
                switch(ch){
                    case 1:System.out.println("Enter the Number you want to delete:");
                        list.Deletefirst(scan.nextInt());
                        printList(list);
                        break;
                        
                    case 2:System.out.println("Enter the Number you want to delete:");    
                        list.Deletelast(scan.nextInt());
                        printList(list);
                        break;
                        
                    case 3:System.out.println("Enter the Number you want to delete:");
                        list.deleteall(scan.nextInt());
                        printList(list);
                        break;
                        
                    default:System.out.println("WRONG INPUT");
                        break;
                }
	} 
}
    