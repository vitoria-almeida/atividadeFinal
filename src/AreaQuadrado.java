import java.util.Scanner;

public class AreaQuadrado {
    Scanner ler = new Scanner(System.in);

    public void calcularAreaQuadrado() {
        int comprimento;
        int largura;

        System.out.printf("Comprimento: ");
        comprimento = ler.nextInt();
        System.out.println("Largura: ");
        largura = ler.nextInt();

        double calculo = Calculadora.multiplicacao(comprimento, largura);
        System.out.println("A área do quadrado é: " + calculo);
    }
}
