import java.util.*;
public class dcp_substring {
    public static void main(String[] args){
       
       String s="axvrbdaabc"; //give your string here
       int k=3;             //give your integer here.
       int a= largest(s,k);
       
         System.out.println("answer:"+a);
    }
    
    static int largest(String s,int num){
        
            int slen=s.length();

            while (slen>1){
            for (int i=0;i+slen<=s.length();i++){
                String su=s.substring(i,i+slen);
                Set subs=new HashSet<>();
           
                for (char x:su.toCharArray())
                        subs.add(x);
                if (subs.size()==num){
                    System.out.println(su); //prints the largest possible substring as per problem.
                     return slen;
                }
                }
                slen-=1;

            }       
 
        return 1;
    
    }
}
