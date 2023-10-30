package Calculadora;

public class Calculadora {
    public int subtraiInteiros(int n1, int n2) {
        return n1 - n2;
    }

    public int multiplicaInteiros(int n1, int n2) {
        return n1 * n2;
    }

    public double divideInteiros(int n1, int n2) {
        if (n2 != 0) {
            return (double) n1 / n2;
        } else {
            System.out.println("Erro: Divisão por zero!");
            return Double.NaN;
        }
    }

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int resultadoSubtracao = calculadora.subtraiInteiros(10, 5);
        System.out.println("Subtração: " + resultadoSubtracao);

        int resultadoMultiplicacao = calculadora.multiplicaInteiros(6, 3);
        System.out.println("Multiplicação: " + resultadoMultiplicacao);

        double resultadoDivisao = calculadora.divideInteiros(8, 2);
        System.out.println("Divisão: " + resultadoDivisao);
    }
}
