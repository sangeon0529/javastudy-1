package prob1;

import java.util.Scanner;

public class Prob1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("금액: ");
		int money = scanner.nextInt();
		int [] bill = {50000,10000,5000,1000,500,100,50,10,5,1};
		
		for (int i : bill) {
			int num = money/i;
			System.out.println(i +"원 : " + num + "개");
			money = money - i * num;
		}
		
		scanner.close();
	}

}
