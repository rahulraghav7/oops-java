package trip;
import java.util.*;
public class Trip {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String s[];
        int i;
        s=new String[3];
        System.out.println("Enter Strings:");
        for(i=0;i<3;i++){
            s[i]=scan.nextLine();
        }
        for(i=0;i<3;i++){
            s[i]=s[i]+s[i]+s[i];
        }
        for(i=0;i<3;i++){
            System.out.print(s[i]+" ");
        }
    }
    
}
