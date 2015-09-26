/* Controlling the main thread */

class  mThread1
{
	public static void main(String[] args) 
	{

		Thread t = Thread.currentThread();
		System.out.println("Current Thread	:" + t);

		t.setName("My Thread");
		System.out.println("Current Thread	:" + t);

		try{
			for (int i=0;i<5 ; i++){
						System.out.println(i);
						t.sleep(1000);
			}
		}
		catch (InterruptedException i)	{
			System.out.println("Main Thread Interrupted");
		}
		
	}
}
