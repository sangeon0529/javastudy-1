package prob5;

import java.util.Random;
import java.util.Scanner;

public class Prob5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		total : while (true){
			int max = 100;
			int min = 0;
			Random r = new Random();
			int k = r.nextInt(100) + 1;
			System.out.println("수를 결정하였습니다. 맞추어 보세요. \n"+min+"-"+max);
			while (true) {
				int answer = scanner.nextInt();
				if (answer < k) {
					System.out.println("더 높게\n"+answer+"-"+max);
					min = answer;
				}else if (answer > k) {
					System.out.println("더 낮게\n"+min+"-"+answer);
				}else {
					System.out.println("맞았습니다.\n다시하시겠습니까(y/n)");
					String respon = scanner.next();
					if (respon.equals("y")) break;
					else break total;
				}
				}
			}
	scanner.close();	
	}

	}


