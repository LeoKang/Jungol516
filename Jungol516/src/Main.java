import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double d1 = sc.nextDouble();
		double d2 = sc.nextDouble();
//		String c = sc.next();
//		char c = sc.next().charAt(0);
		//---------------------
		String str = sc.next();
		char c1 = str.charAt(0);
		
		
		sc.close();

//		System.out.println(d1);
//		System.out.println(d2);
//		System.out.println(c);

		System.out.printf("%.2f\n", d1);
		System.out.printf("%.2f\n", d2);
		System.out.println(c1);
	}

}
