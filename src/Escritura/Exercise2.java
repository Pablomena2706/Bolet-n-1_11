package Escritura;

public class Exercise2 {

	public static void main(String[] args) {
		int x = 10;
		int y = -10;
		float n = 13.269834f;
		String cad = "Ana";

		System.out.printf("%d", x);
		System.out.printf("\n%+d", x);
		System.out.printf("\n%+d", y);
		System.out.printf("\n%.2f", n);
		System.out.printf("\n%+.4f", n);
		System.out.printf("\n%.5f", n);
		System.out.printf("\n%+010.3f", n);
		System.out.printf("\nn=%.2f x=%d", n, x);
		System.out.printf("\n%10s", cad);
		System.out.printf("%s", cad);
		System.out.printf("%5s", cad);

	}

}
