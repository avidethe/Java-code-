class Digits
{
	public static void main(String...args)
	{
		int val = 365 ;
		if ( val < 100)
		{
			System.out.println("sigle digits");
		}
		else if(val >= 10 && val <= 100)
		{
			System.out.println("double digits");
		}
		else if(val >= 100 && val <= 100)
		{
			System.out.println("triples digits");
		}
		else if(val >= 100)
		{
			System.out.println("4 digits");
		}
		
		
	}
}