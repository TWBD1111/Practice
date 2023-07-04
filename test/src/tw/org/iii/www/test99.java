package tw.org.iii.www;

public class test99 {

	public static void main(String[] args) {
		int star = 1;
		int row = 2;
		int col = 5;
		for (int k = 0; k < row; k++) {
			for (int i = 1; i <= 9; i++) {
				for (int y = star; y <= (star + col -1); y++) {
					int a = y + k * col;
					int r = a* i;

					System.out.printf("%d * %d = %d\t", a, i, r);
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}
