package praticaIntegradora4.exercicio1;

public class PraticaExecoes {

    public static void main(String[] args) {

        int a = 0;
        int b = 300;

        try {
            int razao = b/a;
            System.out.println("Resultado: " + razao);
        } catch (ArithmeticException e) {
            throw new IllegalArgumentException("Não pode ser dividido por zero");
        } finally {
            System.out.println("Programa finalizado");
        }
    }
}
