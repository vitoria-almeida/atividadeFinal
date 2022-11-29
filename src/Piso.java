import java.util.Scanner;

public class Piso {
    Scanner scanner = new Scanner(System.in);  

    public void calcularPiso() {  
        
        double num;
        
        System.out.printf("Digite um número real para saber o piso:  ");
        num = scanner.nextDouble();
        //double resultado = Calculadora.piso(num);
        System.out.println("o piso do número " + num +" é: " + Calculadora.piso(num));
    }

} 