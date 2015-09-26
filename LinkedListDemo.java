import java.util.*;

class LinkedListDemo 
{
	public static void main(String[] args) 
	{
		LinkedList<String> ll = new LinkedList<String>();
		System.out.println("Contents :"+ll);
		
		ll.add("A");ll.add("B");ll.add("C");ll.add("D");ll.add("E");
		ll.add(2,"F");

		System.out.println("Contents :"+ll);

		ll.removeFirst();
		ll.removeLast();		
		
		System.out.println("Contents :"+ll);
		
		//get and set
		String val=ll.get(2);
		ll.set(2,val +" Changed");

		System.out.println("Contents :"+ll);
	}
}
