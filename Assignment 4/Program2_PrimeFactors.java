package assignment4;

public class Program2_PrimeFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 60;
		int num = n;
		
		for (int i = 2; i <= n / 2; i++) {

		    if (num % i == 0) {
		        System.out.print(i + " ");

		        while (num % i == 0) {
		            num = num / i;
		        }
		    }
		}
		

	}

}
