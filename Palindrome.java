package palindrome;
import java.util.*;
class check{
    Boolean palin(String s){
        if(s.length()==0||s.length()==1)
            return true;
        if(s.charAt(0)==s.charAt(s.length()-1)){
            return palin(s.substring(1, s.length()-1));
        }
       return false;
    }
}
public class Palindrome {
    public static void main(String[] args) {
        String s;
        boolean c;
        System.out.println("Enter String:");
        Scanner ob=new Scanner(System.in);
        s=ob.nextLine();
        check a=new check();
        c=a.palin(s);
        if(c==true)
            System.out.println("Palindrome.");
        else
            System.out.println("Not Palindrome.");
    }
}
