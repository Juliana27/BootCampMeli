package praticaIntegradora4;

public class PraticaExecoes {

    public static void main(String[] args) {

        int a = 0;
        int b = 300;

        try {
            int razao = b/a;
            System.out.println("Resultado: " + razao);
            System.out.println("Programa finalizado");
        } catch (ArithmeticException e) {
            System.out.println("Ocorreu um erro");
            System.out.println("Programa finalizado");
        }
    }
}
