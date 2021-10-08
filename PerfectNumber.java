import java.util.Scanner;
class  PerfectNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		if(perfectNum(num))
			System.out.println(num +" is perfect nuumber");
		else
			System.out.println(num +" is not perfect number");
	}
	public static boolean perfectNum(int num)
	{
		int sum=0;
		for (int i=1;i<num;i++)
		{
			if(num%i==0)
			sum=sum+i;
			
		}
		
		return sum==num;
	}
}
