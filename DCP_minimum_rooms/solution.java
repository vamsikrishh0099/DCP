import java.util.*;
public class dcp_min_rooms {
    public static void main(String[] args){
        SortedMap<Integer,Integer> m=new TreeMap<>();
        m.put(0, 10);
        m.put(40, 180);
        m.put(50,140);
        m.put(120,150);
        m.put(360,600);
        m.put(540,660);
    int ans=min_rooms(m); //answer(3)
    }
    
   static int min_rooms(SortedMap m){

        int rooms=0;
        List<Integer> values= new ArrayList<Integer>(m.values()) ;
     List<Integer> keys= new ArrayList<Integer>(m.keySet()) ;
     int i=0,j=0;
        Collections.sort(keys);
        Collections.sort(values);

        while(i<m.size()){
            if (keys.get(i)<values.get(j)){
                rooms++;
                i++;
            }
            else{
                j++;
                i++;
            }
        }
        return rooms;
    }
}
