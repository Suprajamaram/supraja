package collections;
import java.util.*;

public class listex {
	
	public static void main(String[] args) {
	   //TODO Auto-generated method stub
	   List numberlist=new ArrayList();
	   numberlist.add("tea");
	   numberlist.add("coffee");
	   numberlist.add("black coffee");
	   numberlist.add("Espresso");
	   numberlist.add("Cappicuino");
	   numberlist.add("Regular coffee");
	   System.out.println(numberlist.size());
	   System.out.println(numberlist);
	
	   System.out.println(numberlist.get(3));
    }

}
