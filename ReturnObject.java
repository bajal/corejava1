class Test
{
	int a;
	
	//Constructor for without arguments
	Test (){
		System.out.println("Constructor for without arguments");
	}
	//Constructor for integer argument
	Test (int i){
		System.out.println("Constructor for integer argument");
		a=i;	
	}
	//Constructor for copying another object
	Test (Test ob){
		System.out.println("Constructor for copying another object");
		a=ob.a	;
	}
	
	//Method to increment 'a' value of an object passed, by 'inc'
	Test incrementBy(int inc){
		Test temp = new Test(a+inc);
		return temp;
	}
};

class ReturnObject
{
	public static void main(String[] args)
	{
		Test ob1 = new Test ();
		Test ob2 = new Test (2);
		Test ob3 = new Test (ob2);

		System.out.println(ob3.a);
		ob1  = ob2.incrementBy(9);
		System.out.println(ob1.a);
	}
}
