import java.io.*;

class ShowFile 
{
	public static void main(String[] args) throws IOException
	{
		int i;
		FileInputStream fin;
	
		try{
			fin = new FileInputStream(args[0]);
			do	{
			i= fin.read();
			if (i != -1) System.out.print((char) i);
			}	while (i != -1);
			fin.close();
			
		}
		catch (FileNotFoundException a){
				System.out.println(a);
		}
		catch (ArrayIndexOutOfBoundsException b){
				System.out.println(b);
				System.out.println("Usage : java ShowFile fileName.txt");
		}
	}
}
