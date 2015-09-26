/* When a method throws an exception but does not handle it
i.e it is handled in some other caller
*/
class  ThrowsDemo{
	static void throwOne() throws IllegalAccessException{
	throw new IllegalAccessException("Description");
	}
	public static void main(String[] args) 
	{
		try
		{
			throwOne();				
		}
		catch (IllegalAccessException i)
		{
			System.out.println("Exception	"+i);
			String msg = i.getLocalizedMessage();
			Throwable msg1 = i.getCause();
			System.out.println("msg		:"+msg+" " +msg1);
		}
	}
}

