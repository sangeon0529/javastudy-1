package prob4;


import java.util.Scanner;

public class Prob4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String answer = scanner.nextLine();
		printCharArray(reverse(answer));
		scanner.close();
		
	}
	public static char[] reverse(String  str) {
		char [] arr = str.toCharArray();
		char [] result = new char [arr.length];
		for (int i = 0 ; i < arr.length ; i++) {
			result[i] = arr[arr.length-1-i];
		}
		return result;
	}
//	-	문자열의 순서를 뒤집어서 char 배열로 리턴하는 메소드를 구현한다
//	-	예를 들어 “Hi!” 라는 문자열을 파라미터로 전달 하면 {‘!’, ‘i’, ‘H’ } 배열을 반환 한다.
//	-	
	public static void printCharArray(char[] array) {
		for (char i : array) {
			System.out.print(i);
		}
	}
//	-	char[]을 받아들여 출력한다.
//	-	{‘!’, ‘i’, ‘H’}   배열을 파라미터로 전달하면 다음과 같이 출력된다.
//	!iH

	
}
