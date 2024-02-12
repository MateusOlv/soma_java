package soma;

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		int x, y;
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		y = sc.nextInt();
		System.out.printf("A soma de X e Y é igual a: %d", x + y );
		sc.close();
	}

}
