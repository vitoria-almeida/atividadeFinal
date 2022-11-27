import java.util.Scanner;

public class seno {
    Scanner scanner = new Scanner(System.in);  

    public void seno() {  
        
        double num;
      
        System.out.println("Digite um número para saber seu seno:  ");
        num = scanner.nextDouble();
        System.out.println("O seno do número " + num +" é: " + Calculadora.seno(num));
    }

}  
