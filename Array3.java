import java.util.Scanner;
class  Array3
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("enter the array elements");
		for (int i=0;i<arr.length ;i++ )
		{
		 
			arr[i]=sc.nextInt();
		}
		System.out.println("print the array elements");
		for (int i=0;i<arr.length ;i++ )
		{
			if (arr[i]%2==0)
			{
				System.out.println(arr[i]);
			}
		}

	}
}
