//package Classes;

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
	double  getVolume (){
		return (this.height * this.width * this.length);
	}
}
class BoxTest 
{
	public static void main(String[] args) 
	{
		double vol;
		Box mybox1=new Box();
		Box myBox = new Box(10,20,30);
	
		vol = myBox.getVolume();
		System.out.print("Volume is  "+ vol);
	}
}