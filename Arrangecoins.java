package Staircase;
import java.util.Scanner;
public class Staircase {
	 static int Stair(int n) {
		int a=0;
		while(n>=a+1) {
			n-=a+1;
			a++;
		}
		return a;
			
	
	}

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		int n=Sc.nextInt();
		int value=Stair(n);
		System.out.println(value);

	}

}

	

	
