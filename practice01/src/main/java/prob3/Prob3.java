package prob3;

import java.util.Scanner;

public class Prob3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int number = scanner.nextInt();
		int sol = 0;
		if (number % 2 != 0) {
			for (int i = 1; i <= number; i += 2) {
				sol += i;
			}
		} else {
			for (int i = 0; i <= number; i += 2) {
				sol += i;
			}
		}
		System.out.print("결과 값 :");
		System.out.println(sol);

		scanner.close();
	}
}
