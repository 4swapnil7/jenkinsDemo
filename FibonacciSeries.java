import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		System.out.println("Enter limit to find finionnaci series: ");
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int a=0, b=1 , c ,i;
		System.out.println("Fibionaaci series is "+a+"\n"+b);
		for ( i=2 ; i<= n; i++) {
			c=a+b;
			System.out.println("\n"+c);
			a=b;
			b=c;
		}
	}
}
