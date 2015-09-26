import java.util.*;

class ArrayListDemo 
{
	public static void main(String[] args) 
	{
		//create ArrayList
		ArrayList<String> al = new ArrayList<String>();
		
		System.out.println("Initial size	 :"+al.size());
		al.add("b");al.add("a");al.add("j");
		al.add("a");al.add("l");
		//add at position
		al.add(0,"I");
		System.out.println("Final size	 :"+al.size());
		System.out.println("Contents	 :"+al);

		al.remove(0);
		System.out.println("Contents	 :"+al);
		
		//CONVERT arrayList to array

		String la[] = new String[al.size()];
		la = al.toArray(la);
		
		System.out.print("Array	 :");
		for(int i=0;i<al.size();i++)
			System.out.print(la[i]+", ");

	}
}
