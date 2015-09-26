import java.lang.annotation.*;
import java.lang.reflect.*;

// An annotation type declaration
@Retention(RetentionPolicy.RUNTIME)  // This is a built-in feature
@interface MyAnno{
	String str();
	int val();
}

class AnnotationsDemo
{
	//Annotate a method
	@MyAnno(str = "Annotation Example", val = 100)
	public static void myMeth(){
		System.out.println("MyMeth");
		AnnotationsDemo ob = new AnnotationsDemo();
		//obtain the annotation for this method
		try	{
			// Get a class first
			Class c = ob.getClass();
			//Get a method object that represents this method
			Method m = c.getMethod("myMeth");
			//Next get the Annotation
			MyAnno anno = m.getAnnotation(MyAnno.class);
			//Finally display the values
			System.out.println(anno.str() + " :" + anno.val());

		}
		catch (NoSuchMethodException exc)
		{
			System.out.println("Method not found");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}


	}

	public static void main(String[] args) 
	{
		myMeth();
	}
}
