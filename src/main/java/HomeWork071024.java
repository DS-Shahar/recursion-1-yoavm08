package recursya;
import java.util.Scanner;
public class HomeWork071024 {
	public static Scanner reader = new Scanner (System.in);
	
	
	public static int sum(int n)
	{
		if(n == 0)
		{
			return 0;
		}
		return n + sum(n-1);
	}
	
	public static int f(int n)
	{
		if(n == 1)
		{
			return 1;
		}
		return n * f(n-1);
	}
	
	public static int odd(int n)
	{
		if(n == 1)
		{
			return 1;
		}
		if(n%2 == 0)
		{
			n = n - 1;
		}
		return n * odd(n-2);
	}
	
	public static int digits(int n)
	{
		if(n == 0)
		{
			return 0;
		}
		return 1 + digits(n/10);
	}
	
	public static double a(int n1, int n2)
	{
		if(n2 > n1)
		{
			return 1.0*n1/n2;
		}
		return 1 + a(n1-n2, n2);
	}
	
	public static boolean q7(int x, int y) 
	{
        if (x < y) 
        {
            return false;
        }
        if (x == y) 
        {
            return true;
        }
        return q7(x - y, y);
    }

    //q8- d has to be 2 at first:
    public static boolean q8(int n, int d) 
    {
        if (n < 2) 
        {
            return false;
        }
        if (n % d == 0) 
        {
            return false;
        }
        if (d * d > n) 
        {
            return true;
        }
        return q8(n, d + 1);
    }


    public static boolean q9(int n) 
    {
        if (n < 10) 
        {
            return true;
        }
        int lastDigit = n % 10;
        int nextLastDigit = (n / 10) % 10;
        if ((lastDigit % 2) != (nextLastDigit % 2)) 
        {
            return false;
        }
        return q9(n / 10);
    }


}
