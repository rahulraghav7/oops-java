package queue;
import java.util.*;
class node{
    private int info;
    private int priority;
    private node next;
    private node start=null;
    private node last=null;
    private node temp=null;
    public node(){
        info=priority=0;
        next=null;
    }
    public node(int x,int y){
        info=x;
        priority=y;
        next=null;
    }
    void insert(int s,int t){
        node newn=new node(s,t);
        if(start==null){
            start =newn;
            last=newn;
        }
        else{
            temp=start;
            if(temp.next!=null&&temp.next.priority<next.priority){
                temp=temp.next;
                newn.next=temp.next;
                temp.next=newn;
            }
        }
    }
    void delete(){
        System.out.println("Element="+start.info);
        if(start==null)
            System.out.println("UNDERFLOW");
        else if(start==last){
            start=last=null;
        }
        else
            start=start.next;
    }
}
public class Queue {
    public static void main(String[] args){
       node a=new node();
       int i,b,p,ch;
       Scanner s=new Scanner(System.in);
       while(true){
           System.out.println("Enter choice:");
        ch=s.nextInt();
           switch(ch){
               case 1:System.out.println("Enter Value and Priority");
                     for(i=0;i<4;i++){
                         b=s.nextInt();
                         p=s.nextInt();
                         a.insert(b, p);
                        }
                break;
               case 2:a.delete();
               break;
               default:System.exit(0);
               break;
           }
       }
    }
}