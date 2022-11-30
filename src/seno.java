import java.util.Scanner;

public class seno {
    Scanner scanner = new Scanner(System.in);  

    public void resulSeno() {         
        double num;
      
        System.out.println("Digite um número para saber seu seno:  ");
        num = scanner.nextDouble();
        System.out.println("O do número " + num +" é: " + Calculadora.seno(num));
    }
}  
