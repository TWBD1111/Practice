package tw.org.iii.www;

public class test {

	public static void main(String[] args) {
		int year = 2000;
		
		if (year % 4 == 0 ) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					System.out.println("潤");
				}else {
					System.out.println("平");
				}
			}else {
				System.out.println("平");
			}
		}else {
			System.out.println("平");
		}

	}

}
