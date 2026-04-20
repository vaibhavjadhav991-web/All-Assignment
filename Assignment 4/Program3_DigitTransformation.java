package assignment4;

public class Program3_DigitTransformation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 57243;
		int result = 0;
		int place = 1;
		int position = 1;

		while (n > 0) {
		    int digit = n % 10;
		    int newDigit;

		    if (position % 2 == 1 && digit <= 4) {
		        newDigit = digit * 2;
		    } 
		    else if (position % 2 == 0) {
		    	
		        newDigit = 1;
		    }
		    else {
		    	
		        newDigit = digit;
		    }

		    result = result + (newDigit * place);
		    place = place * 10;
		    position++;
		    n = n / 10;
		}
		
		System.out.println(result);
			
			
		}
		
		

	}
