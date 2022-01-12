package prob5;

public class Prob5 {

	public static void main(String[] args) {
		String[] decision;
		for (int i = 1; i <= 99; i++) {
			int multiple = 0;
			decision = Integer.toString(i).split("");
			for (int j = 0; j < decision.length; j++) {
				if (decision[j].equals("3") || decision[j].equals("6") || decision[j].equals("9")) {
					multiple++;
					System.out.print(i + " ");
					for (int k = 0; k < multiple; k++) {
						System.out.print("짝");
					}
					System.out.println("");
				}
			}
		}
	}
}
