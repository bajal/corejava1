class customException extends Exception
{
	private int detail;

	customException(int a){
	detail = a;
	}
	public String toString(){
	return "customException["+ detail + "]";
	}
	
}
class customExceptionDemo
{
	static void compute (int a) throws customException{
	System.out.println("Called compute(" + a + ")");
	if(a>10)
		throw new customException(a);
	System.out.println("Normal Exit!");
	}
	public static void main(String[] args) 
	{
		try{
		compute (1);
		compute(20);
		}
		catch (customException x){
		System.out.println("Caught		:"+x);
		}
		
	}
}
