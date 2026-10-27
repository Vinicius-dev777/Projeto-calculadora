package calculadora;

/**
 * É um codigo de uma calculadora simples para dar funcionamento ao aplicativo FinançApp.
 * Faz as quatro contas básicas com números inteiros: somar, subtrair,
 * multiplicar e dividir. Pode ser usada, por exemplo, para dividir um
 * churasco entre amigos ou somar os gastos da fatura no fim do mês.
 *
 * @author Vinicius Teixeira Melo
 * @version 1.0
 */
public class Calculadora {

    /**
     * Soma dois números.
     *
     * @param a primeiro número
     * @param b segundo número
     * @return a soma dos dois números
     */
    public int somar(int a, int b) {
        return a + b;
    }

    /**
     * Subtrai um número do outro.
     *
     * @param a número de onde se tira
     * @param b número que será tirado
     * @return o resultado de a menos b
     */
    public int subtrair(int a, int b) {
        return a - b;
    }

    /**
     * Multiplica dois números.
     *
     * @param a primeiro número
     * @param b segundo número
     * @return o resultado de a vezes b
     */
    public int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Divide um número pelo outro. 
     * 
     * @param a número que será dividido
     * @param b número pelo qual se divide
     * @return o resultado inteiro da divisão de a por b
     * @throws IllegalArgumentException se b for zero, pois não existe divisão por zero
     */
    public int dividir(int a, int b) {
        // Antes de dividir, confira se o divisor é zero
        if (b == 0) {
            throw new IllegalArgumentException("Divisão por zero não é permitida.");
        }
        return a / b;
    }

    /**
     * Escolhe a conta certa a partir do símbolo recebido e gera o resultado dela.
     *
     * @param a        primeiro número
     * @param b        segundo número
     * @param operador escolhido
     * @return o resultado da conta
     * @throws IllegalArgumentException se o símbolo não for nenhum dos quatro apresentados
     *                                  ou se a conta for uma divisão por zero
     */
    public int calcular(int a, int b, String operador) {
        // Cada símbolo chama o método da conta correspondente
        return switch (operador) {
            case "+" -> somar(a, b);
            case "-" -> subtrair(a, b);
            case "*" -> multiplicar(a, b);
            case "/" -> dividir(a, b);
            default -> throw new IllegalArgumentException("Operador inválido: " + operador);
        };
    }
}