class Exc0
{
	public static void main(String[] args) 
	{
		int d= args.length;
		int myArray[] = new int [6];
		//int myArray[]= {1};
		try{
			//If no argument passed this will result in exception
			System.out.println("100/d :"+100/d);
			// If at least one argument passed, this will result in exception
			myArray[42]=1;	
		} catch (ArithmeticException e){
			System.out.println("Division By Zero!");
			System.out.println("Error	:"+e);
		}
			catch (ArrayIndexOutOfBoundsException a){
			System.out.println("Array Index out of Bounds !");
			System.out.println("Error	:"+a);
			}
		}	
}

