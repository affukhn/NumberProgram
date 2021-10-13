import java.util.Scanner;
class  sumOfNum
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number");
		int num =sc.nextInt();
		System.out.println("the sum is " +sum(num));
	}
	public static int sum(int num)
	{
		int sum=0;
		while(num>0)
		{
			sum+=num%10;
			num/=10;
		}
		return sum;
	}
}
