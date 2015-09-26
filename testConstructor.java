class testConstructor 
{	
	static int len;
	String c;
	testConstructor(String c){
	c=c;
	}
	testConstructor(){}

	protected static void getLength(String s){
	System.out.println(s.length());
	}
	
	public static void main(String[] args) 
	{
		testConstructor t= new testConstructor();
		testConstructor t1= new testConstructor("cf");
		getLength("bajal");		
	}
}
