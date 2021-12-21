/**
 * 标准答案
 * 从100到999，求水仙花数，如：153 = 1^3 + 5^3 + 3^3
 */
public class NarcissisticNumAns {
    public static void main(String[] args) {
		for (int n = 100;  n <= 999;  n++) {
			int i = n / 100;
	  		int j = n / 10 % 10;
			int k = n % 10;
			if (n == i * i * i + j * j * j + k * k * k) {
				System.out.print(n + "  ");
			}
		}
		System.out.println();
	}

}