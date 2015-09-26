class PascalsTriangle 
{
	public static void main(String[] args) 
	{
		int i=0,j=0;
		for (i=1; i<=4 ; i++)
		{
			System.out.println("");
			for(j=0; j<=3;j++)
				System.out.print(" ");
			for(j=0; j<=i;j++)
				System.out.print(j+i-1);
			for(j=i-1; 1<=j;j--)
				System.out.print(j+i-1);
		}
	}
}
