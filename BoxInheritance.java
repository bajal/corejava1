class BoxDims
{
	double height;
	double width;
	double length;

    BoxDims () {
		height=-1;
		width=-1;
		length=-1;
	}
	BoxDims (double height, double width , double length){
		this.height=height;
		this.width=width;
		this.length=length;
	}
};

class BoxWeight extends BoxDims
{
	double weight;
	BoxWeight (double w, double h, double d, double m){
	// call appropriate constructor from superclass
	super(w,h,d);
	weight = m;
	}

};
class BoxColor extends BoxDims
{
	String color;
	BoxColor (double w, double h, double d, String c){
	super (w,h,d);
	color=c;
	}
};
class BoxInheritance
{
	public static void main(String[] args)
	{
		BoxDims mybox1=new BoxDims();
		BoxDims myBox = new BoxDims(10,20,30);
	
		BoxWeight myBox3= new BoxWeight(1,2,3,12);
		BoxColor myBox4 = new BoxColor (1,4,5,"Red");

		System.out.println(myBox3.weight);
		System.out.println(myBox4.color);

		System.out.println(findVolume(myBox));
	}
	static double findVolume(BoxDims o){
		return o.height * o.width * o.length;
	}
}