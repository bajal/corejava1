//Generics : parameterized types
//T is a type parameter

class Gen<T>{
T ob;

Gen (T o){
ob=o;
}
T getob (){
return ob;
}
void showType(){
System.out.println("Type of T is :"+ ob.getClass().getName());
}
}

class GenericDemo1 
{
	public static void main(String[] args) 
	{
		//gen reference for integer objects
		Gen<Integer> iob;
		
		//create the object. autoboxing to encapsulate 88 within the integer object.
		iob = new Gen<Integer>(89);

		iob.showType();

		//no need to typecast.
		int v = iob.getob();
		System.out.println("value	: "+v);

		Gen<String> strObj = new Gen<String>("Bajal");
		
		strObj.showType();
		String v1 = strObj.getob();
		System.out.println("value	: "+v1);
		
	}
}
