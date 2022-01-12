package prob1;

import java.util.Scanner;

public class Prob1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("수를 입력하시오 : ");
		int number = sc.nextInt();
		String answer = null;

		if (number % 3 == 0)
			answer = "3의 배수입니다.";
		else
			answer = "3의 배수가 아닙니다";
		sc.close();
		System.out.println(answer);
	}

}
