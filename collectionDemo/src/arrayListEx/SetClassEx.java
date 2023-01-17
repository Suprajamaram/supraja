package arrayListEx;
import java.util.*;

public class SetClassEx {
	
	public static void main(String[] args) {
		//TODO Auto-generated method stub
		
		Set<Item> Set = new HashSet();
		
		set.add(new Item("Window",3000));
		set.add(new Item("Hp",4500));
		set.add(new Item("lenovo",5000));
		set.add(new Item("Dell",10000)));
		
		Iterator<Item> itr = set.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}

}
