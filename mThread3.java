/* Thread can be made either by extending the Thread class	
	or by implementing the runnable interface */
class NewThread implements Runnable
{
	String name;
	Thread t;
	//Constructor
	NewThread(String threadname) {
	name = threadname;
	t= new Thread (this, threadname);
	System.out.println("New Thread : " + t);
	t.start(); // start thread
	}
	// implement the interface method
	public void run(){
	try{
		for (int i=5;i>0 ;i-- )	{
			System.out.println(name +" : " + i);
			Thread.sleep(500);
		}
	}catch (InterruptedException i)	{
			System.out.println( name + " Interrupted");
		}
		System.out.println( name + "Exiting... ");
	}

};
class  mThread3
{
	public static void main(String[] args) 
	{
		NewThread ob1 = new NewThread ("One");
		NewThread ob2 = new NewThread ("Two");
		NewThread ob3 = new NewThread ("Three");

		System.out.println(" " +ob1.t.isAlive());
		
		try{
		for (int i=5;i>0 ;i-- )	{
			System.out.println("Waiting for threads to finish");
			ob1.t.join();
			ob2.t.join();
			ob3.t.join();
			}
		}catch (InterruptedException i)	{
		System.out.println("Main Thread Interrupted");
		}
	
	System.out.println("Exiting Main thread.");
	}
//System.out.println(ob2.t.isAlive());		

	}

