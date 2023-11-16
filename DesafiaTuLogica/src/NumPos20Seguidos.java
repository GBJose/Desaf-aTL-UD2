
//problema 2
import java.util.Scanner;

public class NumPos20Seguidos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num=0;
		
		
		do {
			System.out.println("introduzca un numero");
			num = sc.nextInt();
			
				if(num<0) {
				System.out.println("el numero es negativo por tanto no es valido");
				}
				
			}while(num<0);
		
		for (int i=1; i<=20;i++) {
			num ++;
			System.out.println(num);
		}


		sc.close();
	}

}
