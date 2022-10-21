
public class Jawaban3 {
	public static void main(String[] args) {
		int num = 23;
		boolean flag = false;
		for (int a = 2; a <= num / 2; ++a) {
		if (num % a == 0) {
			flag = true;
				break;
			}
		}
		if (!flag)
			System.out.println(num + " is a prime number.");
		else
			System.out.println(num + " is not a prime number.");
	}
}