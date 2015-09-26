

class  ExecDemo
{
	public static void main(String[] args) 
	{

		Runtime r = Runtime.getRuntime();
		Process p = null;
		try{
		p = r.exec("notepad");
		p.waitFor();
		}
		catch (Exception e){
		System.out.println("Error Caught " + e);
		}
		System.out.println("Notepad exit status " + p.exitValue());
	}
}
