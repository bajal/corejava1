class Box
{
	double height;
	double width;
	double length;

    public Box(){	
	}

	public Box(double height, double width , double length){
		this.height=height;
		this.width=width;
		this.length=length;
	}
	//OverRide the toString() method in java.lang.Object
	//comment this method to check out what the builtin method wud do..
	public String toString(){
	String temp = "Dimensions are :"+height+" :"+length+" :"+width;
	return temp;
	}
}
class objectToString 
{
	public static void main(String[] args) 
	{
		double vol;
		Box myBox1=new Box();
		Box myBox = new Box(10,20,30);
		//Implicitly Printing the object as if it were a string.
		System.out.print(myBox);

	}
}