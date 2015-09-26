//Enumeration as a class
//enum types may not be instantiated
enum Fruits{
	Apple(10), Orange(9), Banana(6), Papaya(2);
	//Instance variable	
	private int price;
	//Constructor
	Fruits (int p){ price = p;}

	int getPrice(){ return price;}
}

class EnumDemo2 
{
	public static void main(String[] args) 
	{
		System.out.println("Banana costs Rs."+ Fruits.Banana.getPrice());
		
		for (Fruits i : Fruits.values() ){
			System.out.println(i +" costs Rs."+ i.getPrice());
		}

	}
}