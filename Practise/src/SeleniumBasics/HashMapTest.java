package SeleniumBasics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTest {

	


	public static void main(String[] args) {
		//Create a HashMap
 HashMap<Integer,String> hm =new HashMap<Integer,String>();
		//HashMap<Integer,String> hm=new HashMap<Integer,String>();  
// HashMap hm =new HashMap();
	
		//Put an element to hashmap
		hm.put(100, "deeksha");
		hm.put(101, "Sharma");
		hm.put(103, "Sharma1");
		
		//get A set of Entries
		Set<Integer> set = hm.keySet();
		
		
		//get the iterator
		Iterator<Integer>  i = set.iterator();
		
		//Display Elements
		//hm.entrySet()
		
		for( Entry<Integer,String> e:hm.entrySet())
		{
			System.out.println(e.getKey()+" "+ e.getValue());
		}
		
		
		
	}
}
