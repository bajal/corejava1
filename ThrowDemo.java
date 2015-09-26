class ThrowDemo 
{
	static void demoproc(){
	/*Throw an exception.. All exceptions have two built-in constructors in java.lang 
	[ one with no params and one with a string param ]
	*/
		try
		{
			throw new NullPointerException("description");	
		}
		catch (NullPointerException n)
		{
			System.out.println("Exception caught:"+n);
			// throw the caught exception again!!
			throw n;
		}
		
	}
	
	public static void main(String[] args) 
	{
		try
		{
			demoproc();
		}
		catch (NullPointerException n)
		{
			System.out.println("Exception recaught:"+n);
		}
	}
}
