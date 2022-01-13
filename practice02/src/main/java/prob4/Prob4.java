package prob4;

import java.util.ArrayList;

public class Prob4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printCharArray(reverse("HIasdfdfda!"));
		System.out.println("adf");
		
	}
	public static char[] reverse(String  str) {
		ArrayList<String> result;
		String [] str2 = str.split("");
		for (int i = str2.length-1 ; i<=0; i-- ) {
			result.add(str2[i]);
		}
		return result.toArray(new String [result.size()]);
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
