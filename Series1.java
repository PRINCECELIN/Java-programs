class Series1
{
	public static void main(String[] args) 
	{
		int n1=0,n2=1,n3=1,sum=0;
		System.out.println("the fibonacci series are");
		System.out.println(n1+" ");
		System.out.println(n2+" ");
		System.out.println(n3+" ");
		for (int i=1;i<=10 ;i++ )
		{
			sum=n1+n2+n3;
			n1=n2;
			n2=n3;
			n3=sum;
		
		System.out.println(" "+sum);
	}
}
}