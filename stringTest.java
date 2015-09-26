class stringTest 
{
	public static void main(String[] args) 
	{
		String strObj1 = new String("Bajal");
		String strObj2 = new String("Azhar");
		String strObj3 = new String("BAJAL");

		System.out.println(strObj1.equals(strObj2));
		System.out.println(strObj1.equals(strObj3));
		System.out.println(strObj1.equalsIgnoreCase(strObj3));

		System.out.println(strObj2.compareTo(strObj1));
	}
}
