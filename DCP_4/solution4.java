import java.util.*;

class DCP
{
	public int solve (int[] a)
	{
	   SortedSet<Integer> n=new TreeSet<Integer>();
		for (int i=0;i<a.length;i++){
		    n.add(a[i]);
		}
		for (int i=1;i<n.size();i++){
		    if (!n.contains(i))
		    return i; //if any missing positive integer,this is the answer.
		}
		return n.last()+1; //if all positive integers are present consequently,then answer is last integer + 1.
	}
}
