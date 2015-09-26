class Test1
{
	int a;
	protected int b;
	private int c;

	void setc(int i){
	c =  i;
	}

	int getc(){
	return c;
	}

};

class AccessTest 
{
	public static void main(String[] args) 
	{
		Test1 ob = new Test1();
		
		ob.a = 100;
		ob.b = 200;

// Can't access like this ob.c = 300;
//Have to use method
	ob.setc(300);
System.out.println(ob.a+" " +ob.b);
// Can't do this too System.out.println(ob.c);
System.out.println(ob.getc());


	}
}

/* Private : Can be accessed only within that class
   Protected : By code in same package or subclasses in different packages
   Public : Can be accessed from any class
*/