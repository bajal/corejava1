class Factorial
{
	int fact(int n){
	int result;
	if (n==1) return 1;
	System.out.println("n	: "+n);
	result = fact(n-1) * n;
	System.out.println("result		: "+result);
	return result;	
	}
};

class Recursion 
{
	public static void main(String[] args) 
	{
		Factorial f = new Factorial ();

		System.out.println("Factorial of 12 is " + f.fact(12));
	}
}
