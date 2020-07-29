import java.util.*;
import java.lang.*;
public class string_from_words {
    public static void main(String[] args){
        List<String> words=new ArrayList<>();
        words.add("quick");
        words.add("brown");
        words.add("the");
        words.add("fox");
        String s="thequickbrownfox";
       
        List<String> ans=giveString(words,s);
        System.out.println(ans); //answer
    }
    static List<String> giveString(List<String> words,String s){
        System.out.println(words);
        System.out.println(s);
 
  List<String> ans=new ArrayList<>();
  int k=0;
            for (int i=0,j=0;k<s.length();i++){
                if (s.substring(k).startsWith(words.get(i))){
                    ans.add(words.get(i));
                    j++;
                  k+=words.get(i).length();
                
                    i=-1;
                }
                if (i==words.size()-1)
                break;
            }
            if (k==s.length())
                return ans;           //return answer if a sentence is reconsutructed perfectly,else
                else return null;     //return null


    }
}
