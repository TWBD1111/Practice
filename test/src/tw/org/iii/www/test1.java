package tw.org.iii.www;

public class test1 {

	public static void main(String[] args) {
        int i ;
		int number = 1;
        if (number <= 1) {
            System.out.println(number + " is not a prime number.");
            return;
        }
        for ( i = 2; i < number; i++) {
            if (number % i == 0) {
                System.out.println(number + " is not a prime number.");
                break;
            }
            
        }
        
        if (i == number) {
            System.out.println(number + " is a prime number.");
        }

	}

}
