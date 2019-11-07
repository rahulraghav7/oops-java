public class Main { 
    Node head;
  
    
    class Node { 
        String data; 
        Node prev; 
        Node next; 
  
         Node(String d) { 
             data = d; 
             
         } 
    } 
  
    public void push(String new_data) 
    { 
        Node new_Node = new Node(new_data); 
        new_Node.next = head; 
        new_Node.prev = null; 
        if (head != null) 
            head.prev = new_Node; 
  
        head = new_Node; 
    } 
    
    public void printlist(Node node) 
    { 
        Node last = null; 
        while (node != null) { 
            System.out.println(node.data + " "); 
            last = node; 
            node = node.next; 
        } 
        System.out.println(); 
    }
    void find(Node node,String s)
    {
        Node last=null;
        int n=0;
        while(node!=null){
            if(node.data==s)
               n=n+1;
            last=node;
            node=node.next;
        }
        System.out.println(s+" comes "+n+" times");
    }
    
    public static void main(String[] a){
        Main d=new Main();
        d.push("dhruv");
        d.push("kamal");
        d.push("rahul");
        d.push("tarun");
        d.push("kamal");
        d.printlist(d.head);
        d.find(d.head,"kamal");
    }
}
    
  