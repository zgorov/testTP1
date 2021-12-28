package etudiant;

import java.util.Scanner;

public class TestSomme {
	public static void main(String[]args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("entrer les nbrs");
		int x=sc.nextInt();
		int y=sc.nextInt();
		Somme s=new Somme(x,y);
		System.out.println("la somme est "+s.sum());
		
	}

}
