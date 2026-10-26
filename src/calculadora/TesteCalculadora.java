package calculadora;

public class TesteCalculadora {

    private static int aprovados = 0;
    private static int reprovados = 0;

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        testar(calc, "Soma",              2, 3, "+", 5);
        testar(calc, "Subtração",        10, 4, "-", 6);
        testar(calc, "Multiplicação",     3, 5, "*", 15);
        testar(calc, "Divisão",           8, 2, "/", 4);
        testar(calc, "Divisão por zero",  8, 0, "/", 0);
        testar(calc, "Operação inválida", 5, 5, "x", 0);

        System.out.println("Aprovados: " + aprovados + " | Reprovados: " + reprovados);
    }

    private static void testar(Calculadora calc, String nome, int a, int b, String op, int esperado) {
        System.out.println("--- Teste: " + nome);
        System.out.println("Entrada : a=" + a + ", b=" + b + ", op=" + op);
        System.out.println("Esperado: " + esperado);
        int obtido = calc.calc(a, b, op);
        System.out.println("Obtido  : " + obtido);
        boolean ok = obtido == esperado;
        System.out.println("Status  : " + (ok ? "APROVADO" : "REPROVADO") + "\n");
        if (ok) { aprovados++; } else { reprovados++; }
    }
}
