package javaques;
import java.util.*;
public class Javaques{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int a[],p[],i;
        a=new int[5];
        p=new int[5];
        System.out.println("Enter Numbers:");
        for(i=0;i<5;i++){
            a[i]=scan.nextInt();
        }
        for(i=0;i<5;i++){
            a[i]=a[i]*a[i];
        }
        for(i=0;i<5;i++){
            System.out.print(a[i]+" ");
        }
    }
    
}
