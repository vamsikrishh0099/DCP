public class DCP{

     public int[] solve(int []a){
        //int []a={1,4,5,2};
        int ans[]=new int[a.length];
      for (int i=0,j=0;j<a.length;i++,j++){
          ans[j]=1;
         while(i!=0){
              ans[j]=ans[j]*a[i-1];
              i--;
          }
          i=j;
          while(i<a.length-1){
              ans[j]=ans[j]*a[i+1];
              i++;
          }
          i=j;
          
      }
      return ans;
   
     }
}
