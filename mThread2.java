/* Thread can be made either by extending the Thread class	
	or by implementing the runnable interface */
class NewThread implements Runnable
{
	Thread t;
	//Constructor
	NewThread() {
	t= new Thread (this, "Demo Thread");
	System.out.println("Child Thread : " + t);
	t.start(); // start thread
	}
	// implement the interface method
	public void run(){
	try{
		for (int i=5;i>0 ;i-- )
		{
			System.out.println("Child Thread : " + i);
			Thread.sleep(500);
		}
	}
		catch (InterruptedException i)	{
			System.out.println("Child Thread Interrupted");
		}
		System.out.println("Exiting Child thread.");
	}

};
class  mThread2
{
	public static void main(String[] args) 
	{
		new NewThread(); //create new thread

		try {
		for (int i=5;i>0 ;i-- )
		{
			System.out.println("Main Thread : " + i);
			Thread.sleep(1000);
		}
		}
		catch (InterruptedException i)	{
			System.out.println("Main Thread Interrupted");
		}
	
	System.out.println("Exiting Main thread.");
	}
}

