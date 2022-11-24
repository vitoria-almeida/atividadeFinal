import java.util.Scanner;

public class IMC {  
    Scanner ler = new Scanner(System.in);  

    public void calcularIMC() {  
        int peso;
        double altura;
        
        System.out.printf("Informe o peso: ");
        peso = ler.nextInt();
        System.out.printf("Informe a altura em metros: ");
        altura = ler.nextDouble();

        double calculo = Calculadora.multiplicacao(altura, altura);
        double resultado = Calculadora.divisao(peso, calculo);

        System.out.println("IMC: " + (Math. round(resultado)));
    }    
}  