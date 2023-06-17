package tw.org.iii.www;

public class leapyear1 {

	public static void main(String[] args) {
		int year = 1700;
		if (year % 4 == 0 && year % 100 != 0) {
			System.out.println("潤");
		} else if (year % 400 == 0) {
			System.out.println("潤");
		} else
			System.out.println("平");
	}
}
