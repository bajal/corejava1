abstract class Figure
{	
	double dim1;
	double dim2;

	Figure (double a, double b){
	dim1 = 1;
	dim2 = b;
	}
	// area is an abstract method. It "HAS" to be defined in all subClasses
	abstract double area();
};
class Rectangle extends Figure
{
	Rectangle (double a, double b){
	super(a,b);
	}
	double area(){
	return dim1 * dim2;
	}
};
class Triangle extends Figure
{
	Triangle (double a, double b){
	super(a,b);
	}
	double area(){
	return dim1 * dim2/2;
	}
};
class FindAreaOverride
{
	//Dispaying Global Variable Declaration "final"
	static final int FILE_NEW =2;
	public static void main(String[] args) 
	{
		Rectangle r = new Rectangle (10,10);
		Triangle t = new Triangle (10,10);
		Figure figref;  //Only referred..not instantiated. (Abstract class cannot be)

		figref = r;
		System.out.println	(figref.area());
		figref = t;
		System.out.println	(figref.area());
		System.out.println	(FILE_NEW);
	}
}
