import java.util.Scanner;
class ArraySacnner
	{
		public static void main(String[]args)
		{
			Scanner sc = new Scanner(System.in);
		
			System.out.println("enter the size of Array");
			int size = sc.nextInt();
			int [] b = new int[size];
		
			System.out.println("enter array element");
			for(int i=0; i<=b.length-1; i++)
				{
					b[i]=sc.nextInt();
				}
			System.out.println("---------");
			
			for(int i=0; i<b.length; i++)
				{
					if (b[i] % 2 == 0)																																)
					{
						System.out.println(b[i]);
					}
				}	
		}	
	}