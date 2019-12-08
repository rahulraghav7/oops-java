package practice;
public class Practice{
    Node head;
class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
    }
public void insert(int d){
    Node newnode=new Node(d);
    newnode.next=head;
    head=newnode;
}
public void delete(int k){
    Node n=head,prev=null;
    if(n!=null&&n.data==k){
        head=n.next;
        return;
    }
    while(n!=null&&n.data!=k){
        prev=n;
        n=n.next;
    }
    if(n==null)return;
    prev.next=n.next;
}

public void display(){
    Node n=head;
    while(n!=null){
        System.out.print(n.data+" ");
        n=n.next;
    }
    System.out.println();
}
    public static void main(String[] args){
        Practice list=new Practice();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.display();
        list.delete(4);
        list.display();
    }
    
}
