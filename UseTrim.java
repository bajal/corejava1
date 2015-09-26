import java.io.*;
class UseTrim 
{
	public static void main(String[] args) throws IOException
	{
		

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		System.out.println("Type in exit to quit anytime..");
		System.out.println("----------------------------");
		do{
			
			str = br.readLine();
			str=str.trim();
			if(str.equalsIgnoreCase("Kerala"))
				System.out.println("Trivandrum");
			else if (str.equalsIgnoreCase("Karnataka"))
				System.out.println("Bangalore");
			else if (str.equalsIgnoreCase("exit"))
				System.out.println("Exiting...");
			else if (str.equalsIgnoreCase(""))
				System.out.println("Type name of state or \"exit\" to exit");
			else
				System.out.println("No Idea!");
		}while(!str.equalsIgnoreCase("exit"));
	}
}
