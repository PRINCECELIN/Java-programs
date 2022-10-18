class While 
{
	public static void main(String[] args) 
	{
		
		int i=1,n1=0,n2=1,sum=0;
		System.out.println(n1+" ");
		System.out.println(n2+" ");
		while (i<=10)
		{
			sum=n1+n2;
			n1=n2;
			n2=sum;
			System.out.println(sum);
			i++;
		}

		
	}
}
