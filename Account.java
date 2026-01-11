class Account
{
	int id = 101;
	String name = "Avi";
	long acc =5426595;
	double bal = 1001.0;
	static String bname = "SBI";
	
	public void deposite(double  amt)
		{
			bal = bal + amt ;
			System.out.println("deposite sccess");
		}
	public void withdraw(double	amt)
		{
			bal = bal - amt ;
			System.out.println("withdraw success");
		}
	public void check ()
		{
			System.out.println(bal);
		}	
	public static void  dispaly ()
		{
			System.out.println(bname);
		}	
		
	public static void main(String ...args)
	{
		new Account().deposite(1000.0);
		new Account().withdraw(1002.2);
		new Account().check();
		dispaly();
	}
	
} 