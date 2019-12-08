package practice;
public class stacks{
    static int Max=1000;
    int top;
    int a[]=new int[Max];
    stacks(){
        top=-1;
    }
    void push(int d){
        if(top==Max-1){
            System.out.println("Overflow.");
            return;
        }
        a[++top]=d;
        System.out.println(d+" pushed into stack.");
    }
    int pop(){
        int x;
        if(top==-1){
            System.out.println("Underflow.");
            return 0;
        }
        x=a[top--];
        return x;
    }
    public static void main(String a[]){
        stacks s=new stacks();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        System.out.println(s.pop()+" popped from the stack.");
    }
}
