	
class TwoGen<T,V>
{
	T ob1; 
	V ob2;
	// constructors
	TwoGen(T o1, V o2){ ob1 = o1; 	ob2 = o2;}
	TwoGen(T o1){ ob1 = o1; }
	TwoGen(){ }
	
	void showTypes() {
	if(ob1!=null)
		System.out.println("obj1 is of type :" +ob1.getClass().getName());
	if(ob2!=null)
		System.out.println("obj2 is of type :" +ob2.getClass().getName());
	}
	
	//getter methods
	T getOb1(){ return ob1;}
	V getOb2(){ return ob2;}

	//setter methods
	void setOb1(T ob){ this.ob1=ob; }
	void setOb2(V ob){ this.ob2=ob;}
};

class GenDemo2 
{
	public static void main(String[] args) 
	{
		TwoGen<Integer,String> obj1 = new TwoGen<Integer,String>(11,"FirstString");
		TwoGen<Integer,String> obj2 = new TwoGen<Integer,String>();

		obj2.setOb1(12);
		obj2.setOb2("SecondString");
		
		obj1.showTypes();
		obj2.showTypes();

		System.out.println("Values :"+ obj1.getOb1() +" ,"+ obj1.getOb2());
		System.out.println("Values :"+ obj2.getOb1() +" ,"+ obj2.getOb2());
	}
}
