 interface Callback {
void callback(int param);
}

class Client implements Callback
{
	public void callback (int p){
	System.out.println("p outputted from Client :" + p);
	}
};
class AnotherClient implements Callback
{
	public void callback (int p){
	System.out.println("p*p outputted from AnotherClient :" + p*p);
	}
};
class  TestIFace
{
	public static void main(String[] args) 
	{
		// § Interface reference variables §
		Callback c1 = new Client();
		Callback c2 = new AnotherClient();
		c1.callback(3);
		c2.callback(3);
	}
}
