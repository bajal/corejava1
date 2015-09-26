class testTryCatch 
{
	public static void main(String[] args) 
	{
		try
		{
			System.out.println("bajal"+1/0);
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Aahh..Finally");
		}
		
	}
}
