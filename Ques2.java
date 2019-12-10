package ques2;
import java.util.*;
public class Ques2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String s;
        int i,a=0;
        System.out.println("Enter String:");
        s=scan.nextLine();
        for(i=0;i<s.length()-1;i++){
            if(s.charAt(i)=='g'){
                if(s.charAt(i+1) == 'g'){
                    a+=1;
                }
            }
        }
        if(a>=1)
            System.out.println("Happy");
        else
            System.out.println("Sad");
    }
}
