import java.util.Scanner;
public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		
		System.out.println("Inserta el primer número");
		int n1 = a.nextInt();
		
		System.out.println("Inserta el segundo número");
		int n2 = a.nextInt();
		
		System.out.println("Inserta el tercer número");
		int n3 = a.nextInt();
		
		System.out.println("El menor es:");
		
		if (n1 <= n2 && n1 <= n3) {
			System.out.println(n1);
		}else {
			if (n2 <= n1 && n2 <= n3) {
				System.out.println(n2);
			}else {
				System.out.println(n3);
			}
		}
		
		
	}

}
