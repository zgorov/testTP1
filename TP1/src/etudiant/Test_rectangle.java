package etudiant;

import java.util.Scanner;

public class Test_rectangle {
	public static void main(String[]arg) {
		Rectangle r = new Rectangle();
		
		Scanner sc= new Scanner(System.in);
		System.out.println("entrer la longeur");
		r.a=sc.nextInt();
		System.out.println("entrer la largeur");
		r.b=sc.nextInt();
		System.out.println("La surface est "+r.surface());
	}

		
}
