package practise;

import java.util.Scanner;
public class Pro15 {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner sc=new Scanner(System.in)){;
		int n=sc.nextInt();
		int s=0;
		while(n>0)
		{
			int k=n%10;
			s=s+k;
			n=n/10;
		}
		System.out.println(s);
	}

}
}