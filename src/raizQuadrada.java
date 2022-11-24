import java.util.Scanner;


public class raizQuadrada {
    Scanner scanner = new Scanner(System.in);  

    public void resulRaizQuadrada() {  
        
        int num;
        
        System.out.println("Digite um número inteiro para saber sua raiz quadrada:  ");
        num = scanner.nextInt();
        System.out.println("A raiz quadrada do número " + num +" é: " + Calculadora.raizQuadrada(num));
    }

}  
