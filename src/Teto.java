import java.util.Scanner;

public class Teto {
    Scanner scanner = new Scanner(System.in);  

    public void calcularTeto() {  
        double num;
        
        System.out.printf("Digite um número real para saber o teto: ");
        num = scanner.nextDouble();
        double resultado = Calculadora.teto(num);
        System.out.println("O teto do número " + (resultado));
    }
} 