public class IMC {
    
    public IMC(Calculadora calculadora) {
        this.calculadora = calculadora;
    }
    
    Calculadora calculadora;
 
    public void calcularIMC(int peso, int altura) {
        System.out.println(calculadora.divisao(peso, altura));
    } 
}  