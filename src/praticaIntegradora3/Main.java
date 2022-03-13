package praticaIntegradora3;

public class Main {

    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Vitor");
        pessoa1.setAltura(180);
        pessoa1.setIdade(29);
        pessoa1.setId("xxx");
        pessoa1.setPeso(80);

        Pessoa pessoa2 = new Pessoa("Diana", 5, "fff");

        Pessoa pessoa3 = new Pessoa("Juliana", 29, "yyy", 60,1.59);

//        Pessoa pessoa4 = new Pessoa("Suzi", 27);

        int imc = pessoa3.calcularIMC(60, 1.59);
        if (imc == -1) {
            System.out.println(pessoa3.getNome() + " você está abaixo do peso");
        } else if (imc == 0) {
            System.out.println(pessoa3.getNome() + " você está com o peso saudável");
        } else {
            System.out.println(pessoa3.getNome() + " você está sobrepeso");
        }

        boolean ehMaiorIdade = pessoa3.ehMaiorIdade(29);
        if (ehMaiorIdade) {
            System.out.println(pessoa3.getNome() + " você é maior de idade");
        } else {
            System.out.println(pessoa3.getNome() + " você é menor de idade");
        }

        System.out.println(pessoa3.toString());

    }
}
