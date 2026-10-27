package calculadora;

/**
 * Codigo que irá testar a Calculadora.
 * Para cada teste, mostra na tela o que foi enviado e o que
 * devia dar e o que realmente resultou. No final,
 * mostra quantos testes foram positivos e quantos foram negativos.
 *
 * @author Vinicius Teixeira Melo
 * @version 1.0
 */
public class TesteCalculadora {

    /** Guarda quantos testes deram certo. */
    private static int aprovados = 0;

    /** Guarda quantos testes deram errado. */
    private static int reprovados = 0;

    /**
     * Ínicio do programa. Roda os seis testes:
     * as quatro contas, a divisão por zero e um operador inválido.
     *
     * @param args argumentos da linha de comando 
     */
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        testarResultado(calc, "Soma",          2, 3, "+", 5);
        testarResultado(calc, "Subtração",    10, 4, "-", 6);
        testarResultado(calc, "Multiplicação", 3, 5, "*", 15);
        testarResultado(calc, "Divisão",       8, 2, "/", 4);

        testarErro(calc, "Divisão por zero",  8, 0, "/", "Divisão por zero não é permitida.");
        testarErro(calc, "Operação inválida", 5, 5, "x", "Operador inválido: x");

        System.out.println("Aprovados: " + aprovados + " | Reprovados: " + reprovados);
    }

    /**
     * Testa uma conta que deve dar certo e mostra se o resultado bateu.
     *
     * @param calc     a calculadora que vai ser testada
     * @param nome     nome do teste
     * @param a        primeiro número
     * @param b        segundo número
     * @param op       símbolo da conta
     * @param resultado esperado
     */
    private static void testarResultado(Calculadora calc, String nome, int a, int b, String op, int esperado) {
        System.out.println("--- Teste: " + nome);
        System.out.println("Entrada : a=" + a + ", b=" + b + ", operador=" + op);
        System.out.println("Esperado: " + esperado);
        int obtido = calc.calcular(a, b, op);
        System.out.println("Obtido  : " + obtido);
        registrar(obtido == esperado);
    }

    /**
     * Testa uma conta que deve dar errado e confere se a mensagem do erro é o que realmente aconteceu.
     *
     * @param calc             a calculadora que será testada
     * @param nome             nome do teste
     * @param a                primeiro número
     * @param b                segundo número
     * @param op               símbolo da conta
     * @param mensagemEsperada mensagem que o erro deve ter
     */
    private static void testarErro(Calculadora calc, String nome, int a, int b, String op, String mensagemEsperada) {
        System.out.println("--- Teste: " + nome);
        System.out.println("Entrada : a=" + a + ", b=" + b + ", operador=" + op);
        System.out.println("Esperado: exceção com a mensagem \"" + mensagemEsperada + "\"");
        try {
            int obtido = calc.calcular(a, b, op);
            // Se chegou aqui, a conta funcionou, mas devia ter dado erro
            System.out.println("Obtido  : sem exceção, retornou " + obtido);
            registrar(false);
        } catch (IllegalArgumentException e) {
            System.out.println("Obtido  : exceção com a mensagem \"" + e.getMessage() + "\"");
            registrar(mensagemEsperada.equals(e.getMessage()));
        }
    }

    /**
     * Mostra se o teste passou ou não e atualiza a contagem.
     *
     * @param ok true se o teste passou, false se falhou
     */
    private static void registrar(boolean ok) {
        System.out.println("Status  : " + (ok ? "APROVADO" : "REPROVADO") + "\n");
        if (ok) { aprovados++; } else { reprovados++; }
    }
}