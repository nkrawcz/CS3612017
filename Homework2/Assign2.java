import java.lang.Math;
import java.util.Scanner;
public class Assign2 {

public static void main(String[] args){
		Scanner user_input = new Scanner(System.in);
		System.out.println("Enter a value for n between 0 and 30:");
		int n = user_input.nextInt();
		int answer = recPow(n);
		if(n>=0 && n<=30)
		System.out.println(answer);
	}
	
public static int recPow(int n){
	int ans=1;
	if (n< 0 || n>30){
System.out.println("Number must be greater than 0 and less than 30"); 
		return 0; 
	}
	else{
		if(n==0)
			return ans;
		else
			return (recPow(n-1)*2);
	}
		
}