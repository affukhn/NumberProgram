import java.util.Scanner;
class  palindrome
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		if(palindrome(num))
			System.out.println(num +" is palindrome ");
		else
		 System.out.println(num +" is not palindrome ");
	}
	public static boolean palindrome(int num)
	{
		String rev="";
		int temp=num;
		while(num!=0)
		{
			rev=rev+(num%10);
			num/=10;
		}
		return Integer.parseInt(rev)==temp;
	}
}
