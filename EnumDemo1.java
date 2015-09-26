enum Fruits{
	Apple, Orange, Banana, Papaya
}

class EnumDemo1 
{
	public static void main(String[] args) 
	{
		Fruits f;
		f = Fruits.Apple;
		System.out.println(f);
		System.out.println("ALL Contents :");
		for (Fruits i : Fruits.values() ){
			System.out.println(i);
		}

	}
}
