
public class Main {
    public static void main(String[] args) {
      System.out.println(car(cons(6,3)));        //prints 6.
          System.out.println(cdr(cons(6,3)));    //prints 3.
    }
    
   static pair cons(int a,int b){
        pair pair=(helpfunc h)->h.helpfunc(a,b);
        return pair;
    }
    
  static  int car(pair p){
      helpfunc h=(int a,int b)->a;
       return p.pair(h);
       }
       
 static  int cdr(pair p){
      helpfunc h=(int a,int b)->b;
      return p.pair(h);
      }
}
interface pair{
    int pair(helpfunc h);
}
interface helpfunc{
    int helpfunc(int a,int b);
}


