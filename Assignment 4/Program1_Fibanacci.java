package assignment4;

import java.util.Scanner;

public class Program1_Fibanacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		
		System.out.print("Enter number of terms: ");
        int count = sc.nextInt();

		
        int num1=0;
        int num2=1;
        
        if (count >= 1)
            System.out.print(num1 + " ");
        if (count >= 2)
            System.out.print(num2 + " ");

		int i=3;
		
		while(i<=count)
		{	
			//num3=3
			int num3=num1+num2;
			
			if (num3 > 100) {
                break;
            }
			System.out.print(num3+" ");
			num1=num2;
			num2=num3;
			i++;
		}
		sc.close();
	}

}
