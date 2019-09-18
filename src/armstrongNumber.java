import java.util.*;
import java.math.*;

public class armstrongNumber {

	public static void main(String[] args) {
		System.out.println("Enter a number to check if it is an armstrong number");
		Scanner sc = new Scanner(System.in);
		int in = sc.nextInt();
		
		System.out.println(isArmstrong(in));

	}

	public static boolean isArmstrong(int num){
		
		int temp = num;
		int length = String.valueOf(num).length();
		List<Integer> digits = new ArrayList<Integer>();
		
		for(int i = 0; i < length; i++)
		{
			int remainder = temp%10;
			digits.add(remainder);
			temp = temp/10;
		}
		
		double armStrong = 0;
		
		for(int i = 0; i < digits.size(); i++)
		{
			armStrong = armStrong + Math.pow(digits.get(i), 3);
		}
		
		if((num) == armStrong)
			return true;
		else
			return false;

	}
}
