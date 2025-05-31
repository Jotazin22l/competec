/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		int y = 1;
	 int somaTotal = 10;
	 
	 while(y <= 100) {
	     
	 	System.out.println(somaTotal * y + " ");
	 	y++;
	 }
	}
}




/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	int numeros[]= {1, 4, 69};
	int garotinho = numeros[0] + numeros[1] + numeros[2];
	System.out.println("O resultado é "+ garotinho);
	
	
	
	
	}
}



/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Defina o tamanho da lista ");
		int  garotinho = scan.nextInt();
        int valores [ ] = new int [garotinho];
        for(int i = 0; i < valores.length; i++){
        System.out.println("Digite um numero: ");
            valores[i] = scan.nextInt( );
        }
        
        for(int i = 0; i < valores.length; i++){
            System.out.print(valores[i] + " ");
        }
        
        
}
}
