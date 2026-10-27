package calculadora;

public class TesteCalculadora {

    private static int aprovados = 0;
    private static int reprovados = 0;

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

    private static void testarResultado(Calculadora calc, String nome, int a, int b, String op, int esperado) {
        System.out.println("--- Teste: " + nome);
        System.out.println("Entrada : a=" + a + ", b=" + b + ", operador=" + op);
        System.out.println("Esperado: " + esperado);
        int obtido = calc.calcular(a, b, op);
        System.out.println("Obtido  : " + obtido);
        registrar(obtido == esperado);
    }

    private static void testarErro(Calculadora calc, String nome, int a, int b, String op, String mensagemEsperada) {
        System.out.println("--- Teste: " + nome);
        System.out.println("Entrada : a=" + a + ", b=" + b + ", operador=" + op);
        System.out.println("Esperado: exceção com a mensagem \"" + mensagemEsperada + "\"");
        try {
            int obtido = calc.calcular(a, b, op);
            System.out.println("Obtido  : sem exceção, retornou " + obtido);
            registrar(false);
        } catch (IllegalArgumentException e) {
            System.out.println("Obtido  : exceção com a mensagem \"" + e.getMessage() + "\"");
            registrar(mensagemEsperada.equals(e.getMessage()));
        }
    }

    private static void registrar(boolean ok) {
        System.out.println("Status  : " + (ok ? "APROVADO" : "REPROVADO") + "\n");
        if (ok) { aprovados++; } else { reprovados++; }
    }
}