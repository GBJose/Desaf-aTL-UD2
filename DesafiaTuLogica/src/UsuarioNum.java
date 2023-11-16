
// problema 4
import java.util.Scanner;
public class UsuarioNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,num3,temp;
		String order;
		
		  Scanner sc = new Scanner(System.in);
	        System.out.println("Ingrese 3 números: ");
	        num1 = sc.nextInt();
	        num2 = sc.nextInt();
	        num3 = sc.nextInt();

	        System.out.println("¿Qué orden deseas? (ascendente/descendente)");
	        order = sc.next();
	        
	        	switch(order){
		        	case ("ascendente"):
		        		
			            if (num1 > num2) {
			                temp = num1;
			                num1 = num2;
			                num2 = temp;
			            }
		        		if (num1 > num3) {
			                temp = num1;
			                num1 = num3;
			                num3 = temp;
			            }
		        		if (num2 > num3) {
			                temp = num2;
			                num2 = num3;
			                num3 = temp;
			            }
			            
			            System.out.println("Los números en orden son:");
			            System.out.println(num1);
			            System.out.println(num2);
			            System.out.println(num3);
		            break;
		        	case ("descendente"):
		        	 
			            if (num1 < num2) {
			                temp = num1;
			                num1 = num2;
			                num2 = temp;
			            }
			            if (num1 < num3) {
			                temp = num1;
			                num1 = num3;
			                num3 = temp;
			            }
			            if (num2 < num3) {
			                temp = num2;
			                num2 = num3;
			                num3 = temp;
			            }
			            System.out.println("Los números en orden son:");
			            System.out.println(num1);
			            System.out.println(num2);
			            System.out.println(num3);
			            break;
			            
			            default:
			            	System.out.println("Orden no válido.");
	        	}	
	  
	        
	     sc.close();
	        
	}

}