// Abstract method : <without a definition>
// Abstract class :  any class with one or more abstract methods, should also be abstract
//							Cannot be instantiated
//							Any subclass of it *must* implement all the abstract methods of parent

abstract class Base{
        abstract public void myfunc();
        public void another(){
        System.out.println("Another method");
        }
}

public class Abs extends Base{
        public static void main(String argv[]){
        Abs a = new Abs();
		//call amethod
        a.amethod();
        }

        public void myfunc(){
                System.out.println("My func");
                } 

        public void amethod(){
        myfunc();
        }
}