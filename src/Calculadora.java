public class Calculadora {
  
  public double soma(double numeroA, double numeroB) {
    return numeroA + numeroB;
  }

  public double subtracao(double numeroA, double numeroB) {
    return numeroA - numeroB;
  
  }
  public static double divisao(double numeroA, double numeroB) {
    return numeroA / numeroB;
  }

  public static double multiplicacao(double numeroA, double numeroB) {
    return numeroA * numeroB;
  } 

  public static double seno(double numeroA) {
    return  Math.sin(numeroA);
  }

  public static double raizQuadrada(int numeroA) {
    return Math.sqrt(numeroA);
  }
}