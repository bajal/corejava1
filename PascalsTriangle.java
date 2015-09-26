class  PascalsTriangle
{
	public static void main(String[] args) 
	{
		
		int[][] a= new int[10][10];
		int i,j,c,n;
		
		n=8; //number of lines
		
		a[1][1]=1;		
		System.out.println(a[1][1]);
		a[2][1]=1;a[2][2]=2;a[2][3]=1;
		System.out.println(a[2][1]+" "+a[2][2]+" "+a[2][3]);
		
		for(i=3;i<=n;i++)
		  {
			   a[i][1]=1;
			   System.out.print(a[i][1] + " ");
			   j=2;c=3;
			   while(j<=i)
			   {
					a[i][j]=a[i-1][c-1]+a[i-1][c-2];
					System.out.print(a[i][j]+" ");
					c=c+1;
					j=j+1;
			   }
	     	   a[i][j]=1;
			   System.out.println(a[i][j]);
		 }
	}
}
